package com.blocklegend001.onlyhammersandexcavators;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class ModConfigs {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.IntValue durabilityWoodenExcavator;
    public static final ForgeConfigSpec.IntValue durabilityStoneExcavator;
    public static final ForgeConfigSpec.IntValue durabilityCopperExcavator;
    public static final ForgeConfigSpec.IntValue durabilityIronExcavator;
    public static final ForgeConfigSpec.IntValue durabilityGoldExcavator;
    public static final ForgeConfigSpec.IntValue durabilityLapisExcavator;
    public static final ForgeConfigSpec.IntValue durabilityRedstoneExcavator;
    public static final ForgeConfigSpec.IntValue durabilityObsidianExcavator;
    public static final ForgeConfigSpec.IntValue durabilityDiamondExcavator;
    public static final ForgeConfigSpec.IntValue durabilityEmeraldExcavator;
    public static final ForgeConfigSpec.IntValue durabilityNetheriteExcavator;

    public static final ForgeConfigSpec.IntValue radiusWoodenExcavator;
    public static final ForgeConfigSpec.IntValue radiusStoneExcavator;
    public static final ForgeConfigSpec.IntValue radiusCopperExcavator;
    public static final ForgeConfigSpec.IntValue radiusIronExcavator;
    public static final ForgeConfigSpec.IntValue radiusGoldExcavator;
    public static final ForgeConfigSpec.IntValue radiusLapisExcavator;
    public static final ForgeConfigSpec.IntValue radiusRedstoneExcavator;
    public static final ForgeConfigSpec.IntValue radiusObsidianExcavator;
    public static final ForgeConfigSpec.IntValue radiusDiamondExcavator;
    public static final ForgeConfigSpec.IntValue radiusEmeraldExcavator;
    public static final ForgeConfigSpec.IntValue radiusNetheriteExcavator;

    public static final ForgeConfigSpec.IntValue durabilityWoodenHammer;
    public static final ForgeConfigSpec.IntValue durabilityStoneHammer;
    public static final ForgeConfigSpec.IntValue durabilityCopperHammer;
    public static final ForgeConfigSpec.IntValue durabilityIronHammer;
    public static final ForgeConfigSpec.IntValue durabilityGoldHammer;
    public static final ForgeConfigSpec.IntValue durabilityLapisHammer;
    public static final ForgeConfigSpec.IntValue durabilityRedstoneHammer;
    public static final ForgeConfigSpec.IntValue durabilityObsidianHammer;
    public static final ForgeConfigSpec.IntValue durabilityDiamondHammer;
    public static final ForgeConfigSpec.IntValue durabilityEmeraldHammer;
    public static final ForgeConfigSpec.IntValue durabilityNetheriteHammer;

    public static final ForgeConfigSpec.IntValue radiusWoodenHammer;
    public static final ForgeConfigSpec.IntValue radiusStoneHammer;
    public static final ForgeConfigSpec.IntValue radiusCopperHammer;
    public static final ForgeConfigSpec.IntValue radiusIronHammer;
    public static final ForgeConfigSpec.IntValue radiusGoldHammer;
    public static final ForgeConfigSpec.IntValue radiusLapisHammer;
    public static final ForgeConfigSpec.IntValue radiusRedstoneHammer;
    public static final ForgeConfigSpec.IntValue radiusObsidianHammer;
    public static final ForgeConfigSpec.IntValue radiusDiamondHammer;
    public static final ForgeConfigSpec.IntValue radiusEmeraldHammer;
    public static final ForgeConfigSpec.IntValue radiusNetheriteHammer;


    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Excavator Durability Settings");
        durabilityWoodenExcavator = BUILDER.comment("Durability of the wooden excavator.")
                .defineInRange("Wooden", 302, 0, Integer.MAX_VALUE);
        durabilityStoneExcavator = BUILDER.comment("Durability of the stone excavator.")
                .defineInRange("Stone", 650, 0, Integer.MAX_VALUE);
        durabilityCopperExcavator = BUILDER.comment("Durability of the copper excavator.")
                .defineInRange("Copper", 850, 0, Integer.MAX_VALUE);
        durabilityIronExcavator = BUILDER.comment("Durability of the iron excavator.")
                .defineInRange("Iron", 1300, 0, Integer.MAX_VALUE);
        durabilityGoldExcavator = BUILDER.comment("Durability of the gold excavator.")
                .defineInRange("Gold", 750, 0, Integer.MAX_VALUE);
        durabilityLapisExcavator = BUILDER.comment("Durability of the lapis excavator.")
                .defineInRange("Lapis", 1100, 0, Integer.MAX_VALUE);
        durabilityRedstoneExcavator = BUILDER.comment("Durability of the redstone excavator.")
                .defineInRange("Redstone", 1100, 0, Integer.MAX_VALUE);
        durabilityObsidianExcavator = BUILDER.comment("Durability of the obsidian excavator.")
                .defineInRange("Obsidian", 11200, 0, Integer.MAX_VALUE);
        durabilityDiamondExcavator = BUILDER.comment("Durability of the diamond excavator.")
                .defineInRange("Diamond", 8025, 0, Integer.MAX_VALUE);
        durabilityEmeraldExcavator = BUILDER.comment("Durability of the emerald excavator.")
                .defineInRange("Emerald", 9768, 0, Integer.MAX_VALUE);
        durabilityNetheriteExcavator = BUILDER.comment("Durability of the netherite excavator.")
                .defineInRange("Netherite", 13675, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("Excavator Radius Settings");
        radiusWoodenExcavator = BUILDER.comment("Excavation radius for Wooden Excavator (radius 1 = 3×1 area)")
                .defineInRange("Wooden", 1, 0, Integer.MAX_VALUE);
        radiusStoneExcavator = BUILDER.comment("Excavation radius for Stone Excavator (radius 1 = 3×1 area)")
                .defineInRange("Stone", 1, 0, Integer.MAX_VALUE);
        radiusCopperExcavator = BUILDER.comment("Excavation radius for Copper Excavator (radius 1 = 3×1 area)")
                .defineInRange("Copper", 1, 0, Integer.MAX_VALUE);
        radiusIronExcavator = BUILDER.comment("Excavation radius for Iron Excavator (radius 1 = 3×1 area)")
                .defineInRange("Iron", 1, 0, Integer.MAX_VALUE);
        radiusGoldExcavator = BUILDER.comment("Excavation radius for Gold Excavator (radius 1 = 3×1 area)")
                .defineInRange("Gold", 1, 0, Integer.MAX_VALUE);
        radiusLapisExcavator = BUILDER.comment("Excavation radius for Lapis Excavator (radius 1 = 3×1 area)")
                .defineInRange("Lapis", 1, 0, Integer.MAX_VALUE);
        radiusRedstoneExcavator = BUILDER.comment("Excavation radius for Redstone Excavator (radius 1 = 3×1 area)")
                .defineInRange("Redstone", 1, 0, Integer.MAX_VALUE);
        radiusObsidianExcavator = BUILDER.comment("Excavation radius for Obsidian Excavator (radius 1 = 3×1 area)")
                .defineInRange("Obsidian", 1, 0, Integer.MAX_VALUE);
        radiusDiamondExcavator = BUILDER.comment("Excavation radius for Diamond Excavator (radius 1 = 3×1 area)")
                .defineInRange("Diamond", 1, 0, Integer.MAX_VALUE);
        radiusEmeraldExcavator = BUILDER.comment("Excavation radius for Emerald Excavator (radius 1 = 3×1 area)")
                .defineInRange("Emerald", 1, 0, Integer.MAX_VALUE);
        radiusNetheriteExcavator = BUILDER.comment("Excavation radius for Netherite Excavator (radius 1 = 3×1 area)")
                .defineInRange("Netherite", 1, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("Hammer Durability Settings");
        durabilityWoodenHammer = BUILDER.comment("Durability of the wooden hammer.")
                .defineInRange("Wooden", 302, 0, Integer.MAX_VALUE);
        durabilityStoneHammer = BUILDER.comment("Durability of the stone hammer.")
                .defineInRange("Stone", 650, 0, Integer.MAX_VALUE);
        durabilityCopperHammer = BUILDER.comment("Durability of the copper hammer.")
                .defineInRange("Copper", 850, 0, Integer.MAX_VALUE);
        durabilityIronHammer = BUILDER.comment("Durability of the iron hammer.")
                .defineInRange("Iron", 1300, 0, Integer.MAX_VALUE);
        durabilityGoldHammer = BUILDER.comment("Durability of the gold hammer.")
                .defineInRange("Gold", 750, 0, Integer.MAX_VALUE);
        durabilityLapisHammer = BUILDER.comment("Durability of the lapis hammer.")
                .defineInRange("Lapis", 1100, 0, Integer.MAX_VALUE);
        durabilityRedstoneHammer = BUILDER.comment("Durability of the redstone hammer.")
                .defineInRange("Redstone", 1100, 0, Integer.MAX_VALUE);
        durabilityObsidianHammer = BUILDER.comment("Durability of the obsidian hammer.")
                .defineInRange("Obsidian", 11200, 0, Integer.MAX_VALUE);
        durabilityDiamondHammer = BUILDER.comment("Durability of the diamond hammer.")
                .defineInRange("Diamond", 8025, 0, Integer.MAX_VALUE);
        durabilityEmeraldHammer = BUILDER.comment("Durability of the emerald hammer.")
                .defineInRange("Emerald", 9768, 0, Integer.MAX_VALUE);
        durabilityNetheriteHammer = BUILDER.comment("Durability of the netherite hammer.")
                .defineInRange("Netherite", 13675, 0, Integer.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("Hammer Radius Settings");
        radiusWoodenHammer = BUILDER.comment("Hammering radius for Wooden Hammer (radius 1 = 3×1 area)")
                .defineInRange("Wooden", 1, 0, Integer.MAX_VALUE);
        radiusStoneHammer = BUILDER.comment("Hammering radius for Stone Hammer (radius 1 = 3×1 area)")
                .defineInRange("Stone", 1, 0, Integer.MAX_VALUE);
        radiusCopperHammer = BUILDER.comment("Hammering radius for Copper Hammer (radius 1 = 3×1 area)")
                .defineInRange("Copper", 1, 0, Integer.MAX_VALUE);
        radiusIronHammer = BUILDER.comment("Hammering radius for Iron Hammer (radius 1 = 3×1 area)")
                .defineInRange("Iron", 1, 0, Integer.MAX_VALUE);
        radiusGoldHammer = BUILDER.comment("Hammering radius for Gold Hammer (radius 1 = 3×1 area)")
                .defineInRange("Gold", 1, 0, Integer.MAX_VALUE);
        radiusLapisHammer = BUILDER.comment("Hammering radius for Lapis Hammer (radius 1 = 3×1 area)")
                .defineInRange("Lapis", 1, 0, Integer.MAX_VALUE);
        radiusRedstoneHammer = BUILDER.comment("Hammering radius for Redstone Hammer (radius 1 = 3×1 area)")
                .defineInRange("Redstone", 1, 0, Integer.MAX_VALUE);
        radiusObsidianHammer = BUILDER.comment("Hammering radius for Obsidian Hammer (radius 1 = 3×1 area)")
                .defineInRange("Obsidian", 1, 0, Integer.MAX_VALUE);
        radiusDiamondHammer = BUILDER.comment("Hammering radius for Diamond Hammer (radius 1 = 3×1 area)")
                .defineInRange("Diamond", 1, 0, Integer.MAX_VALUE);
        radiusEmeraldHammer = BUILDER.comment("Hammering radius for Emerald Hammer (radius 1 = 3×1 area)")
                .defineInRange("Emerald", 1, 0, Integer.MAX_VALUE);
        radiusNetheriteHammer = BUILDER.comment("Hammering radius for Netherite Hammer (radius 1 = 3×1 area)")
                .defineInRange("Netherite", 1, 0, Integer.MAX_VALUE);

        SPEC = BUILDER.build();
    }

    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
                .autosave()
                .sync()
                .writingMode(com.electronwill.nightconfig.core.io.WritingMode.REPLACE)
                .build();

        configData.load();
        SPEC.setConfig(configData);
    }
}