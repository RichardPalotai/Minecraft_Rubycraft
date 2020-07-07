package com.ricsi.rubycraft.items.tools;

import com.ricsi.rubycraft.rubycraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;

import javax.annotation.Nullable;
import java.util.List;

import static com.ricsi.rubycraft.util.RegistryHandler.RUBY_BLOCK;

public class RainRod extends Item {
    private boolean isGlowing = false;
    private int effectCounter = 0;

    public RainRod() {
        super(new Item.Properties().group(rubycraft.TAB));
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return isGlowing;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        if (worldIn.rainingStrength > 0.0f) {
            worldIn.setRainStrength(0.0f);
            isGlowing = false;
        } else {
            worldIn.setRainStrength(10.0f);
            worldIn.setThunderStrength(10.0f);
            Dimension dim = worldIn.dimension;
            worldIn.setBlockState(playerIn.getPosition().add(3,3,3), RUBY_BLOCK.get().getDefaultState());


                    isGlowing = true;
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addPotionEffect(new EffectInstance(
                Effects.WEAKNESS, 1200));

        effectCounter++;
        if ( effectCounter > 4) {
            effectCounter = 0;
            target.addPotionEffect(new EffectInstance(
                    Effects.POISON, 1200, 10));
        }

        return super.hitEntity(stack, target, attacker);

    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        tooltip.add(new StringTextComponent("A mystical rod given by gods"));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
