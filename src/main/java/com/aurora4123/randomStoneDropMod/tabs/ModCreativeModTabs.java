package com.aurora4123.randomStoneDropMod.tabs;

import com.aurora4123.randomStoneDropMod.RandomStoneDropMod;
import com.aurora4123.randomStoneDropMod.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> MOD_TAB_CREATIVE_MODE =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RandomStoneDropMod.MODID);

    public static final RegistryObject<CreativeModeTab> MY_MOD_TAB = MOD_TAB_CREATIVE_MODE.register("randomstonedropmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WAY_STONE.get()))
                    .title(Component.translatable("creativetab.randomstonedropmod_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WAY_STONE.get());
                        output.accept(ModItems.TEST.get());
                    }))
                    .build());

    public static void register(IEventBus modEventBus) {
        MOD_TAB_CREATIVE_MODE.register(modEventBus);
    }
}
