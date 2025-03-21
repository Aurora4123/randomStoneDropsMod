package com.aurora4123.randomStoneDropMod.tips;

import com.aurora4123.randomStoneDropMod.RandomStoneDropMod;
import com.aurora4123.randomStoneDropMod.items.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RandomStoneDropMod.MODID,bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ToolTipHandler {
    @SubscribeEvent
    public static void onItemToolTip(ItemTooltipEvent event) {
        if(event.getItemStack().getItem() == ModItems.SPAWNPOINT_SETTER.get()){
            event.getToolTip().add(Component.translatable("tooltip.spawnpoint_setter").withStyle(ChatFormatting.GRAY));
            event.getToolTip().add(Component.literal(RandomStoneDropMod.MODID).withStyle(ChatFormatting.BLUE, ChatFormatting.ITALIC));
        }
    }
}
