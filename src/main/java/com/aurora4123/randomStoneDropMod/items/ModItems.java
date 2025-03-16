package com.aurora4123.randomStoneDropMod.items;

import com.aurora4123.randomStoneDropMod.RandomStoneDropMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RandomStoneDropMod.MODID);

    public static final RegistryObject<Item> TEST = ITEMS.register("test_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THE_BI_STINKY = ITEMS.register("excrement",
            Poisonous::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
