package com.ricsi.rubycraft.items;

import com.ricsi.rubycraft.rubycraft;
import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.TieredItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;


public class RubyPickaxe extends PickaxeItem {

    public RubyPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(new IItemTier() {
                  @Override
                  public int getMaxUses() {
                      return 0;
                  }

                  @Override
                  public float getEfficiency() {
                      return 0;
                  }

                  @Override
                  public float getAttackDamage() {
                      return 0;
                  }

                  @Override
                  public int getHarvestLevel() {
                      return 0;
                  }

                  @Override
                  public int getEnchantability() {
                      return 0;
                  }

                  @Override
                  public Ingredient getRepairMaterial() {
                      return null;
                  }
              }, 8, 8,
                new Properties()
                        .addToolType(ToolType.PICKAXE, 5)
                        .group(rubycraft.TAB)
        );
    }
}