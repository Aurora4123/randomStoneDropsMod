package com.aurora4123.randomStoneDropMod.items.functional;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class SetSpawnItem extends Item {
    public SetSpawnItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext context) {

        if(!context.getLevel().isClientSide()) {
            BlockPos positionClicked = context.getClickedPos();
            Player player = context.getPlayer();
            BlockState blockState = context.getLevel().getBlockState(positionClicked);
            Level level = context.getLevel();
            if(!blockState.isAir() && level.dimension() == Level.OVERWORLD) {
                if (player != null) {

                    ServerPlayer serverPlayer = (ServerPlayer) player;

                    serverPlayer.setRespawnPosition(level.dimension(),
                            positionClicked.above(), 0.0F, true, false);

                    BlockPos positionAbove = positionClicked.above();
                    BlockPos headPos = positionAbove.above();
                    BlockState stateAbove = level.getBlockState(positionAbove);
                    BlockState stateHead = level.getBlockState(headPos);
                    if(!stateAbove.isAir() || !stateHead.isAir()) {
                        player.sendSystemMessage(Component.literal("此处不能设置重生点！").withStyle(ChatFormatting.RED));
                        return InteractionResult.FAIL;
                    }

                    player.sendSystemMessage(Component.literal("重生点已设置为：" + positionClicked.getX() + " " + (positionClicked.getY() + 1) + " " + positionClicked.getZ()).withStyle(ChatFormatting.GREEN));
                    return InteractionResult.SUCCESS;
                }
            } else if(level.dimension() != Level.OVERWORLD) {
                if (player != null) {
                    player.sendSystemMessage(Component.literal("只能在主世界设置重生点！").withStyle(ChatFormatting.RED));
                }
            }
        }

        return InteractionResult.FAIL;
    }
}
