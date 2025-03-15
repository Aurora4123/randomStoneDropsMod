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
    private static final List<Item> DROPS = List.of(
            Items.COAL,
            Items.RAW_IRON,
            Items.RAW_COPPER,
            Items.RAW_GOLD,
            Items.DIAMOND,
            Items.EMERALD,
            Items.LAPIS_LAZULI,
            Items.REDSTONE
    );
   private static final double DROP_CHANCE = 0.1;
   public RandomStoneDropMod(){
       IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
       ModBlocks.BLOCKS.register(bus);
       ModItems.register(bus);

       MinecraftForge.EVENT_BUS.addListener(this::onBlockBreak);
       bus.addListener(this::addCreative);
   }
   private void onBlockBreak(BlockEvent.BreakEvent event){
       Player player = event.getPlayer();
       BlockState state = event.getState();

       if(!player.level().isClientSide && state.is(BlockTags.STONE_ORE_REPLACEABLES)){

           if(player.level().getRandom().nextDouble() < DROP_CHANCE){
               Item drop = DROPS.get(player.level().random.nextInt(DROPS.size()));
               player.level().addFreshEntity(
                       new ItemEntity(
                               player.level(),
                               event.getPos().getX() + 0.5,
                               event.getPos().getY() + 0.5,
                               event.getPos().getZ() + 0.5,
                               new ItemStack(drop)
                       ));
           }
       }
   }

   private void addCreative(BuildCreativeModeTabContentsEvent event){
       if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
           event.accept(ModItems.TEST);

       }
       if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){

       }
   }
}
