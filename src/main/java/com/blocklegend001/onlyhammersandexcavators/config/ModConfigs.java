package com.blocklegend001.onlyhammersandexcavators.config;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import com.mojang.datafixers.util.Pair;

import java.util.logging.Logger;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static int DurabilityWoodenExcavator;
    public static int DurabilityStoneExcavator;
    public static int DurabilityIronExcavator;
    public static int DurabilityGoldExcavator;
    public static int DurabilityLapisExcavator;
    public static int DurabilityRedstoneExcavator;
    public static int DurabilityObsidianExcavator;
    public static int DurabilityDiamondExcavator;
    public static int DurabilityEmeraldExcavator;
    public static int DurabilityNetheriteExcavator;

    public static int DurabilityWoodenHammer;
    public static int DurabilityStoneHammer;
    public static int DurabilityIronHammer;
    public static int DurabilityGoldHammer;
    public static int DurabilityLapisHammer;
    public static int DurabilityRedstoneHammer;
    public static int DurabilityObsidianHammer;
    public static int DurabilityDiamondHammer;
    public static int DurabilityEmeraldHammer;
    public static int DurabilityNetheriteHammer;

    public static int RadiusWoodenExcavator;
    public static int RadiusStoneExcavator;
    public static int RadiusIronExcavator;
    public static int RadiusGoldExcavator;
    public static int RadiusLapisExcavator;
    public static int RadiusRedstoneExcavator;
    public static int RadiusObsidianExcavator;
    public static int RadiusDiamondExcavator;
    public static int RadiusEmeraldExcavator;
    public static int RadiusNetheriteExcavator;

    public static int RadiusWoodenHammer;
    public static int RadiusStoneHammer;
    public static int RadiusIronHammer;
    public static int RadiusGoldHammer;
    public static int RadiusLapisHammer;
    public static int RadiusRedstoneHammer;
    public static int RadiusObsidianHammer;
    public static int RadiusDiamondHammer;
    public static int RadiusEmeraldHammer;
    public static int RadiusNetheriteHammer;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(OnlyHammersAndExcavators.MOD_ID).provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addComment("Excavator Durability Settings");

        configs.addKeyValuePair(new Pair<>("DurabilityWoodenExcavator", 302), "Durability of the Wooden Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityStoneExcavator", 650), "Durability of the Stone Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityIronExcavator", 1300), "Durability of the Iron Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityGoldExcavator", 750), "Durability of the Gold Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityLapisExcavator", 1100), "Durability of the Lapis Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityRedstoneExcavator", 1100), "Durability of the Redstone Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityObsidianExcavator", 11200), "Durability of the Obsidian Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityDiamondExcavator", 8025), "Durability of the Diamond Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityEmeraldExcavator", 9768), "Durability of the Emerald Excavator");
        configs.addKeyValuePair(new Pair<>("DurabilityNetheriteExcavator", 13675), "Durability of the Netherite Excavator");

        configs.addComment("Hammer Durability Settings");

        configs.addKeyValuePair(new Pair<>("DurabilityWoodenHammer", 302), "Durability of the Wooden Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityStoneHammer", 650), "Durability of the Stone Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityIronHammer", 1300), "Durability of the Iron Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityGoldHammer", 750), "Durability of the Gold Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityLapisHammer", 1100), "Durability of the Lapis Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityRedstoneHammer", 1100), "Durability of the Redstone Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityObsidianHammer", 11200), "Durability of the Obsidian Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityDiamondHammer", 8025), "Durability of the Diamond Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityEmeraldHammer", 9768), "Durability of the Emerald Hammer");
        configs.addKeyValuePair(new Pair<>("DurabilityNetheriteHammer", 13675), "Durability of the Netherite Hammer");

        configs.addComment("Excavator Radius Settings");

        configs.addKeyValuePair(new Pair<>("RadiusWoodenExcavator", 1), "Excavation radius for Wooden Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusStoneExcavator", 1), "Excavation radius for Stone Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusIronExcavator", 1), "Excavation radius for Iron Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusGoldExcavator", 1), "Excavation radius for Gold Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusLapisExcavator", 1), "Excavation radius for Lapis Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusRedstoneExcavator", 1), "Excavation radius for Redstone Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusObsidianExcavator", 1), "Excavation radius for Obsidian Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusDiamondExcavator", 1), "Excavation radius for Diamond Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusEmeraldExcavator", 1), "Excavation radius for Emerald Excavator (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusNetheriteExcavator", 1), "Excavation radius for Netherite Excavator (radius 1 = 3×1 area)");

        configs.addComment("Hammer Radius Settings");

        configs.addKeyValuePair(new Pair<>("RadiusWoodenHammer", 1), "Hammering radius for Wooden Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusStoneHammer", 1), "Hammering radius for Stone Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusIronHammer", 1), "Hammering radius for Iron Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusGoldHammer", 1), "Hammering radius for Gold Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusLapisHammer", 1), "Hammering radius for Lapis Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusRedstoneHammer", 1), "Hammering radius for Redstone Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusObsidianHammer", 1), "Hammering radius for Obsidian Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusDiamondHammer", 1), "Hammering radius for Diamond Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusEmeraldHammer", 1), "Hammering radius for Emerald Hammer (radius 1 = 3×1 area)");
        configs.addKeyValuePair(new Pair<>("RadiusNetheriteHammer", 1), "Hammering radius for Netherite Hammer (radius 1 = 3×1 area)");
    }

    private static void assignConfigs() {
        DurabilityWoodenExcavator = CONFIG.getOrDefault("DurabilityWoodenExcavator", 302);
        DurabilityStoneExcavator = CONFIG.getOrDefault("DurabilityStoneExcavator", 650);
        DurabilityIronExcavator = CONFIG.getOrDefault("DurabilityIronExcavator", 1300);
        DurabilityGoldExcavator = CONFIG.getOrDefault("DurabilityGoldExcavator", 750);
        DurabilityLapisExcavator = CONFIG.getOrDefault("DurabilityLapisExcavator", 1100);
        DurabilityRedstoneExcavator = CONFIG.getOrDefault("DurabilityRedstoneExcavator", 1100);
        DurabilityObsidianExcavator = CONFIG.getOrDefault("DurabilityObsidianExcavator", 11200);
        DurabilityDiamondExcavator = CONFIG.getOrDefault("DurabilityDiamondExcavator", 8025);
        DurabilityEmeraldExcavator = CONFIG.getOrDefault("DurabilityEmeraldExcavator", 9768);
        DurabilityNetheriteExcavator = CONFIG.getOrDefault("DurabilityNetheriteExcavator", 13675);

        DurabilityWoodenHammer = CONFIG.getOrDefault("DurabilityWoodenHammer", 302);
        DurabilityStoneHammer = CONFIG.getOrDefault("DurabilityStoneHammer", 650);
        DurabilityIronHammer = CONFIG.getOrDefault("DurabilityIronHammer", 1300);
        DurabilityGoldHammer = CONFIG.getOrDefault("DurabilityGoldHammer", 750);
        DurabilityLapisHammer = CONFIG.getOrDefault("DurabilityLapisHammer", 1100);
        DurabilityRedstoneHammer = CONFIG.getOrDefault("DurabilityRedstoneHammer", 1100);
        DurabilityObsidianHammer = CONFIG.getOrDefault("DurabilityObsidianHammer", 11200);
        DurabilityDiamondHammer = CONFIG.getOrDefault("DurabilityDiamondHammer", 8025);
        DurabilityEmeraldHammer = CONFIG.getOrDefault("DurabilityEmeraldHammer", 9768);
        DurabilityNetheriteHammer = CONFIG.getOrDefault("DurabilityNetheriteHammer", 13675);

        RadiusWoodenExcavator = CONFIG.getOrDefault("RadiusWoodenExcavator", 1);
        RadiusStoneExcavator = CONFIG.getOrDefault("RadiusStoneExcavator", 1);
        RadiusIronExcavator = CONFIG.getOrDefault("RadiusIronExcavator", 1);
        RadiusGoldExcavator = CONFIG.getOrDefault("RadiusGoldExcavator", 1);
        RadiusLapisExcavator = CONFIG.getOrDefault("RadiusLapisExcavator", 1);
        RadiusRedstoneExcavator = CONFIG.getOrDefault("RadiusRedstoneExcavator", 1);
        RadiusObsidianExcavator = CONFIG.getOrDefault("RadiusObsidianExcavator", 1);
        RadiusDiamondExcavator = CONFIG.getOrDefault("RadiusDiamondExcavator", 1);
        RadiusEmeraldExcavator = CONFIG.getOrDefault("RadiusEmeraldExcavator", 1);
        RadiusNetheriteExcavator = CONFIG.getOrDefault("RadiusNetheriteExcavator", 1);

        RadiusWoodenHammer = CONFIG.getOrDefault("RadiusWoodenHammer", 1);
        RadiusStoneHammer = CONFIG.getOrDefault("RadiusStoneHammer", 1);
        RadiusIronHammer = CONFIG.getOrDefault("RadiusIronHammer", 1);
        RadiusGoldHammer = CONFIG.getOrDefault("RadiusGoldHammer", 1);
        RadiusLapisHammer = CONFIG.getOrDefault("RadiusLapisHammer", 1);
        RadiusRedstoneHammer = CONFIG.getOrDefault("RadiusRedstoneHammer", 1);
        RadiusObsidianHammer = CONFIG.getOrDefault("RadiusObsidianHammer", 1);
        RadiusDiamondHammer = CONFIG.getOrDefault("RadiusDiamondHammer", 1);
        RadiusEmeraldHammer = CONFIG.getOrDefault("RadiusEmeraldHammer", 1);
        RadiusNetheriteHammer = CONFIG.getOrDefault("RadiusNetheriteHammer", 1);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}
