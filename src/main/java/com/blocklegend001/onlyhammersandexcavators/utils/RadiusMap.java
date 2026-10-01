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
            hammerRadius = Map.ofEntries(
                    Map.entry(ModItems.WOODEN_HAMMER.get(), ModConfigs.radiusWoodenHammer),
                    Map.entry(ModItems.STONE_HAMMER.get(), ModConfigs.radiusStoneHammer),
                    Map.entry(ModItems.COPPER_HAMMER.get(), ModConfigs.radiusCopperHammer),
                    Map.entry(ModItems.IRON_HAMMER.get(), ModConfigs.radiusIronHammer),
                    Map.entry(ModItems.GOLD_HAMMER.get(), ModConfigs.radiusGoldHammer),
                    Map.entry(ModItems.LAPIS_HAMMER.get(), ModConfigs.radiusLapisHammer),
                    Map.entry(ModItems.REDSTONE_HAMMER.get(), ModConfigs.radiusRedstoneHammer),
                    Map.entry(ModItems.OBSIDIAN_HAMMER.get(), ModConfigs.radiusObsidianHammer),
                    Map.entry(ModItems.DIAMOND_HAMMER.get(), ModConfigs.radiusDiamondHammer),
                    Map.entry(ModItems.EMERALD_HAMMER.get(), ModConfigs.radiusEmeraldHammer),
                    Map.entry(ModItems.NETHERITE_HAMMER.get(), ModConfigs.radiusNetheriteHammer)
            );
        }
        return hammerRadius;
    }

    public static Map<Item, Integer> getExcavatorRadius() {
        if (excavatorRadius == null) {
            excavatorRadius = Map.ofEntries(
                    Map.entry(ModItems.WOODEN_EXCAVATOR.get(), ModConfigs.radiusWoodenExcavator),
                    Map.entry(ModItems.STONE_EXCAVATOR.get(), ModConfigs.radiusStoneExcavator),
                    Map.entry(ModItems.COPPER_EXCAVATOR.get(), ModConfigs.radiusCopperExcavator),
                    Map.entry(ModItems.IRON_EXCAVATOR.get(), ModConfigs.radiusIronExcavator),
                    Map.entry(ModItems.GOLD_EXCAVATOR.get(), ModConfigs.radiusGoldExcavator),
                    Map.entry(ModItems.LAPIS_EXCAVATOR.get(), ModConfigs.radiusLapisExcavator),
                    Map.entry(ModItems.REDSTONE_EXCAVATOR.get(), ModConfigs.radiusRedstoneExcavator),
                    Map.entry(ModItems.OBSIDIAN_EXCAVATOR.get(), ModConfigs.radiusObsidianExcavator),
                    Map.entry(ModItems.DIAMOND_EXCAVATOR.get(), ModConfigs.radiusDiamondExcavator),
                    Map.entry(ModItems.EMERALD_EXCAVATOR.get(), ModConfigs.radiusEmeraldExcavator),
                    Map.entry(ModItems.NETHERITE_EXCAVATOR.get(), ModConfigs.radiusNetheriteExcavator)
            );
        }
        return excavatorRadius;
    }
}