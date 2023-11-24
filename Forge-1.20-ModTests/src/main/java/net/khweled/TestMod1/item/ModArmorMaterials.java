package net.khweled.TestMod1.item;

import net.khweled.TestMod1.TestMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    BRONZE("bronze", 33, new int[]{2,6,5,2}, 15, SoundEvents.ARMOR_EQUIP_IRON,
            0f, 0f, () -> Ingredient.of(ModItems.BRONZE_INGOT.get()) );

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngrident;
    private final static int[] BASE_DURABILITY = { 11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmmounts,
                      int enchantmentValue, SoundEvent equipSound, float toughness,
                      float knockbackResistance, Supplier<Ingredient> repairIngrident) {

        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmmounts = protectionAmmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngrident = repairIngrident;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngrident.get();
    }

    @Override
    public String getName() {
        return TestMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
