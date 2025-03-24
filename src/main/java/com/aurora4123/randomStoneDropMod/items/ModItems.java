package com.aurora4123.randomStoneDropMod.items;

import com.aurora4123.randomStoneDropMod.RandomStoneDropMod;
import com.aurora4123.randomStoneDropMod.Tiers.HammerTier;
import com.aurora4123.randomStoneDropMod.Tiers.ScytheTiers;
import com.aurora4123.randomStoneDropMod.items.combatItems.FireWandItem;
import com.aurora4123.randomStoneDropMod.items.combatItems.ScytheItem;
import com.aurora4123.randomStoneDropMod.items.functional.SetSpawnItem;
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

    public static final RegistryObject<Item> FIRE_WAND = ITEMS.register("fire_wand",
            () -> new FireWandItem(new Item.Properties()));

    public static final RegistryObject<Item> COOPER_SCYTHE = ITEMS.register("copper_scythe",
            () -> new ScytheItem(ScytheTiers.COPPER,4, -1.5f, new Item.Properties()));

    public static final RegistryObject<Item> IRON_SCYTHE = ITEMS.register("iron_scythe",
            () -> new ScytheItem(ScytheTiers.IRON,6, -1.5f, new Item.Properties()));

    public static final RegistryObject<Item> GOLD_SCYTHE = ITEMS.register("gold_scythe",
            () -> new ScytheItem(ScytheTiers.GOLD,5, -1.5f, new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe",
            () -> new ScytheItem(ScytheTiers.DIAMOND,6, -1.5f, new Item.Properties()));

    public static final RegistryObject<Item> BATTLE_HAMMER = ITEMS.register("battle_hammer",
            () -> new HammerItem(HammerTier.IRON, 5, -2.5f, new Item.Properties()));

//----------functional items----------
    public static final RegistryObject<Item> SPAWNPOINT_SETTER = ITEMS.register("spawnpoint_setter",
        () -> new SetSpawnItem(new Item.Properties()));
 }
