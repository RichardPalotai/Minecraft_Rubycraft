package com.ricsi.rubycraft.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

import static com.ricsi.rubycraft.util.RegistryHandler.RUBY;

public class RicskoModItemTier implements IItemTier // Itt latod, hogy a RicskoModItemTier osztaly implementalja ay IItemTier interfeszt
{
	// Az interface implementalasa azt jelenti, hogy az adott Interface definiciojaban leirt metodusok jelen vannak a sajat osztalyodon is
	// Az interface altal definialt metodusokat a vegen lathatod, ezek annotalva vannak az @Override megjelolessel.
	// Ez annyit jelent, hogy jelezve van a rendszernek es a fejlesztonek is, hogy ezek a fuggvenyek felulirjak az interface uresen hagyott metodusait
	
	// Definialjuk azokat a valtozokat (mezoket), amikkel majd az @Override-olt metodusok visszaternek:
   private final int harvestLevel;
   private final int maxUses;
   private final float efficiency;
   private final float attackDamage;
   private final int enchantability;
   private final LazyValue<Ingredient> repairMaterial;

   // Ez egy private konstruktor. Azert celszeru a private konstruktor, mert akkor nem tudsz osszevissza ertekeket megadni neki, hanem rendesen tudod meghatarozni az adott Tiert: 
   // Emiatt elrejtjuk kintrol nezve a konstruktort (lsd private) es majd egy a Properties.Builder-hez hasonlo megoldassal hozzuk letre a sajat Tierunket
   private RicskoModItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn,
                    Supplier<Ingredient> repairMaterialIn)
   {
	   // A konstruktoron belul az osztalyunkbol eppen letrehozott objektum valtozoinak (mezoinek) adunk erteket
	   // A bal oldalon az uj objektum (this) egyes mezoi, az egyenloseg jobb oldalan a konstruktor metodus zarojelben definialt parameterei vannak
      this.harvestLevel = harvestLevelIn;
      this.maxUses = maxUsesIn;
      this.efficiency = efficiencyIn;
      this.attackDamage = attackDamageIn;
      this.enchantability = enchantabilityIn;
      this.repairMaterial = new LazyValue<>(repairMaterialIn);
   }
   
   // Ez lesz a Builderhez hasonlo metodusunk. Lathatod, hogy o publikus es hogy egy RicskoModItemTiert ad vissza (epp mint a konstruktor)
   // Emellett meg egy static modositot latsz. Ennek az a celja, hogy ez a metodus ne az egyes letrehozott objektumokon letezzen (hisz azokat o hozza letre),
   // Hanem magan az osztalyon. Innentolt fogva ezt majd ugy tudod a kodban meghivni, hogy RicskoModItemTier.RubyTier(). Lathatod hogy ennek nincs is parametere
   public static RicskoModItemTier RubyTier() {
	   // Itt definialjuk az egyes valtozokat, amiket majd a private konstruktornak atadunk
	   // Ha egy uj sajat ItemTier-t szeretnel definialni, akkor eleg ezt a static buildert lemasolnod, megvaltoztatni a nevet (pl. ObsidianTier) es uj ertekeket adni a belsejeben
	   int harvestLevel =  3;
	   int maxUses =  1500;
	   float efficiency = 8.0f;
	   float attackDamage = 6.0f;
	   int enchantability = 12;
	   // Ez a valtozo egy kicsit trukkosebb, o ugyanis egy specialis fuggvenyt ker, ami megmondja hogyan valasszon az Itemek kozul, amikkel aztan javitani lehet ezt a targyat
	   // A RUBY.get() azt mondja meg, hgoy a Registry-dbe irt RUBY entry (azaz bejegyzés) belsejében tárolt objektumot használja
	   Supplier<Ingredient> repairMaterial = createIngredientSupplier(RUBY.get());
	   
	   // Ittt hivjuk meg a belso privat konstruktort a fent leirt ertekekkel
	   return new RicskoModItemTier(harvestLevel, maxUses, efficiency, attackDamage, enchantability, repairMaterial);
   }
   
   // Ez is egy privat, statikus fuggveny, aminek csak az a celja, hogyha egy uj Tiert szeretnel majd definialni, akkor konnyebb legyen
   private static Supplier<Ingredient> createIngredientSupplier(Item item) {
	   // Errol majd meselhetek, de meg bonyolult: roviden ez egy fuggveny jellegu valtozo ertek
	   return ()-> Ingredient.fromItems( item );
   }

   // Itt kezdodnek a IItemTier interface altal definialt fuggvenyek.
   // Lathatod hogy ezek egytol egyig valamelyik, az osztalyunkban definialt valtozo erteket adjak vissza.
   // Emellett mindegyik publikus es ugy van hivva, ahogyan a screenshoton, mert azt kerte az interface
   @Override
   public int getMaxUses() {
      return this.maxUses;
   }

   @Override
   public float getEfficiency() {
      return this.efficiency;
   }

   @Override
   public float getAttackDamage() {
      return this.attackDamage;
   }

   @Override
   public int getHarvestLevel() {
      return this.harvestLevel;
   }

   @Override
   public int getEnchantability() {
      return this.enchantability;
   }

   @Override
   @Nonnull
   public Ingredient getRepairMaterial() {
      return this.repairMaterial.getValue();
   }
}  