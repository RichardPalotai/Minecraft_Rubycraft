package com.ricsi.rubycraft.items.common;

import com.ricsi.rubycraft.rubycraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

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
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        tooltip.add(new StringTextComponent("Punishes bad persons!"));
    }
}
