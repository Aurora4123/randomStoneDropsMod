package com.aurora4123.randomStoneDropMod.tabs;

import com.aurora4123.randomStoneDropMod.RandomStoneDropMod;
import com.aurora4123.randomStoneDropMod.blocks.ModBlocksToRegister;
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

    public static final RegistryObject<CreativeModeTab> MAIN_MOD_TAB = MOD_TAB_CREATIVE_MODE.register("main_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SPAWNPOINT_SETTER.get()))
                    .title(Component.translatable("creativetab.main_mod_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WAY_STONE.get());
                        output.accept(ModItems.SPAWNPOINT_SETTER.get());
                        output.accept(ModBlocksToRegister.ANDESIDE_WAYSTONE.get());
                        output.accept(ModBlocksToRegister.TEST_BLOCK.get());
                        output.accept(ModItems.FIRE_WAND.get());
                        output.accept(ModItems.NETHERITE_LONG_SWORD.get());
                        output.accept(ModItems.DIAMOND_LONG_SWORD.get());
                        output.accept(ModItems.IRON_LONG_SWORD.get());
                        output.accept(ModItems.STONE_LONG_SWORD.get());
                        output.accept(ModItems.WOODEN_LONG_SWORD.get());
                        output.accept(ModItems.GOLDEN_LONG_SWORD.get());

                        output.accept(ModItems.DIAMOND_SCYTHE.get());
                        output.accept(ModItems.IRON_SCYTHE.get());
                        output.accept(ModItems.GOLD_SCYTHE.get());
                        output.accept(ModItems.COOPER_SCYTHE.get());
                    }))
                    .build());


    public static final RegistryObject<CreativeModeTab> MY_MOD_TAB_ITEMS = MOD_TAB_CREATIVE_MODE.register("randomstonedropmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WAY_STONE.get()))
                    .title(Component.translatable("creativetab.randomstonedropmod_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WAY_STONE.get());
                        output.accept(ModItems.SPAWNPOINT_SETTER.get());
                        output.accept(ModItems.NETHERITE_LONG_SWORD.get());
                        output.accept(ModItems.DIAMOND_LONG_SWORD.get());
                        output.accept(ModItems.IRON_LONG_SWORD.get());
                        output.accept(ModItems.STONE_LONG_SWORD.get());
                        output.accept(ModItems.WOODEN_LONG_SWORD.get());
                        output.accept(ModItems.GOLDEN_LONG_SWORD.get());
                    }))
                    .build());

    public static final RegistryObject<CreativeModeTab> MY_MOD_TAB_BLOCKS = MOD_TAB_CREATIVE_MODE.register("randomstonedropmod_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksToRegister.ANDESIDE_WAYSTONE.get()))
                    .title(Component.translatable("creativetab.randomstonedropmod_blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocksToRegister.TEST_BLOCK.get());
                        output.accept(ModBlocksToRegister.ANDESIDE_WAYSTONE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MY_MOD_TAB_COMBAT = MOD_TAB_CREATIVE_MODE.register("randomstonedropmod_combat_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.IRON_LONG_SWORD.get()))
                    .title(Component.translatable("creativetab.randomstonedropmod_combat_tab"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(ModItems.WOODEN_LONG_SWORD.get());
                        output.accept(ModItems.STONE_LONG_SWORD.get());
                        output.accept(ModItems.GOLDEN_LONG_SWORD.get());
                        output.accept(ModItems.IRON_LONG_SWORD.get());
                        output.accept(ModItems.DIAMOND_LONG_SWORD.get());
                        output.accept(ModItems.NETHERITE_LONG_SWORD.get());

                        output.accept(ModItems.DIAMOND_SCYTHE.get());
                        output.accept(ModItems.IRON_SCYTHE.get());
                        output.accept(ModItems.GOLD_SCYTHE.get());
                        output.accept(ModItems.COOPER_SCYTHE.get());

                        output.accept(ModItems.FIRE_WAND.get());
                    }).build());

    public static void register(IEventBus modEventBus) {
        MOD_TAB_CREATIVE_MODE.register(modEventBus);
    }
}
