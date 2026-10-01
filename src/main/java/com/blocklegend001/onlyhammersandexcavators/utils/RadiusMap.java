package com.blocklegend001.onlyhammersandexcavators.utils;

import com.blocklegend001.onlyhammersandexcavators.config.ModConfigs;
import com.blocklegend001.onlyhammersandexcavators.item.ModItems;
import net.minecraft.world.item.Item;

import java.util.Map;

public class RadiusMap {
    public static final Map<Item, Integer> EXCAVATOR_RADIUS_MAP = Map.ofEntries(
            Map.entry(ModItems.WOODEN_EXCAVATOR, ModConfigs.RadiusWoodenExcavator),
            Map.entry(ModItems.STONE_EXCAVATOR, ModConfigs.RadiusStoneExcavator),
            Map.entry(ModItems.COPPER_EXCAVATOR, ModConfigs.RadiusCopperExcavator),
            Map.entry(ModItems.IRON_EXCAVATOR, ModConfigs.RadiusIronExcavator),
            Map.entry(ModItems.GOLD_EXCAVATOR, ModConfigs.RadiusGoldExcavator),
            Map.entry(ModItems.LAPIS_EXCAVATOR, ModConfigs.RadiusLapisExcavator),
            Map.entry(ModItems.REDSTONE_EXCAVATOR, ModConfigs.RadiusRedstoneExcavator),
            Map.entry(ModItems.OBSIDIAN_EXCAVATOR, ModConfigs.RadiusObsidianExcavator),
            Map.entry(ModItems.DIAMOND_EXCAVATOR, ModConfigs.RadiusDiamondExcavator),
            Map.entry(ModItems.EMERALD_EXCAVATOR, ModConfigs.RadiusEmeraldExcavator),
            Map.entry(ModItems.NETHERITE_EXCAVATOR, ModConfigs.RadiusNetheriteExcavator)
    );

    public static final Map<Item, Integer> HAMMER_RADIUS_MAP = Map.ofEntries(
            Map.entry(ModItems.WOODEN_HAMMER, ModConfigs.RadiusWoodenHammer),
            Map.entry(ModItems.STONE_HAMMER, ModConfigs.RadiusStoneHammer),
            Map.entry(ModItems.COPPER_HAMMER, ModConfigs.RadiusCopperHammer),
            Map.entry(ModItems.IRON_HAMMER, ModConfigs.RadiusIronHammer),
            Map.entry(ModItems.GOLD_HAMMER, ModConfigs.RadiusGoldHammer),
            Map.entry(ModItems.LAPIS_HAMMER, ModConfigs.RadiusLapisHammer),
            Map.entry(ModItems.REDSTONE_HAMMER, ModConfigs.RadiusRedstoneHammer),
            Map.entry(ModItems.OBSIDIAN_HAMMER, ModConfigs.RadiusObsidianHammer),
            Map.entry(ModItems.DIAMOND_HAMMER, ModConfigs.RadiusDiamondHammer),
            Map.entry(ModItems.EMERALD_HAMMER, ModConfigs.RadiusEmeraldHammer),
            Map.entry(ModItems.NETHERITE_HAMMER, ModConfigs.RadiusNetheriteHammer)
    );
}