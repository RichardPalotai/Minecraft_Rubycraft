package com.ricsi.rubycraft.events;

import com.ricsi.rubycraft.entities.Giacomo;
import com.ricsi.rubycraft.init.ModEntityTypes;
import com.ricsi.rubycraft.init.ModItems;
import com.ricsi.rubycraft.rubycraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
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

    @SubscribeEvent
    public static void onEntityKill(LivingDeathEvent event) {
        Entity killedEntity = event.getEntity();
        System.out.println("Anything died");
        System.out.println(killedEntity.getClass().toString());
        if(killedEntity.getClass().equals(Giacomo.class)) {
            System.out.println("A Giacomo died");
            System.out.println(event.getSource()); // generic...
            System.out.println(event.getSource().getTrueSource()); //null
            System.out.println(event.getSource().getImmediateSource()); //null


//            .addPotionEffect(new EffectInstance(Effects.BAD_OMEN, 10 * 20, 2));
        }
    }
}
