package com.ricsi.rubycraft.util;

import com.ricsi.rubycraft.client.render.GiacomoRenderer;
import com.ricsi.rubycraft.init.ModEntityTypes;
import com.ricsi.rubycraft.rubycraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = rubycraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GIACOMO.get(), GiacomoRenderer::new);
    }
}
