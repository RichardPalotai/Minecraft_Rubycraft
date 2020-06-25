package com.ricsi.rubycraft.items;

import com.ricsi.rubycraft.rubycraft;
import net.minecraft.item.PickaxeItem;


public class RubyPickaxe extends PickaxeItem {

    public RubyPickaxe() {
        super(
                RicskoModItemTier.RubyTier(),
                6,
                3.0f,
                new Properties()
                        .group(rubycraft.TAB)
        );
    }
}
