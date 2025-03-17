package com.aurora4123.randomStoneDropMod.items;

import com.aurora4123.randomStoneDropMod.RandomStoneDropMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RandomStoneDropMod.MODID);

    public static final RegistryObject<Item> WAY_STONE = ITEMS.register("way_stone",
            () -> new Item(new Item.Properties()));
}
