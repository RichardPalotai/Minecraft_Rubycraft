package com.ricsi.rubycraft.items.common;

import com.ricsi.rubycraft.rubycraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class FrozenRuby extends Item {

    public FrozenRuby() {
        super(new Item.Properties().group(rubycraft.TAB));
    }
}
