package com.ricsi.rubycraft.items;

import com.ricsi.rubycraft.rubycraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class EvilApple extends Item {
    public EvilApple() {
        super(new Item.Properties()
                .food(new Food.Builder()
                        .saturation(3.0f)
                        .effect(new EffectInstance(
                                Effects.GLOWING, 1200
                        ), 1.0f)
                        .effect(new EffectInstance(
                                Effects.BAD_OMEN, 1200
                        ), 1.0f)
                        .build())
                .group(rubycraft.TAB));
    }
}
