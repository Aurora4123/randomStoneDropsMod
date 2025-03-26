package com.aurora4123.randomstonedropmod.eventHandlers;

import com.aurora4123.randomstonedropmod.RandomStoneDropMod;
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

@Mod.EventBusSubscriber(modid = RandomStoneDropMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BlockEventHandler {

    private static final double DROP_CHANCE = 0.003;
    private static final double RARE_CHANCE = 0.007;
    private static final double MOST_CHANCE = 0.9;
    private static final double COMMON_DROP_CHANCE = 0.09;
    private static final Item MOST_DROP = Items.COBBLESTONE;
    private static final List<Item> COMMON_DROPS = List.of(
            Items.COAL,
            Items.RAW_IRON,
            Items.RAW_COPPER,
            Items.LAPIS_LAZULI,
            Items.REDSTONE
    );
    private static final List<Item> RARE_DROPS = List.of(
            Items.RAW_GOLD,
            Items.EMERALD
    );
    private static final List<Item> DROPS = List.of(
            Items.DIAMOND
    );

    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        BlockState state = event.getState();

        if (!player.getLevel().isClientSide && state.is(BlockTags.STONE_ORE_REPLACEABLES) && !player.isCreative()) {
            event.setCanceled(true);
            player.level.destroyBlock(event.getPos(), false, player);
            if (player.level.getRandom().nextDouble() < DROP_CHANCE) {
                Item drop = DROPS.get(player.getLevel().random.nextInt(DROPS.size()));
                setDrops(event, player, drop);
            } else if (player.level.getRandom().nextDouble() < RARE_CHANCE) {
                Item drop = RARE_DROPS.get(player.getLevel().random.nextInt(RARE_DROPS.size()));
                setDrops(event, player, drop);
            } else if (player.level.getRandom().nextDouble() < COMMON_DROP_CHANCE) {
                Item drop = COMMON_DROPS.get(player.getLevel().random.nextInt(COMMON_DROPS.size()));
                setDrops(event, player, drop);
            } else if (player.level.getRandom().nextDouble() < MOST_CHANCE) {
                setDrops(event, player, MOST_DROP);
            } else {
                setDrops(event, player, MOST_DROP);
            }
        }
    }

    private static void setDrops(BlockEvent.BreakEvent event,Player player,Item drop){
        player.getLevel().addFreshEntity(
                new ItemEntity(
                        player.getLevel(),
                        event.getPos().getX() + 0.5,
                        event.getPos().getY() + 0.5,
                        event.getPos().getZ() + 0.5,
                        new ItemStack(drop)

                )
        );
    }

}
