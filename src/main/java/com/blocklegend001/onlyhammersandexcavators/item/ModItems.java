package com.blocklegend001.onlyhammersandexcavators.item;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import com.blocklegend001.onlyhammersandexcavators.item.custom.excavator.*;
import com.blocklegend001.onlyhammersandexcavators.item.custom.hammer.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer",
            new WoodenHammer(ToolMaterials.STONE, 1, -3.3F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(302)));

    public static final Item STONE_HAMMER = registerItem("stone_hammer",
            new StoneHammer(ToolMaterials.STONE, 1, -3.3F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(650)));

    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new IronHammer(ToolMaterials.IRON, 1, -3.3F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(1300)));

    public static final Item GOLD_HAMMER = registerItem("gold_hammer",
            new GoldHammer(ToolMaterials.IRON, 1, -3.3F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(750)));

    public static final Item LAPIS_HAMMER = registerItem("lapis_hammer",
            new LapisHammer(ToolMaterials.IRON, 1, -3.3F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(1100)));

    public static final Item REDSTONE_HAMMER = registerItem("redstone_hammer",
            new RedstoneHammer(ToolMaterials.IRON, 1, -3.3F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(1100)));

    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new DiamondHammer(ToolMaterials.DIAMOND, 1, -3.3F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(8025)));

    public static final Item EMERALD_HAMMER = registerItem("emerald_hammer",
            new EmeraldHammer(ToolMaterials.NETHERITE, 1, -3.3F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(9768)));

    public static final Item OBSIDIAN_HAMMER = registerItem("obsidian_hammer",
            new ObsidianHammer(ToolMaterials.DIAMOND, 1, -3.3F,
                    new FabricItemSettings().maxCount(1).fireproof().maxDamageIfAbsent(11200)));

    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new NetheriteHammer(ToolMaterials.NETHERITE, 1, -3.3F,
                    new FabricItemSettings().maxCount(1).fireproof().maxDamageIfAbsent(13675)));

    public static final Item WOODEN_EXCAVATOR = registerItem("wooden_excavator",
            new WoodenExcavator(ToolMaterials.WOOD, 1.5F, -3.0F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(302)));

    public static final Item STONE_EXCAVATOR = registerItem("stone_excavator",
            new StoneExcavator(ToolMaterials.STONE, 1.5F, -3.0F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(650)));

    public static final Item IRON_EXCAVATOR = registerItem("iron_excavator",
            new IronExcavator(ToolMaterials.IRON, 1.5F, -3.0F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(1300)));

    public static final Item GOLD_EXCAVATOR = registerItem("gold_excavator",
            new GoldExcavator(ToolMaterials.GOLD, 1.5F, -3.0F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(750)));

    public static final Item LAPIS_EXCAVATOR = registerItem("lapis_excavator",
            new LapisExcavator(ToolMaterials.IRON, 1.5F, -3.0F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(1100)));

    public static final Item REDSTONE_EXCAVATOR = registerItem("redstone_excavator",
            new RedstoneExcavator(ToolMaterials.IRON, 1.5F, -3.0F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(1100)));

    public static final Item DIAMOND_EXCAVATOR = registerItem("diamond_excavator",
            new DiamondExcavator(ToolMaterials.DIAMOND, 1.5F, -3.0F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(8025)));

    public static final Item EMERALD_EXCAVATOR = registerItem("emerald_excavator",
            new EmeraldExcavator(ToolMaterials.NETHERITE, 1.5F, -3.0F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(9768)));

    public static final Item OBSIDIAN_EXCAVATOR = registerItem("obsidian_excavator",
            new ObsidianExcavator(ToolMaterials.DIAMOND, 1.5F, -3.0F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(11200)));

    public static final Item NETHERITE_EXCAVATOR = registerItem("netherite_excavator",
            new NetheriteExcavator(ToolMaterials.NETHERITE, 1.5F, -3.0F,
                    new FabricItemSettings().maxCount(1).maxDamageIfAbsent(13675)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OnlyHammersAndExcavators.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OnlyHammersAndExcavators.LOGGER.debug("Registering Mod Items for " + OnlyHammersAndExcavators.MOD_ID);
    }
}
