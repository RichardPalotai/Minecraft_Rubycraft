package com.ricsi.rubycraft.Entities;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.controller.JumpController;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.JumpGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.ricsi.rubycraft.util.RegistryHandler.GIACOMO;

public class Giacomo extends AnimalEntity {
    private int jumpCount = 0;

    public Giacomo(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);
        this.setGrowingAge(50);
    }

    @Override
    public AgeableEntity createChild(AgeableEntity ageable) {
        Giacomo puppyGiacomo = new Giacomo(GIACOMO.get(), this.world);
        puppyGiacomo.onInitialSpawn(
                this.world, this.world.getDifficultyForLocation(new BlockPos(puppyGiacomo.getPositionVec())),
                SpawnReason.BREEDING, (ILivingEntityData) null, (CompoundNBT) null);
        jumpCount = 0;
        return puppyGiacomo;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new JumpGoal() {
            @Override
            public boolean shouldExecute() {
                return jumpCount < 10;
            }
        });
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0f));
    }

    @Override
    protected void jump() {
        super.jump();
        jumpCount++;
    }
}
