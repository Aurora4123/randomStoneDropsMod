package com.aurora4123.randomStoneDropMod.items.combatItems;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class ScytheItem extends SwordItem {
    public ScytheItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack pStack, @NotNull LivingEntity pTarget, @NotNull LivingEntity pOwner) {
        if(!pOwner.level().isClientSide()) {
            double knockbackStrength = 1.7;
            Vec3 konckback = pOwner.getLookAngle().scale(knockbackStrength);
            pTarget.push(konckback.x, 0.2, konckback.z);
            pTarget.hurtMarked = true;
        }
        return super.hurtEnemy(pStack, pTarget, pOwner);
    }
}
