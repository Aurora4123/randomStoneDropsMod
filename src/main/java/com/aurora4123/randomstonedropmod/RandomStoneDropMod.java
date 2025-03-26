package com.aurora4123.randomstonedropmod;

import com.aurora4123.randomstonedropmod.blocks.basic.ModBlocks;
import com.aurora4123.randomstonedropmod.item.basic.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RandomStoneDropMod.MODID)
public class RandomStoneDropMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "randomstonedropmod";

    public RandomStoneDropMod(FMLJavaModLoadingContext context) {
        IEventBus bus = context.getModEventBus();
        ModItems.register(bus);
        ModBlocks.BLOCKS.register(bus);
    }


}
