package com.ricsi.rubycraft.items;

import com.ricsi.rubycraft.rubycraft;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;


public class RubyPickaxe extends Item {

    public RubyPickaxe() {
        super(new Properties()
        .group(rubycraft.TAB)
        .defaultMaxDamage(6)
        .addToolType(ToolType.PICKAXE, 5)
        );
    }
}
