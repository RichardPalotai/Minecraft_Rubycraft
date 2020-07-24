package com.ricsi.rubycraft.init;

import com.ricsi.rubycraft.blocks.FrozenRubyOre;
import com.ricsi.rubycraft.blocks.Oven;
import com.ricsi.rubycraft.blocks.RubyBlock;
import com.ricsi.rubycraft.blocks.RubyOre;
import com.ricsi.rubycraft.rubycraft;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, rubycraft.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> FROZEN_RUBY_ORE = BLOCKS.register("frozen_ruby_ore", FrozenRubyOre::new);
    public static final RegistryObject<Block> OVEN = BLOCKS.register("oven", Oven::new);



}
