package com.ricsi.rubycraft.items.tools;

import com.ricsi.rubycraft.util.RicskoModItemTier;
import com.ricsi.rubycraft.rubycraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.TieredItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;
import javax.annotation.Nullable;
import java.util.List;

public class RubyPickaxe extends PickaxeItem {

    public RubyPickaxe() {
        super(
                RicskoModItemTier.RubyTier(),
                2,
                -2.8f,
                new Properties()
                        .group(rubycraft.TAB)
        );
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
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
