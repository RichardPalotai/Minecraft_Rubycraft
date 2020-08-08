package com.ricsi.rubycraft.init;

import com.ricsi.rubycraft.blocks.BlockItemBase;
import com.ricsi.rubycraft.items.armors.RubyBoots;
import com.ricsi.rubycraft.items.armors.RubyChestplate;
import com.ricsi.rubycraft.items.armors.RubyHelmet;
import com.ricsi.rubycraft.items.armors.RubyLeggings;
import com.ricsi.rubycraft.items.common.*;
import com.ricsi.rubycraft.items.tools.*;
import com.ricsi.rubycraft.rubycraft;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, rubycraft.MOD_ID);

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", Ruby::new);
    public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("ruby_shard", RubyShard::new);
    public static final RegistryObject<Item> FROZEN_RUBY = ITEMS.register("frozen_ruby", FrozenRuby::new);
    public static final RegistryObject<Item> EVIL_APPLE = ITEMS.register("evil_apple", EvilApple::new);
    public static final RegistryObject<Item> GOOD_APPLE = ITEMS.register("good_apple", GoodApple::new);

    //SpawnEggs
    public static final RegistryObject<SpawnEggItem> GIACOMO_SPAWN_EGG = ITEMS.register("giacomo_spawn_egg",
            ()-> new ModSpawnEggItem(ModEntityTypes.GIACOMO, 0xE7E4E4, 0xC6C6C6, new Item.Properties().group(rubycraft.TAB)));

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

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",
            () -> new BlockItemBase(ModBlocks.RUBY_BLOCK.get()));

    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore",
            () -> new BlockItemBase(ModBlocks.RUBY_ORE.get()));

    public static final RegistryObject<Item> FROZEN_RUBY_ORE_ITEM = ITEMS.register("frozen_ruby_ore",
            () -> new BlockItemBase(ModBlocks.FROZEN_RUBY_ORE.get()));

    public static final RegistryObject<Item> OVEN_ITEM = ITEMS.register("oven",
            () -> new BlockItemBase(ModBlocks.OVEN.get()));




}
