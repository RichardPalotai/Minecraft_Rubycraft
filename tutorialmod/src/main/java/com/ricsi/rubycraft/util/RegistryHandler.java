package com.ricsi.rubycraft.util;

import com.ricsi.rubycraft.blocks.FrozenRubyOre;
import com.ricsi.rubycraft.blocks.RubyOre;
import com.ricsi.rubycraft.items.*;
import com.ricsi.rubycraft.items.armors.RubyBoots;
import com.ricsi.rubycraft.items.armors.RubyChestplate;
import com.ricsi.rubycraft.items.armors.RubyHelmet;
import com.ricsi.rubycraft.items.armors.RubyLeggings;
import com.ricsi.rubycraft.items.tools.RainRod;
import com.ricsi.rubycraft.items.tools.RubyPickaxe;
import com.ricsi.rubycraft.items.tools.RubySword;
import com.ricsi.rubycraft.items.tools.RubyAxe;
import com.ricsi.rubycraft.items.tools.RubyHoe;
import com.ricsi.rubycraft.items.tools.RubyShovel;
import com.ricsi.rubycraft.rubycraft;
import com.ricsi.rubycraft.blocks.BlockItemBase;
import com.ricsi.rubycraft.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, rubycraft.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, rubycraft.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", Ruby::new);
    public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("ruby_shard", RubyShard::new);
    public static final RegistryObject<Item> FROZEN_RUBY = ITEMS.register("frozen_ruby", FrozenRuby::new);
    public static final RegistryObject<Item> EVIL_APPLE = ITEMS.register("evil_apple", EvilApple::new);
    public static final RegistryObject<Item> GOOD_APPLE = ITEMS.register("good_apple", GoodApple::new);

    // Armors
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", RubyHelmet::new);
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", RubyChestplate::new);
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", RubyLeggings::new);
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", RubyBoots::new);


    // Tools
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", RubySword::new);
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", RubyPickaxe::new);
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", RubyAxe::new);
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", RubyShovel::new);
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", RubyHoe::new);
    public static final RegistryObject<Item> RAIN_ROD = ITEMS.register("rain_rod", RainRod::new);

    // Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> FROZEN_RUBY_ORE = BLOCKS.register("frozen_ruby_ore", FrozenRubyOre::new);

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
    public static final RegistryObject<Item> FROZEN_RUBY_ORE_ITEM = ITEMS.register("frozen_ruby_ore", () -> new BlockItemBase(FROZEN_RUBY_ORE.get()));

}


