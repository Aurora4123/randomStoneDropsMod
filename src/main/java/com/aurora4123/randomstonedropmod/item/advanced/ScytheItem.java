package com.aurora4123.randomstonedropmod.item.advanced;

import com.aurora4123.randomstonedropmod.tiers.ScytheTiers;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class ScytheItem extends SwordItem {
    private final ScytheTiers tier;
    public ScytheItem(ScytheTiers pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
        this.tier = pTier;
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack pStack, @NotNull LivingEntity pTarget, @NotNull LivingEntity pOwner) {
        if(!pOwner.level.isClientSide()) {
            Vec3 konckback = pOwner.getLookAngle().scale(tier.getKonckbackBonus() - 0.1);
            pTarget.push(konckback.x, 0.2, konckback.z);
            pTarget.hurtMarked = true;
        }
        return super.hurtEnemy(pStack, pTarget, pOwner);
    }
}
