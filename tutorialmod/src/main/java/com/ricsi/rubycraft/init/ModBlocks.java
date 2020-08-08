package com.ricsi.rubycraft.init;

import com.ricsi.rubycraft.blocks.*;
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
    public static final RegistryObject<Block> END_RUBY_ORE = BLOCKS.register("end_ruby_ore", EndRubyOre::new);
    public static final RegistryObject<Block> NETHER_RUBY_ORE = BLOCKS.register("nether_ruby_ore", NetherRubyOre::new);
    public static final RegistryObject<Block> FROZEN_RUBY_ORE = BLOCKS.register("frozen_ruby_ore", FrozenRubyOre::new);
    public static final RegistryObject<Block> OVEN = BLOCKS.register("oven", Oven::new);



}
