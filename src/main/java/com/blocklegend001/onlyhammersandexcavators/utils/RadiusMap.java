package com.blocklegend001.onlyhammersandexcavators.utils;

import com.blocklegend001.onlyhammersandexcavators.config.ModConfigs;
import com.blocklegend001.onlyhammersandexcavators.item.ModItems;
import net.minecraft.item.Item;

import java.util.Map;

public class RadiusMap {
    public static final Map<Item, Integer> EXCAVATOR_RADIUS_MAP = Map.of(
            ModItems.WOODEN_EXCAVATOR, ModConfigs.RadiusWoodenExcavator,
            ModItems.STONE_EXCAVATOR, ModConfigs.RadiusStoneExcavator,
            ModItems.IRON_EXCAVATOR, ModConfigs.RadiusIronExcavator,
            ModItems.GOLD_EXCAVATOR, ModConfigs.RadiusGoldExcavator,
            ModItems.LAPIS_EXCAVATOR, ModConfigs.RadiusLapisExcavator,
            ModItems.REDSTONE_EXCAVATOR, ModConfigs.RadiusRedstoneExcavator,
            ModItems.OBSIDIAN_EXCAVATOR, ModConfigs.RadiusObsidianExcavator,
            ModItems.DIAMOND_EXCAVATOR, ModConfigs.RadiusDiamondExcavator,
            ModItems.EMERALD_EXCAVATOR, ModConfigs.RadiusEmeraldExcavator,
            ModItems.NETHERITE_EXCAVATOR, ModConfigs.RadiusNetheriteExcavator
    );

    public static final Map<Item, Integer> HAMMER_RADIUS_MAP = Map.of(
            ModItems.WOODEN_HAMMER, ModConfigs.RadiusWoodenHammer,
            ModItems.STONE_HAMMER, ModConfigs.RadiusStoneHammer,
            ModItems.IRON_HAMMER, ModConfigs.RadiusIronHammer,
            ModItems.GOLD_HAMMER, ModConfigs.RadiusGoldHammer,
            ModItems.LAPIS_HAMMER, ModConfigs.RadiusLapisHammer,
            ModItems.REDSTONE_HAMMER, ModConfigs.RadiusRedstoneHammer,
            ModItems.OBSIDIAN_HAMMER, ModConfigs.RadiusObsidianHammer,
            ModItems.DIAMOND_HAMMER, ModConfigs.RadiusDiamondHammer,
            ModItems.EMERALD_HAMMER, ModConfigs.RadiusEmeraldHammer,
            ModItems.NETHERITE_HAMMER, ModConfigs.RadiusNetheriteHammer
    );
}