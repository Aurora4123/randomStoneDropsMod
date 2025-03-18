package com.aurora4123.randomStoneDropMod.functions;

import com.aurora4123.randomStoneDropMod.RandomStoneDropMod;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
@Mod.EventBusSubscriber(modid = RandomStoneDropMod.MODID,bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BlockBreakHandler {
    private static final double DROP_CHANCE = 0.1;
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
    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event){
        Player player = event.getPlayer();
        BlockState state = event.getState();

        if(!player.level().isClientSide && state.is(BlockTags.STONE_ORE_REPLACEABLES) && !player.isCreative()) {

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
}
