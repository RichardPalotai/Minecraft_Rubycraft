package com.ricsi.rubycraft.items;

import com.ricsi.rubycraft.rubycraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class GoodApple extends Item {
    public GoodApple() {
        super(new Item.Properties()
                .food(new Food.Builder()
                .effect(new EffectInstance(
                        Effects.LUCK, 1200), 1.0f)
                .effect(new EffectInstance(
                        Effects.HERO_OF_THE_VILLAGE, 1200),  1.0f
                )
                .saturation(3.0f).build())
                .group(rubycraft.TAB));
    }
}
