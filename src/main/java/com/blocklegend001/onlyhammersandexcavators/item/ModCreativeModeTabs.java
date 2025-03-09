package com.blocklegend001.onlyhammersandexcavators.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab ONLYHAMMERSANDEXCAVATORS = new CreativeModeTab("onlyhammersandexcavators") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NETHERITE_EXCAVATOR.get());
        }
    };
}
