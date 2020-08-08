package com.ricsi.rubycraft.items.common;

import com.ricsi.rubycraft.init.ModItems;
import com.ricsi.rubycraft.rubycraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class FrozenRuby extends Item {
    private int durability = 5;

    public FrozenRuby() {
        super(new Item.Properties().group(rubycraft.TAB).maxDamage(2));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        this.durability--;
        System.out.println("durabilty:" + durability);
        if (this.durability == 0) {
            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.RUBY::get));
            System.out.println("Adding ruby stack");
            this.getDefaultInstance().setCount(this.getDefaultInstance().getCount()-1);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public double getDurabilityForDisplay(ItemStack stack) {
        return durability/5;
    }

    @Override
    public boolean showDurabilityBar(ItemStack stack) {
        if (this.durability < 5) {
            return true;
        }
        return false;
    }
}
