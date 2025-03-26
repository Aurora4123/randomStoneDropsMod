package com.aurora4123.randomstonedropmod.item.advanced;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class FireWandItem extends Item {

    public static final float SPEED = 1.5F;
    public static final double PARTICLE_RANGE = 1.0;

    public FireWandItem(Properties pProperties) {
        super(pProperties.stacksTo(1).durability(250));
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level world, Player player, @NotNull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if(!world.isClientSide()) {
            Vec3 look = player.getLookAngle();
            Vec3 target = player.getEyePosition()
                    .add(look.x * 0.5, look.y * 0.5, look.z * 0.5);
            SmallFireball fireball = new SmallFireball(world, player,
                    look.x * SPEED, look.y * SPEED, look.z * SPEED);
            fireball.setPos(target);
            fireball.setOwner(player);

            world.addFreshEntity(fireball);

            stack.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(hand));
        } else {
            spawnParticles(world, player);
        }
        player.playSound(SoundEvents.FIRECHARGE_USE, 1.0F, 1.0F);
        return InteractionResultHolder.success(stack);
    }

    @Override
    public boolean isValidRepairItem(@NotNull ItemStack tool, @NotNull ItemStack repair) {
        return repair.getItem() == Items.BLAZE_ROD;
    }

    public void spawnParticles(Level world, Player player) {
        Vec3 look = player.getLookAngle();
        Vec3 target = player.getEyePosition();

        for(int i = 0; i < 10; i++) {
            Vec3 particlePos = target.add(
                    look.x * i * PARTICLE_RANGE,
                    look.y * i * PARTICLE_RANGE,
                    look.z * i * PARTICLE_RANGE
            );
            world.addParticle(ParticleTypes.FLAME,
                    particlePos.x,
                    particlePos.y,
                    particlePos.z,
                    0, 0, 0);
        }
    }

}
