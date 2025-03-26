package com.aurora4123.randomstonedropmod.item.advanced;


import com.aurora4123.randomstonedropmod.tiers.HammerTier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.NotNull;

public class HammerItem extends SwordItem {
    private final HammerTier tier;
    public HammerItem(HammerTier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
        this.tier = pTier;
    }


    @Override
    public boolean hurtEnemy(@NotNull ItemStack stack, @NotNull LivingEntity target, @NotNull LivingEntity attacker) {
        if(!attacker.level.isClientSide()) {
            applyKnockBack(target,attacker,tier);
        }
        stack.hurtAndBreak(1, attacker, (entity) -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        return true;
    }

    @Override
    public boolean canPerformAction(@NotNull ItemStack stack, @NotNull ToolAction toolAction) {
        return !super.canPerformAction(stack, toolAction);
    }

    private void applyKnockBack(LivingEntity target, LivingEntity attacker, HammerTier tier) {
        Vec3 knockback = attacker.getLookAngle().scale(tier.getKnockbackBonusMultiplier() * 2.0);
        target.push(knockback.x, 0.15D, knockback.z);
        target.hurtMarked = true;
    }
}
