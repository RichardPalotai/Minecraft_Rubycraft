package com.ricsi.rubycraft.items;

import com.ricsi.rubycraft.rubycraft;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class RubyPickaxe extends Item {
    public RubyPickaxe() {
        super(new Properties()
                .addToolType(ToolType.PICKAXE, 2031)
                .group(rubycraft.TAB)
                .maxStackSize(1)
                .defaultMaxDamage(6)
                .maxDamage(7)
        );
    }
}
