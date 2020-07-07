package com.ricsi.rubycraft.items;

import com.ricsi.rubycraft.rubycraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class RubySword extends SwordItem {

    public RubySword() {
        super(RicskoModItemTier.RubyTier(), 2, -2.4f, new Item.Properties().group(rubycraft.TAB));
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
