package com.aurora4123.randomStoneDropMod;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
;
@Mod.EventBusSubscriber(modid = RandomStoneDropMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.BooleanValue ARROW_SUMMONS_LIGHTNING;
    public static final ForgeConfigSpec.BooleanValue ENABLE_RANDOM_STONE_DROP;

    public static boolean lightingEnabled;
    public static boolean randomStoneDropEnabled;

    static {
        BUILDER.push("tools");
        ARROW_SUMMONS_LIGHTNING = BUILDER.comment("Summon a ligtningbolt while the arrow shot by player hits on block or entities").
                define("arrow_summons_lightning", true);
        ENABLE_RANDOM_STONE_DROP = BUILDER.comment("Enable random drops for stone (default:true)")
                .define("enable_random_stone_drop", true);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        lightingEnabled = ARROW_SUMMONS_LIGHTNING.get();
        randomStoneDropEnabled = ENABLE_RANDOM_STONE_DROP.get();
    }

    @SubscribeEvent
    static void onReload(final ModConfigEvent.Reloading event) {
        lightingEnabled = ARROW_SUMMONS_LIGHTNING.get();
        randomStoneDropEnabled = ENABLE_RANDOM_STONE_DROP.get();
    }

}
