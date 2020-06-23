package com.ricsi.rubycraft.items;

import com.ricsi.rubycraft.rubycraft;
import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.common.ToolType;


public class RubyPickaxe extends PickaxeItem {

    public RubyPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, 7, 10, builder
            .maxDamage(7)
            .group(rubycraft.TAB)
            .addToolType(ToolType.PICKAXE, 10)
            .maxStackSize(1)
            .defaultMaxDamage(6)
        );
    }
}
