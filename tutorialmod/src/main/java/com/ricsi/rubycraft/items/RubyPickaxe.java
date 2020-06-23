package com.ricsi.rubycraft.items;

import com.ricsi.rubycraft.rubycraft;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;


public class RubyPickaxe extends Item {

    public RubyPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(new Properties()
            .group(rubycraft.TAB)
            .addToolType(ToolType.PICKAXE, 10)
            .maxStackSize(1)
            .defaultMaxDamage(6)
                .maxDamage(7)
        );
    }
}
