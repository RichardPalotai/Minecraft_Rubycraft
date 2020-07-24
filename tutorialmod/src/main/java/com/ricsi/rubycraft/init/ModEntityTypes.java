package com.ricsi.rubycraft.init;

import com.ricsi.rubycraft.entities.Giacomo;
import com.ricsi.rubycraft.rubycraft;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, rubycraft.MOD_ID);

    //Entities
    public static final RegistryObject<EntityType<Giacomo>> GIACOMO = ENTITY_TYPES.register("giacomo",
            () -> EntityType.Builder.create(Giacomo::new, EntityClassification.CREATURE)
                    .size(0.7f, 0.6f)
                    .build(new ResourceLocation("rubycraft", "giacomo").toString()));
}
