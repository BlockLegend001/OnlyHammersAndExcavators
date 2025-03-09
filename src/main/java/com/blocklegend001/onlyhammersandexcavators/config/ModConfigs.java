package com.blocklegend001.onlyhammersandexcavators.config;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import com.mojang.datafixers.util.Pair;

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

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(OnlyHammersAndExcavators.MOD_ID).provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
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


        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}
