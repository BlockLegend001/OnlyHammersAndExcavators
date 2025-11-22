package com.blocklegend001.onlyhammersandexcavators.item;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import com.blocklegend001.onlyhammersandexcavators.config.ModConfigs;
import com.blocklegend001.onlyhammersandexcavators.item.custom.excavator.*;
import com.blocklegend001.onlyhammersandexcavators.item.custom.hammer.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer",
            new WoodenHammer(ModToolMaterials.WOODEN_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)));

    public static final Item STONE_HAMMER = registerItem("stone_hammer",
            new StoneHammer(ModToolMaterials.STONE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)));

    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new IronHammer(ModToolMaterials.IRON_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)));

    public static final Item GOLD_HAMMER = registerItem("gold_hammer",
            new GoldHammer(ModToolMaterials.GOLD_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)));

    public static final Item LAPIS_HAMMER = registerItem("lapis_hammer",
            new LapisHammer(ModToolMaterials.LAPIS_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)));

    public static final Item REDSTONE_HAMMER = registerItem("redstone_hammer",
            new RedstoneHammer(ModToolMaterials.REDSTONE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)));

    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new DiamondHammer(ModToolMaterials.DIAMOND_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)));

    public static final Item EMERALD_HAMMER = registerItem("emerald_hammer",
            new EmeraldHammer(ModToolMaterials.EMERALD_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)));

    public static final Item OBSIDIAN_HAMMER = registerItem("obsidian_hammer",
            new ObsidianHammer(ModToolMaterials.OBSIDIAN_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).fireproof()));

    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new NetheriteHammer(ModToolMaterials.NETHERITE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).fireproof()));

    public static final Item WOODEN_EXCAVATOR = registerItem("wooden_excavator",
            new WoodenExcavator(ToolMaterials.WOOD, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamageIfAbsent(ModConfigs.DurabilityWoodenExcavator)));

    public static final Item STONE_EXCAVATOR = registerItem("stone_excavator",
            new StoneExcavator(ToolMaterials.STONE, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamageIfAbsent(ModConfigs.DurabilityStoneExcavator)));

    public static final Item IRON_EXCAVATOR = registerItem("iron_excavator",
            new IronExcavator(ToolMaterials.IRON, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamageIfAbsent(ModConfigs.DurabilityIronExcavator)));

    public static final Item GOLD_EXCAVATOR = registerItem("gold_excavator",
            new GoldExcavator(ToolMaterials.GOLD, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamageIfAbsent(ModConfigs.DurabilityGoldExcavator)));

    public static final Item LAPIS_EXCAVATOR = registerItem("lapis_excavator",
            new LapisExcavator(ToolMaterials.IRON, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamageIfAbsent(ModConfigs.DurabilityLapisExcavator)));

    public static final Item REDSTONE_EXCAVATOR = registerItem("redstone_excavator",
            new RedstoneExcavator(ToolMaterials.IRON, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamageIfAbsent(ModConfigs.DurabilityRedstoneExcavator)));

    public static final Item DIAMOND_EXCAVATOR = registerItem("diamond_excavator",
            new DiamondExcavator(ToolMaterials.DIAMOND, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamageIfAbsent(ModConfigs.DurabilityDiamondExcavator)));

    public static final Item EMERALD_EXCAVATOR = registerItem("emerald_excavator",
            new EmeraldExcavator(ToolMaterials.NETHERITE, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamageIfAbsent(ModConfigs.DurabilityEmeraldExcavator)));

    public static final Item OBSIDIAN_EXCAVATOR = registerItem("obsidian_excavator",
            new ObsidianExcavator(ToolMaterials.DIAMOND, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamageIfAbsent(ModConfigs.DurabilityObsidianExcavator).fireproof()));

    public static final Item NETHERITE_EXCAVATOR = registerItem("netherite_excavator",
            new NetheriteExcavator(ToolMaterials.NETHERITE, 1.5F, -3.0F,
                    new Item.Settings().maxCount(1).maxDamageIfAbsent(ModConfigs.DurabilityNetheriteExcavator).fireproof()));
    
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OnlyHammersAndExcavators.LOGGER.debug("Registering Mod Items for " + OnlyHammersAndExcavators.MOD_ID);
    }
}
