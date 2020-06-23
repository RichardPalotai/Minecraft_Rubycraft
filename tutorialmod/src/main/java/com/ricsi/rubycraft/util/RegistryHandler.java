package com.ricsi.rubycraft.util;

import com.ricsi.rubycraft.items.EvilApple;
import com.ricsi.rubycraft.items.GoodApple;
import com.ricsi.rubycraft.items.RubyPickaxe;
import com.ricsi.rubycraft.rubycraft;
import com.ricsi.rubycraft.blocks.BlockItemBase;
import com.ricsi.rubycraft.blocks.*;
import com.ricsi.rubycraft.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
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
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> EVIL_APPLE = ITEMS.register("evil_apple", EvilApple::new);
    public static final RegistryObject<Item> GOOD_APPLE = ITEMS.register("good_apple", GoodApple::new);
    //public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", RubyPickaxe::new);
    public static final RegistryObject<PickaxeItem> ruby_pickaxe = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(RicskoModItemTier.RubyTier(), 1, -2.8F,
                    new Item.Properties().group(rubycraft.TAB)));

    // Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
}


