package com.ricsi.rubycraft.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FrozenRubyOre extends OreBlock {

    public FrozenRubyOre() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(6.0f, 6.0f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(3)
                .sound(SoundType.METAL)
        );
    }
}