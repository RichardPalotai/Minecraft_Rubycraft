package com.ricsi.rubycraft.util;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

import static com.ricsi.rubycraft.util.RegistryHandler.RUBY;

   public class ModArmorTier implements IArmorMaterial {

    private final int Durability;
    private final int DamageReductionAmount;
    private final int Enchantability;
    private final float SoundEvent;
    private final int Toughness;
    private final String Name;
    private final LazyValue<Ingredient> repairMaterial;
       private SoundEvent soundEvent;

       private ModArmorTier(int durabilityIn, int damageReductionAmountIn, float enchantabilityIn, float soundEventIn, int toughnessIn, String NameIn, Supplier<Ingredient> repairMaterialIn)
    {
        this.Durability = durabilityIn;
        this.DamageReductionAmount = damageReductionAmountIn;
        this.Enchantability = (int) enchantabilityIn;
        this.SoundEvent = soundEventIn;
        this.Toughness = toughnessIn;
        this.Name = NameIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    public static ModArmorTier RubyArmorTier() {
        int Durability =  363;
        int DamageReductionAmount = 20;
        int Enchantability = 12;
        float SoundEvent = 1.0f;
        int Toughness = 2;
        String Name = new String();

        Supplier<Ingredient> repairMaterial = createIngredientSupplier(RUBY.get());

        return new ModArmorTier(Durability, DamageReductionAmount, Enchantability, SoundEvent, Toughness, Name, repairMaterial);
    }

    private static Supplier<Ingredient> createIngredientSupplier(Item item) {
        return ()-> Ingredient.fromItems( item );
    }



       @Override
       public int getDurability(EquipmentSlotType slotType) {return this.Durability;}

       @Override
       public int getDamageReductionAmount(EquipmentSlotType slotType) {return this.DamageReductionAmount;}


       @Override
    public int getEnchantability() {return this.Enchantability;}

    @Override
    public net.minecraft.util.SoundEvent getSoundEvent() {return soundEvent;}

    @Override
    public Ingredient getRepairMaterial() {return this.repairMaterial.getValue();}

       @Override
       public String getName() {return this.Name;}

       @Override
    public float getToughness() {return this.Toughness;}
}
