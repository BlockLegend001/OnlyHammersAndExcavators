package com.blocklegend001.onlyhammersandexcavators.utils;

import com.blocklegend001.onlyhammersandexcavators.config.ModConfigs;
import com.blocklegend001.onlyhammersandexcavators.item.ModItems;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Map;

public class RadiusMap {

    public static final Map<Item, Integer> EXCAVATOR_RADIUS_MAP = new HashMap<>();
    public static final Map<Item, Integer> HAMMER_RADIUS_MAP = new HashMap<>();

    static {
        addItem(ModItems.WOODEN_EXCAVATOR, ModConfigs.RadiusWoodenExcavator);
        addItem(ModItems.STONE_EXCAVATOR, ModConfigs.RadiusStoneExcavator);
        addItem(ModItems.IRON_EXCAVATOR, ModConfigs.RadiusIronExcavator);
        addItem(ModItems.GOLD_EXCAVATOR, ModConfigs.RadiusGoldExcavator);
        addItem(ModItems.LAPIS_EXCAVATOR, ModConfigs.RadiusLapisExcavator);
        addItem(ModItems.REDSTONE_EXCAVATOR, ModConfigs.RadiusRedstoneExcavator);
        addItem(ModItems.OBSIDIAN_EXCAVATOR, ModConfigs.RadiusObsidianExcavator);
        addItem(ModItems.DIAMOND_EXCAVATOR, ModConfigs.RadiusDiamondExcavator);
        addItem(ModItems.EMERALD_EXCAVATOR, ModConfigs.RadiusEmeraldExcavator);
        addItem(ModItems.NETHERITE_EXCAVATOR, ModConfigs.RadiusNetheriteExcavator);

        addItem(ModItems.WOODEN_HAMMER, ModConfigs.RadiusWoodenHammer);
        addItem(ModItems.STONE_HAMMER, ModConfigs.RadiusStoneHammer);
        addItem(ModItems.IRON_HAMMER, ModConfigs.RadiusIronHammer);
        addItem(ModItems.GOLD_HAMMER, ModConfigs.RadiusGoldHammer);
        addItem(ModItems.LAPIS_HAMMER, ModConfigs.RadiusLapisHammer);
        addItem(ModItems.REDSTONE_HAMMER, ModConfigs.RadiusRedstoneHammer);
        addItem(ModItems.OBSIDIAN_HAMMER, ModConfigs.RadiusObsidianHammer);
        addItem(ModItems.DIAMOND_HAMMER, ModConfigs.RadiusDiamondHammer);
        addItem(ModItems.EMERALD_HAMMER, ModConfigs.RadiusEmeraldHammer);
        addItem(ModItems.NETHERITE_HAMMER, ModConfigs.RadiusNetheriteHammer);
    }

    private static void addItem(Item item, int radius) {
        EXCAVATOR_RADIUS_MAP.put(item, Math.max(radius, 1));
        HAMMER_RADIUS_MAP.put(item, Math.max(radius, 1));
    }
}