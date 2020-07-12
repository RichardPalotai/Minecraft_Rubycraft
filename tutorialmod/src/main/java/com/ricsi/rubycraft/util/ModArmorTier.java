package com.ricsi.rubycraft.util;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

import static com.ricsi.rubycraft.util.RegistryHandler.RUBY;

public class ModArmorTier implements IArmorMaterial {

    private final int Durability;
    private final int DamageReductionAmount;
    private final int Enchantability;
    private final int Toughness;
    private final String Name;
    private final LazyValue<Ingredient> repairMaterial;
    private SoundEvent SoundEvent;
    private final float knockbackResistance;

    private ModArmorTier(
            int durabilityIn, int damageReductionAmountIn, float enchantabilityIn,
            SoundEvent soundEventIn, int toughnessIn, String NameIn, Supplier<Ingredient> repairMaterialIn, float knockbackResistance) {
        this.Durability = durabilityIn;
        this.DamageReductionAmount = damageReductionAmountIn;
        this.Enchantability = (int) enchantabilityIn;
        this.SoundEvent = soundEventIn;
        this.Toughness = toughnessIn;
        this.Name = NameIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
        this.knockbackResistance = knockbackResistance;
    }

    public static ModArmorTier RubyArmorTier() {
        int Durability = 25;
        int DamageReductionAmount = 0;
        int Enchantability = 18;
        int Toughness = 1;
        float knockbackResistance = 0.0f;
        SoundEvent soundEvent = SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
        String Name = "rubycraft:ruby_armor";

        Supplier<Ingredient> repairMaterial = createIngredientSupplier(RUBY.get());

        return new ModArmorTier(Durability, DamageReductionAmount, Enchantability, soundEvent, Toughness, Name, repairMaterial, knockbackResistance);
    }

    private static Supplier<Ingredient> createIngredientSupplier(Item item) {
        return () -> Ingredient.fromItems(item);
    }


    @Override
    public int getDurability(EquipmentSlotType slotType) {
        if (slotType.equals(EquipmentSlotType.HEAD)) {
            return this.Durability * 11;
        }
        if (slotType.equals(EquipmentSlotType.CHEST)) {
            return this.Durability * 16;
        }
        if (slotType.equals(EquipmentSlotType.LEGS)) {
            return this.Durability * 15;
        }
        if (slotType.equals(EquipmentSlotType.FEET)) {
            return this.Durability * 13;
        }
        return this.Durability;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotType) {
        if (slotType.equals(EquipmentSlotType.HEAD)) {
            return this.DamageReductionAmount + 2;
        }
        if (slotType.equals(EquipmentSlotType.CHEST)) {
            return this.DamageReductionAmount + 6;
        }
        if (slotType.equals(EquipmentSlotType.LEGS)) {
            return this.DamageReductionAmount + 5;
        }
        if (slotType.equals(EquipmentSlotType.FEET)) {
            return this.DamageReductionAmount + 2;
        }
        return this.DamageReductionAmount;
    }


    @Override
    public int getEnchantability() {
        return this.Enchantability;
    }

    @Override
    public net.minecraft.util.SoundEvent getSoundEvent() {
        return SoundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public float getToughness() { return this.Toughness; }

    @Override
    public float func_230304_f_() {
        return this.knockbackResistance;
    }
}
