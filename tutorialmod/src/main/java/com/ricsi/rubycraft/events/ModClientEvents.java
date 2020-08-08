package com.ricsi.rubycraft.events;

import com.ricsi.rubycraft.init.ModItems;
import com.ricsi.rubycraft.rubycraft;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = rubycraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onHeldItem(PlayerEvent.ItemPickupEvent event) {
        if (event.getStack().getItem() == ModItems.FROZEN_RUBY.get()) {
            event.getEntityLiving().addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10 * 20, 3));
        }
    }

    @SubscribeEvent
    public static void onKeyPressed(PlayerInteractEvent.RightClickItem event) {
    }
}
