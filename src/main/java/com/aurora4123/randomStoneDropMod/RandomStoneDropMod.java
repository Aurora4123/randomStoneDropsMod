package com.aurora4123.randomStoneDropMod;

import com.aurora4123.randomStoneDropMod.blocks.ModBlocks;
import com.aurora4123.randomStoneDropMod.items.ModItems;
import net.minecraft.tags.BlockTags;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.List;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RandomStoneDropMod.MODID)
public class RandomStoneDropMod
{
    public static final String MODID = "randomstonedropmod";

   public RandomStoneDropMod(FMLJavaModLoadingContext context) {
       IEventBus bus = context.getModEventBus();
       ModBlocks.BLOCKS.register(bus);
       ModItems.register(bus);
   }

}
