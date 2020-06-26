package com.ricsi.rubycraft.items;

import com.ricsi.rubycraft.rubycraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;


public class RainRod extends Item {
    private boolean isGlowing = false;

    public RainRod() {
        super(new Item.Properties().group(rubycraft.TAB));
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return isGlowing;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (isGlowing) {
            worldIn.setRainStrength(0.0f);
            isGlowing = false;
        } else {
            worldIn.setRainStrength(1.0f);
            isGlowing = true;
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
