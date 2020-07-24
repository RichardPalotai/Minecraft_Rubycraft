package com.ricsi.rubycraft.items.armors;

import com.ricsi.rubycraft.rubycraft;
import com.ricsi.rubycraft.util.enums.ModArmorTier;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class RubyChestplate extends ArmorItem {

    public RubyChestplate() {
        super(ModArmorTier.RubyArmorTier(), EquipmentSlotType.CHEST, new Properties().group(rubycraft.TAB));
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
