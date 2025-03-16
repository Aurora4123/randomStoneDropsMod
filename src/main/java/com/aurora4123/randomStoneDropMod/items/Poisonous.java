package com.aurora4123.randomStoneDropMod.items;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class Poisonous extends Item {
    public Poisonous() {
        super(new Item.Properties().
                food(new FoodProperties.Builder()
                        .nutrition(2)
                        .saturationMod(0.6F)
                        .effect(() -> new MobEffectInstance(MobEffects.POISON, 300, 0),
                                1.0F).effect(
                                () -> new MobEffectInstance(MobEffects.CONFUSION, 600, 0),
                                1.0F
                        ).build()));
    }
}
