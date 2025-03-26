package com.aurora4123.randomstonedropmod.creativetab;


import com.aurora4123.randomstonedropmod.item.basic.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;


public class CreativeTabHandler {
    public static final CreativeModeTab MAIN_TAB = new CreativeModeTab("randomstonedropmod.creativetab.main_mod_tab") {

        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.WAY_STONE.get());
        }

        @Override
        public @NotNull Component getDisplayName() {
            return Component.translatable("creativetab.main_mod_tab");
        }
    };
    public static final CreativeModeTab COMBAT_TAB = new CreativeModeTab("creativetab.randomstonedropmod.combat_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.IRON_LONG_SWORD.get());
        }

        @Override
        public @NotNull Component getDisplayName() {
            return Component.translatable("creativetab.randomstonedropmod_combat_tab");
        }

    };
}
