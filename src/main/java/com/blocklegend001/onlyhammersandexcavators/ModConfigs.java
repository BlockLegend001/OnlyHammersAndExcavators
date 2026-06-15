package com.blocklegend001.onlyhammersandexcavators;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModConfigs {
    private static final File CONFIG_FILE = new File("config/onlyhammersandexcavators-common.toml");

    public static int DurabilityWoodenExcavator = 302;
    public static int DurabilityStoneExcavator = 650;
    public static int DurabilityCopperExcavator = 850;
    public static int DurabilityIronExcavator = 1300;
    public static int DurabilityGoldExcavator = 750;
    public static int DurabilityLapisExcavator = 1100;
    public static int DurabilityRedstoneExcavator = 1100;
    public static int DurabilityObsidianExcavator = 11200;
    public static int DurabilityDiamondExcavator = 8025;
    public static int DurabilityEmeraldExcavator = 9768;
    public static int DurabilityNetheriteExcavator = 13675;

    public static int radiusWoodenExcavator = 1;
    public static int radiusStoneExcavator = 1;
    public static int radiusCopperExcavator = 1;
    public static int radiusIronExcavator = 1;
    public static int radiusGoldExcavator = 1;
    public static int radiusLapisExcavator = 1;
    public static int radiusRedstoneExcavator = 1;
    public static int radiusObsidianExcavator = 1;
    public static int radiusDiamondExcavator = 1;
    public static int radiusEmeraldExcavator = 1;
    public static int radiusNetheriteExcavator = 1;

    public static int DurabilityWoodenHammer = 302;
    public static int DurabilityStoneHammer = 650;
    public static int DurabilityCopperHammer = 850;
    public static int DurabilityIronHammer = 1300;
    public static int DurabilityGoldHammer = 750;
    public static int DurabilityLapisHammer = 1100;
    public static int DurabilityRedstoneHammer = 1100;
    public static int DurabilityObsidianHammer = 11200;
    public static int DurabilityDiamondHammer = 8025;
    public static int DurabilityEmeraldHammer = 9768;
    public static int DurabilityNetheriteHammer = 13675;

    public static int radiusWoodenHammer = 1;
    public static int radiusStoneHammer = 1;
    public static int radiusCopperHammer = 1;
    public static int radiusIronHammer = 1;
    public static int radiusGoldHammer = 1;
    public static int radiusLapisHammer = 1;
    public static int radiusRedstoneHammer = 1;
    public static int radiusObsidianHammer = 1;
    public static int radiusDiamondHammer = 1;
    public static int radiusEmeraldHammer = 1;
    public static int radiusNetheriteHammer = 1;


    public static void loadConfig() {
        if (!CONFIG_FILE.exists()) {
            saveConfig();
        } else {
            try (FileReader reader = new FileReader(CONFIG_FILE)) {
                JsonObject config = JsonParser.parseReader(reader).getAsJsonObject();

                DurabilityWoodenHammer = config.get("DurabilityWoodenHammer").getAsInt();
                DurabilityStoneHammer = config.get("DurabilityStoneHammer").getAsInt();
                DurabilityCopperHammer = config.get("DurabilityCopperHammer").getAsInt();
                DurabilityIronHammer = config.get("DurabilityIronHammer").getAsInt();
                DurabilityGoldHammer = config.get("DurabilityGoldHammer").getAsInt();
                DurabilityLapisHammer = config.get("DurabilityLapisHammer").getAsInt();
                DurabilityRedstoneHammer = config.get("DurabilityRedstoneHammer").getAsInt();
                DurabilityObsidianHammer = config.get("DurabilityObsidianHammer").getAsInt();
                DurabilityDiamondHammer = config.get("DurabilityDiamondHammer").getAsInt();
                DurabilityEmeraldHammer = config.get("DurabilityEmeraldHammer").getAsInt();
                DurabilityNetheriteHammer = config.get("DurabilityNetheriteHammer").getAsInt();

                radiusWoodenHammer = config.get("radiusWoodenHammer").getAsInt();
                radiusStoneHammer = config.get("radiusStoneHammer").getAsInt();
                radiusCopperHammer = config.get("radiusCopperHammer").getAsInt();
                radiusIronHammer = config.get("radiusIronHammer").getAsInt();
                radiusGoldHammer = config.get("radiusGoldHammer").getAsInt();
                radiusLapisHammer = config.get("radiusLapisHammer").getAsInt();
                radiusRedstoneHammer = config.get("radiusRedstoneHammer").getAsInt();
                radiusObsidianHammer = config.get("radiusObsidianHammer").getAsInt();
                radiusDiamondHammer = config.get("radiusDiamondHammer").getAsInt();
                radiusEmeraldHammer = config.get("radiusEmeraldHammer").getAsInt();
                radiusNetheriteHammer = config.get("radiusNetheriteHammer").getAsInt();

                DurabilityWoodenExcavator = config.get("DurabilityWoodenExcavator").getAsInt();
                DurabilityStoneExcavator = config.get("DurabilityStoneExcavator").getAsInt();
                DurabilityCopperExcavator = config.get("DurabilityCopperExcavator").getAsInt();
                DurabilityIronExcavator = config.get("DurabilityIronExcavator").getAsInt();
                DurabilityGoldExcavator = config.get("DurabilityGoldExcavator").getAsInt();
                DurabilityLapisExcavator = config.get("DurabilityLapisExcavator").getAsInt();
                DurabilityRedstoneExcavator = config.get("DurabilityRedstoneExcavator").getAsInt();
                DurabilityObsidianExcavator = config.get("DurabilityObsidianExcavator").getAsInt();
                DurabilityDiamondExcavator = config.get("DurabilityDiamondExcavator").getAsInt();
                DurabilityEmeraldExcavator = config.get("DurabilityEmeraldExcavator").getAsInt();
                DurabilityNetheriteExcavator = config.get("DurabilityNetheriteExcavator").getAsInt();

                radiusWoodenExcavator = config.get("radiusWoodenExcavator").getAsInt();
                radiusStoneExcavator = config.get("radiusStoneExcavator").getAsInt();
                radiusCopperExcavator = config.get("radiusCopperExcavator").getAsInt();
                radiusIronExcavator = config.get("radiusIronExcavator").getAsInt();
                radiusGoldExcavator = config.get("radiusGoldExcavator").getAsInt();
                radiusLapisExcavator = config.get("radiusLapisExcavator").getAsInt();
                radiusRedstoneExcavator = config.get("radiusRedstoneExcavator").getAsInt();
                radiusObsidianExcavator = config.get("radiusObsidianExcavator").getAsInt();
                radiusDiamondExcavator = config.get("radiusDiamondExcavator").getAsInt();
                radiusEmeraldExcavator = config.get("radiusEmeraldExcavator").getAsInt();
                radiusNetheriteExcavator = config.get("radiusNetheriteExcavator").getAsInt();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void saveConfig() {
        JsonObject config = new JsonObject();

        config.addProperty("DurabilityWoodenHammer", DurabilityWoodenHammer);
        config.addProperty("DurabilityStoneHammer", DurabilityStoneHammer);
        config.addProperty("DurabilityCopperHammer", DurabilityCopperHammer);
        config.addProperty("DurabilityIronHammer", DurabilityIronHammer);
        config.addProperty("DurabilityGoldHammer", DurabilityGoldHammer);
        config.addProperty("DurabilityLapisHammer", DurabilityLapisHammer);
        config.addProperty("DurabilityRedstoneHammer", DurabilityRedstoneHammer);
        config.addProperty("DurabilityObsidianHammer", DurabilityObsidianHammer);
        config.addProperty("DurabilityDiamondHammer", DurabilityDiamondHammer);
        config.addProperty("DurabilityEmeraldHammer", DurabilityEmeraldHammer);
        config.addProperty("DurabilityNetheriteHammer", DurabilityNetheriteHammer);

        config.addProperty("radiusWoodenHammer", radiusWoodenHammer);
        config.addProperty("radiusStoneHammer", radiusStoneHammer);
        config.addProperty("radiusCopperHammer", radiusCopperHammer);
        config.addProperty("radiusIronHammer", radiusIronHammer);
        config.addProperty("radiusGoldHammer", radiusGoldHammer);
        config.addProperty("radiusLapisHammer", radiusLapisHammer);
        config.addProperty("radiusRedstoneHammer", radiusRedstoneHammer);
        config.addProperty("radiusObsidianHammer", radiusObsidianHammer);
        config.addProperty("radiusDiamondHammer", radiusDiamondHammer);
        config.addProperty("radiusEmeraldHammer", radiusEmeraldHammer);
        config.addProperty("radiusNetheriteHammer", radiusNetheriteHammer);

        config.addProperty("DurabilityWoodenExcavator", DurabilityWoodenExcavator);
        config.addProperty("DurabilityStoneExcavator", DurabilityStoneExcavator);
        config.addProperty("DurabilityCopperExcavator", DurabilityCopperExcavator);
        config.addProperty("DurabilityIronExcavator", DurabilityIronExcavator);
        config.addProperty("DurabilityGoldExcavator", DurabilityGoldExcavator);
        config.addProperty("DurabilityLapisExcavator", DurabilityLapisExcavator);
        config.addProperty("DurabilityRedstoneExcavator", DurabilityRedstoneExcavator);
        config.addProperty("DurabilityObsidianExcavator", DurabilityObsidianExcavator);
        config.addProperty("DurabilityDiamondExcavator", DurabilityDiamondExcavator);
        config.addProperty("DurabilityEmeraldExcavator", DurabilityEmeraldExcavator);
        config.addProperty("DurabilityNetheriteExcavator", DurabilityNetheriteExcavator);

        config.addProperty("radiusWoodenExcavator", radiusWoodenExcavator);
        config.addProperty("radiusStoneExcavator", radiusStoneExcavator);
        config.addProperty("radiusCopperExcavator", radiusCopperExcavator);
        config.addProperty("radiusIronExcavator", radiusIronExcavator);
        config.addProperty("radiusGoldExcavator", radiusGoldExcavator);
        config.addProperty("radiusLapisExcavator", radiusLapisExcavator);
        config.addProperty("radiusRedstoneExcavator", radiusRedstoneExcavator);
        config.addProperty("radiusObsidianExcavator", radiusObsidianExcavator);
        config.addProperty("radiusDiamondExcavator", radiusDiamondExcavator);
        config.addProperty("radiusEmeraldExcavator", radiusEmeraldExcavator);
        config.addProperty("radiusNetheriteExcavator", radiusNetheriteExcavator);
        try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            writer.write(gson.toJson(config));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}