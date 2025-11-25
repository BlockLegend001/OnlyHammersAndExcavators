package com.blocklegend001.onlyhammersandexcavators.utils;

import com.blocklegend001.onlyhammersandexcavators.ModConfigs;
import com.blocklegend001.onlyhammersandexcavators.item.ModItems;
import net.minecraft.world.item.Item;

import java.util.Map;

public class RadiusMap {
    public static Map<Item, Integer> hammerRadius = null;
    public static Map<Item, Integer> excavatorRadius = null;

    public static Map<Item, Integer> getHammerRadius() {
        if (hammerRadius == null) {
            hammerRadius = Map.of(
                    ModItems.WOODEN_HAMMER.get(), ModConfigs.radiusWoodenHammer.get(),
                    ModItems.STONE_HAMMER.get(), ModConfigs.radiusStoneHammer.get(),
                    ModItems.IRON_HAMMER.get(), ModConfigs.radiusIronHammer.get(),
                    ModItems.GOLD_HAMMER.get(), ModConfigs.radiusGoldHammer.get(),
                    ModItems.LAPIS_HAMMER.get(), ModConfigs.radiusLapisHammer.get(),
                    ModItems.REDSTONE_HAMMER.get(), ModConfigs.radiusRedstoneHammer.get(),
                    ModItems.OBSIDIAN_HAMMER.get(), ModConfigs.radiusObsidianHammer.get(),
                    ModItems.DIAMOND_HAMMER.get(), ModConfigs.radiusDiamondHammer.get(),
                    ModItems.EMERALD_HAMMER.get(), ModConfigs.radiusEmeraldHammer.get(),
                    ModItems.NETHERITE_HAMMER.get(), ModConfigs.radiusNetheriteHammer.get()
            );
        }
        return hammerRadius;
    }

    public static Map<Item, Integer> getExcavatorRadius() {
        if (excavatorRadius == null) {
            excavatorRadius = Map.of(
                    ModItems.WOODEN_EXCAVATOR.get(), ModConfigs.radiusWoodenExcavator.get(),
                    ModItems.STONE_EXCAVATOR.get(), ModConfigs.radiusStoneExcavator.get(),
                    ModItems.IRON_EXCAVATOR.get(), ModConfigs.radiusIronExcavator.get(),
                    ModItems.GOLD_EXCAVATOR.get(), ModConfigs.radiusGoldExcavator.get(),
                    ModItems.LAPIS_EXCAVATOR.get(), ModConfigs.radiusLapisExcavator.get(),
                    ModItems.REDSTONE_EXCAVATOR.get(), ModConfigs.radiusRedstoneExcavator.get(),
                    ModItems.OBSIDIAN_EXCAVATOR.get(), ModConfigs.radiusObsidianExcavator.get(),
                    ModItems.DIAMOND_EXCAVATOR.get(), ModConfigs.radiusDiamondExcavator.get(),
                    ModItems.EMERALD_EXCAVATOR.get(), ModConfigs.radiusEmeraldExcavator.get(),
                    ModItems.NETHERITE_EXCAVATOR.get(), ModConfigs.radiusNetheriteExcavator.get()
            );
        }
        return excavatorRadius;
    }
}
