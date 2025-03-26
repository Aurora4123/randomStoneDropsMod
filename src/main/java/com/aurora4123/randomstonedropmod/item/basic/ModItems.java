package com.aurora4123.randomstonedropmod.item.basic;

import com.aurora4123.randomstonedropmod.RandomStoneDropMod;
import com.aurora4123.randomstonedropmod.creativetab.CreativeTabHandler;
import com.aurora4123.randomstonedropmod.item.advanced.FireWandItem;
import com.aurora4123.randomstonedropmod.item.advanced.HammerItem;
import com.aurora4123.randomstonedropmod.item.advanced.ScytheItem;
import com.aurora4123.randomstonedropmod.item.advanced.SetSpawnItem;
import com.aurora4123.randomstonedropmod.tiers.HammerTier;
import com.aurora4123.randomstonedropmod.tiers.ScytheTiers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RandomStoneDropMod.MODID);
    //---------items----------
    public static final RegistryObject<Item> WAY_STONE = ITEMS.register("way_stone",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).tab(CreativeTabHandler.MAIN_TAB)));

    public static final RegistryObject<Item> SPAWNPOINT_SETTER = ITEMS.register("spawnpoint_setter",
            () -> new SetSpawnItem(new Item.Properties().tab(CreativeTabHandler.MAIN_TAB)));
    //--------combat----------
    public static final RegistryObject<Item> NETHERITE_LONG_SWORD = ITEMS.register("netherite_long_sword",
            () -> new SwordItem(Tiers.NETHERITE, 8, -2.0F, new Item.Properties().durability(Tiers.NETHERITE.getUses()).tab(CreativeTabHandler.MAIN_TAB)));

    public static final RegistryObject<Item> DIAMOND_LONG_SWORD = ITEMS.register("diamond_long_sword",
            () -> new SwordItem(Tiers.DIAMOND, 7, -2.0F, new Item.Properties().durability(Tiers.DIAMOND.getUses()).tab(CreativeTabHandler.MAIN_TAB)));

    public static final RegistryObject<Item> IRON_LONG_SWORD = ITEMS.register("iron_long_sword",
            () -> new SwordItem(Tiers.IRON, 6, -2.0F, new Item.Properties().durability(Tiers.IRON.getUses()).tab(CreativeTabHandler.MAIN_TAB)));

    public static final RegistryObject<Item> STONE_LONG_SWORD = ITEMS.register("stone_long_sword",
            () -> new SwordItem(Tiers.STONE, 5, -2.0F, new Item.Properties().durability(Tiers.STONE.getUses()).tab(CreativeTabHandler.MAIN_TAB)));

    public static final RegistryObject<Item> WOODEN_LONG_SWORD = ITEMS.register("wooden_long_sword",
            () -> new SwordItem(Tiers.WOOD, 4, -2.0F, new Item.Properties().durability(Tiers.WOOD.getUses()).tab(CreativeTabHandler.MAIN_TAB)));

    public static final RegistryObject<Item> GOLDEN_LONG_SWORD = ITEMS.register("golden_long_sword",
            () -> new SwordItem(Tiers.GOLD, 4, -2.0F, new Item.Properties().durability(Tiers.GOLD.getUses()).tab(CreativeTabHandler.MAIN_TAB)));

    public static final RegistryObject<Item> COPPER_SCYTHE = ITEMS.register("copper_scythe",
            () -> new ScytheItem(ScytheTiers.COPPER,4, -1.5f, new Item.Properties().tab(CreativeTabHandler.MAIN_TAB)));

    public static final RegistryObject<Item> IRON_SCYTHE = ITEMS.register("iron_scythe",
            () -> new ScytheItem(ScytheTiers.IRON,6, -1.5f, new Item.Properties().tab(CreativeTabHandler.MAIN_TAB)));

    public static final RegistryObject<Item> GOLD_SCYTHE = ITEMS.register("gold_scythe",
            () -> new ScytheItem(ScytheTiers.GOLD,5, -1.5f, new Item.Properties().tab(CreativeTabHandler.MAIN_TAB)));

    public static final RegistryObject<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe",
            () -> new ScytheItem(ScytheTiers.DIAMOND,6, -1.5f, new Item.Properties().tab(CreativeTabHandler.MAIN_TAB)));

    public static final RegistryObject<Item> FIRE_WAND = ITEMS.register("fire_wand",
            () -> new FireWandItem(new Item.Properties().tab(CreativeTabHandler.MAIN_TAB)));

    public static final RegistryObject<Item> BATTLE_HAMMER = ITEMS.register("battle_hammer",
            () -> new HammerItem(HammerTier.IRON, 5, -2.5f, new Item.Properties().tab(CreativeTabHandler.MAIN_TAB)));
    //------end-of items-------

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
