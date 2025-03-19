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
//----------ingredients----------
    public static final RegistryObject<Item> WAY_STONE = ITEMS.register("way_stone",
            () -> new Item(new Item.Properties()));

//----------combat items----------
    public static final RegistryObject<Item> NETHERITE_LONG_SWORD = ITEMS.register("netherite_long_sword",
            () -> new SwordItem(Tiers.NETHERITE, 8, -2.0F, new Item.Properties().durability(Tiers.NETHERITE.getUses())));

    public static final RegistryObject<Item> DIAMOND_LONG_SWORD = ITEMS.register("diamond_long_sword",
            () -> new SwordItem(Tiers.DIAMOND, 7, -2.0F, new Item.Properties().durability(Tiers.DIAMOND.getUses())));

    public static final RegistryObject<Item> IRON_LONG_SWORD = ITEMS.register("iron_long_sword",
            () -> new SwordItem(Tiers.IRON, 6, -2.0F, new Item.Properties().durability(Tiers.IRON.getUses())));

    public static final RegistryObject<Item> STONE_LONG_SWORD = ITEMS.register("stone_long_sword",
            () -> new SwordItem(Tiers.STONE, 5, -2.0F, new Item.Properties().durability(Tiers.STONE.getUses())));

    public static final RegistryObject<Item> WOODEN_LONG_SWORD = ITEMS.register("wooden_long_sword",
            () -> new SwordItem(Tiers.WOOD, 4, -2.0F, new Item.Properties().durability(Tiers.WOOD.getUses())));

    public static final RegistryObject<Item> GOLDEN_LONG_SWORD = ITEMS.register("golden_long_sword",
            () -> new SwordItem(Tiers.GOLD, 4, -2.0F, new Item.Properties().durability(Tiers.GOLD.getUses())));
 }
