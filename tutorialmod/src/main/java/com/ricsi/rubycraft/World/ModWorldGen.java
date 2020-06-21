package com.ricsi.rubycraft.World;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

import static com.ricsi.rubycraft.util.RegistryHandler.BLOCKS;
import static com.ricsi.rubycraft.util.RegistryHandler.RUBY_ORE;

public class ModWorldGen {

    public static void setupOreGen() {
        for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                    .withConfiguration(
                            new OreFeatureConfig(
                                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    RUBY_ORE.get().getDefaultState(), 5))
//                    .withChance(1.0f)
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(15,0, 0, 75)))
            );
        }
    }
}
