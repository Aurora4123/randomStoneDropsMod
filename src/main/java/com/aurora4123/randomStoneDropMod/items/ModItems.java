package com.aurora4123.randomStoneDropMod.items;

import com.aurora4123.randomStoneDropMod.RandomStoneDropMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RandomStoneDropMod.MODID);

    public static final RegistryObject<Item> WAY_STONE = ITEMS.register("way_stone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_LONG_SWORD = ITEMS.register("diamond_long_sword",
            () -> new SwordItem(Tiers.DIAMOND,5, -2.0F, new Item.Properties().durability(Tiers.DIAMOND.getUses())));

    public static final RegistryObject<Item> IRON_LONG_SWORD = ITEMS.register("iron_long_sword",
            () -> new SwordItem(Tiers.IRON,3, -2.0F, new Item.Properties().durability(Tiers.IRON.getUses())));
}
