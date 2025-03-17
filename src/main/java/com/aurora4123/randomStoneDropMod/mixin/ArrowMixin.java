package com.aurora4123.randomStoneDropMod.mixin;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;



@Mixin(AbstractArrow.class)
public abstract class ArrowMixin {
    @Inject(method = "onHitEntity", at = @At("TAIL"))
    public void onHitEntity(EntityHitResult pResult, CallbackInfo ci) {
        AbstractArrow arrow = (AbstractArrow) (Object) this;
        Level level = arrow.level();

        if(!level.isClientSide()) {

            Vec3 hitPos = pResult.getLocation();
            LightningBolt bolt = new LightningBolt(EntityType.LIGHTNING_BOLT, level);
            bolt.moveTo(hitPos.x, hitPos.y, hitPos.z);
            bolt.setVisualOnly(false);
            level.addFreshEntity(bolt);
        }
    }

}
