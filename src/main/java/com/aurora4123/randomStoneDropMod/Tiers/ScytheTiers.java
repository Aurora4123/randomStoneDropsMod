package com.aurora4123.randomStoneDropMod.Tiers;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ScytheTiers implements Tier {
    DIAMOND(1570, 6.0F, 4.0F, 3, 15, () -> Ingredient.of(Items.DIAMOND), 1.2),
    GOLD(32, 10.0F, 0.0F, 0, 22, () -> Ingredient.of(Items.GOLD_INGOT), 0.8),
    IRON(270, 5.0F, 2.0F, 3, 15, () -> Ingredient.of(Items.IRON_INGOT), 0.6),
    COPPER(100, 4.0F, 2.0F, 0, 15, () -> Ingredient.of(Items.COPPER_INGOT), 0.4);
    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int level;
    private final int enchantmentValue;
    private final Lazy<Ingredient> repairIngredient;
    private final double konckbackBonus;

    ScytheTiers(int uses, float speed, float attackDamageBonus, int level, int enchantmentValue, Supplier<Ingredient> repairIngredient, double konckbackBonus) {
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.level = level;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = Lazy.of(repairIngredient);
        this.konckbackBonus = konckbackBonus;
    }

    public int getUses() {
        return uses;
    }

    public float getSpeed() {
        return speed;
    }

    public float getAttackDamageBonus() {
        return attackDamageBonus;
    }

    public int getLevel() {
        return level;
    }

    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }

    public double getKonckbackBonus() {
        return konckbackBonus;
    }
}
