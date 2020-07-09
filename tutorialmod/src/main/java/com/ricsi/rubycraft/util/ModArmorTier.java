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

    private ModArmorTier(
            int durabilityIn, int damageReductionAmountIn, float enchantabilityIn,
            SoundEvent soundEventIn, int toughnessIn, String NameIn, Supplier<Ingredient> repairMaterialIn) {
        this.Durability = durabilityIn;
        this.DamageReductionAmount = damageReductionAmountIn;
        this.Enchantability = (int) enchantabilityIn;
        this.SoundEvent = soundEventIn;
        this.Toughness = toughnessIn;
        this.Name = NameIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    public static ModArmorTier RubyArmorTier() {
        int Durability = 363;
        int DamageReductionAmount = 20;
        int Enchantability = 12;
        int Toughness = 2;
        SoundEvent soundEvent = SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
        String Name = "Ruby";

        Supplier<Ingredient> repairMaterial = createIngredientSupplier(RUBY.get());

        return new ModArmorTier(Durability, DamageReductionAmount, Enchantability, soundEvent, Toughness, Name, repairMaterial);
    }

    private static Supplier<Ingredient> createIngredientSupplier(Item item) {
        return () -> Ingredient.fromItems(item);
    }


    @Override
    public int getDurability(EquipmentSlotType slotType) {
        if (slotType.equals(EquipmentSlotType.FEET)) {
            return this.Durability - 100;
        }
        if (slotType.equals(EquipmentSlotType.HEAD)) {
            return this.Durability * 2;
        }

        return this.Durability;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotType) {
        if (slotType.equals(EquipmentSlotType.CHEST)) {
            return this.DamageReductionAmount + 5;
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
    public float getToughness() {
        return this.Toughness;
    }
}
