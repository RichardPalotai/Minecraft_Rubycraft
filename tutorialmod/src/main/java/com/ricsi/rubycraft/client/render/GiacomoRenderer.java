package com.ricsi.rubycraft.client.render;

import com.ricsi.rubycraft.client.model.GiacomoModel;
import com.ricsi.rubycraft.entities.Giacomo;
import com.ricsi.rubycraft.rubycraft;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GiacomoRenderer extends MobRenderer<Giacomo, GiacomoModel<Giacomo>> {

    protected static  final ResourceLocation TEXTURE = new ResourceLocation(rubycraft.MOD_ID, "textures/entity/giacomo.png");

    public GiacomoRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GiacomoModel<>(), 0.4f);
    }

    @Override
    public ResourceLocation getEntityTexture(Giacomo entity) {
        return TEXTURE;
    }
}
