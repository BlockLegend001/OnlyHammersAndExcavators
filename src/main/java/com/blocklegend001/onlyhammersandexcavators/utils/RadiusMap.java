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
                    ModItems.WOODEN_HAMMER.get(), ModConfigs.radiusWoodenHammer,
                    ModItems.STONE_HAMMER.get(), ModConfigs.radiusStoneHammer,
                    ModItems.IRON_HAMMER.get(), ModConfigs.radiusIronHammer,
                    ModItems.GOLD_HAMMER.get(), ModConfigs.radiusGoldHammer,
                    ModItems.LAPIS_HAMMER.get(), ModConfigs.radiusLapisHammer,
                    ModItems.REDSTONE_HAMMER.get(), ModConfigs.radiusRedstoneHammer,
                    ModItems.OBSIDIAN_HAMMER.get(), ModConfigs.radiusObsidianHammer,
                    ModItems.DIAMOND_HAMMER.get(), ModConfigs.radiusDiamondHammer,
                    ModItems.EMERALD_HAMMER.get(), ModConfigs.radiusEmeraldHammer,
                    ModItems.NETHERITE_HAMMER.get(), ModConfigs.radiusNetheriteHammer
            );
        }
        return hammerRadius;
    }

    public static Map<Item, Integer> getExcavatorRadius() {
        if (excavatorRadius == null) {
            excavatorRadius = Map.of(
                    ModItems.WOODEN_EXCAVATOR.get(), ModConfigs.radiusWoodenExcavator,
                    ModItems.STONE_EXCAVATOR.get(), ModConfigs.radiusStoneExcavator,
                    ModItems.IRON_EXCAVATOR.get(), ModConfigs.radiusIronExcavator,
                    ModItems.GOLD_EXCAVATOR.get(), ModConfigs.radiusGoldExcavator,
                    ModItems.LAPIS_EXCAVATOR.get(), ModConfigs.radiusLapisExcavator,
                    ModItems.REDSTONE_EXCAVATOR.get(), ModConfigs.radiusRedstoneExcavator,
                    ModItems.OBSIDIAN_EXCAVATOR.get(), ModConfigs.radiusObsidianExcavator,
                    ModItems.DIAMOND_EXCAVATOR.get(), ModConfigs.radiusDiamondExcavator,
                    ModItems.EMERALD_EXCAVATOR.get(), ModConfigs.radiusEmeraldExcavator,
                    ModItems.NETHERITE_EXCAVATOR.get(), ModConfigs.radiusNetheriteExcavator
            );
        }
        return excavatorRadius;
    }
}
