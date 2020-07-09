package com.ricsi.rubycraft.World;

import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@SuppressWarnings("deprecation")
@Mod.EventBusSubscriber(modid = "rubycraft", bus = MOD)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onCommonSetup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(() -> {
            ModWorldGen.setupOreGen();
        });

    }
}
