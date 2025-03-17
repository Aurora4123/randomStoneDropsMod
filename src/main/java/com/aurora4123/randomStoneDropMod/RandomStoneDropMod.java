package com.aurora4123.randomStoneDropMod;

import com.aurora4123.randomStoneDropMod.blocks.ModBlocksToRegister;
import com.aurora4123.randomStoneDropMod.items.ModItems;


import com.aurora4123.randomStoneDropMod.tabs.ModCreativeModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RandomStoneDropMod.MODID)
public class RandomStoneDropMod
{
    public static final String MODID = "randomstonedropmod";
    public RandomStoneDropMod(FMLJavaModLoadingContext context){
        IEventBus bus = context.getModEventBus();
        ModBlocksToRegister.register(bus);
        ModCreativeModTabs.register(bus);
        ModItems.ITEMS.register(bus);

    }

}
