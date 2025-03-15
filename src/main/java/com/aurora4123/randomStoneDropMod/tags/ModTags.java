package com.aurora4123.randomStoneDropMod.tags;

import com.aurora4123.randomStoneDropMod.RandomStoneDropMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final TagKey<Block> TEST =
            BlockTags.create(new ResourceLocation(RandomStoneDropMod.MODID, "test"));
}
