package com.aurora4123.randomStoneDropMod.tabs;

import com.aurora4123.randomStoneDropMod.RandomStoneDropMod;
import com.aurora4123.randomStoneDropMod.blocks.ModBlocksToRegister;
import com.aurora4123.randomStoneDropMod.items.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RandomStoneDropMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeModTabHandler {
    @SubscribeEvent
    public static void addCreative(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.WAY_STONE);
        } else if(event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS){
            event.accept(ModBlocksToRegister.ANDESIDE_WAYSTONE);
        } else if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocksToRegister.TEST_BLOCK);
        } else if(event.getTabKey() == CreativeModeTabs.COMBAT){
            event.accept(ModItems.WOODEN_LONG_SWORD);
            event.accept(ModItems.STONE_LONG_SWORD);
            event.accept(ModItems.IRON_LONG_SWORD);
            event.accept(ModItems.GOLDEN_LONG_SWORD);
            event.accept(ModItems.DIAMOND_LONG_SWORD);
            event.accept(ModItems.NETHERITE_LONG_SWORD);
        }
    }
}
