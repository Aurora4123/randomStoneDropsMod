package com.aurora4123.randomstonedropmod.tiers;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum HammerTier implements Tier {
    IRON(350, 3.0F, 4.0F, 3, 15, () -> Ingredient.of(Items.IRON_INGOT), 1.0);

    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int level;
    private final int enchantmentValue;
    private final Lazy<Ingredient> repair;
    private final double knockbackBonusMultiplier;

    HammerTier(int uses, float speed, float attackDamageBonus, int level, int enchantmentValue, Supplier<Ingredient> repair, double knockbackBonusMultiplier){

        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.level = level;
        this.enchantmentValue = enchantmentValue;
        this.repair = Lazy.of(repair);
        this.knockbackBonusMultiplier = knockbackBonusMultiplier;
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return repair.get();
    }

    public double getKnockbackBonusMultiplier() {
        return knockbackBonusMultiplier;
    }
}
