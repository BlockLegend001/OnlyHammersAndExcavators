package com.blocklegend001.onlyhammersandexcavators.item;

import com.blocklegend001.onlyhammersandexcavators.config.ModConfigs;
import com.blocklegend001.onlyhammersandexcavators.utils.ModTags;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

public class ModToolMaterials {

    public static final ToolMaterial WOODEN_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            ModConfigs.DurabilityWoodenExcavator,
            2,
            0.0F,
            15,
            ItemTags.WOODEN_TOOL_MATERIALS
    );

    public static final ToolMaterial STONE_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            ModConfigs.DurabilityStoneExcavator,
            4,
            1.0F,
            5,
            ItemTags.STONE_TOOL_MATERIALS
    );

    public static final ToolMaterial IRON_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.DurabilityIronExcavator,
            6,
            2.0F,
            14,
            ItemTags.IRON_TOOL_MATERIALS
    );

    public static final ToolMaterial GOLD_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_GOLD_TOOL,
            ModConfigs.DurabilityGoldExcavator,
            12,
            0.0F,
            22,
            ItemTags.GOLD_TOOL_MATERIALS
    );

    public static final ToolMaterial LAPIS_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.DurabilityLapisExcavator,
            6,
            2.0F,
            14,
            ModTags.Items.LAPIS_EXCAVATORS_REPAIRS
    );

    public static final ToolMaterial REDSTONE_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.DurabilityRedstoneExcavator,
            6,
            2.0F,
            14,
            ModTags.Items.REDSTONE_EXCAVATORS_REPAIRS
    );

    public static final ToolMaterial DIAMOND_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            ModConfigs.DurabilityDiamondExcavator,
            8,
            3.0F,
            10,
            ItemTags.DIAMOND_TOOL_MATERIALS
    );

    public static final ToolMaterial EMERALD_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.DurabilityEmeraldExcavator,
            9,
            4.0F,
            15,
            ModTags.Items.EMERALD_EXCAVATORS_REPAIRS
    );

    public static final ToolMaterial OBSIDIAN_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.DurabilityObsidianExcavator,
            9,
            4.0F,
            10,
            ModTags.Items.OBSIDIAN_EXCAVATORS_REPAIRS
    );

    public static final ToolMaterial NETHERITE_EXCAVATOR = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.DurabilityNetheriteExcavator,
            9,
            4.0F,
            15,
            ItemTags.NETHERITE_TOOL_MATERIALS
    );

    public static final ToolMaterial WOODEN_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            ModConfigs.DurabilityWoodenHammer,
            2,
            0.0F,
            15,
            ItemTags.WOODEN_TOOL_MATERIALS
    );

    public static final ToolMaterial STONE_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            ModConfigs.DurabilityStoneHammer,
            4,
            1.0F,
            5,
            ItemTags.STONE_TOOL_MATERIALS
    );

    public static final ToolMaterial IRON_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.DurabilityIronHammer,
            6,
            2.0F,
            14,
            ItemTags.IRON_TOOL_MATERIALS
    );

    public static final ToolMaterial GOLD_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_GOLD_TOOL,
            ModConfigs.DurabilityGoldHammer,
            12,
            0.0F,
            22,
            ItemTags.GOLD_TOOL_MATERIALS
    );

    public static final ToolMaterial LAPIS_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.DurabilityLapisHammer,
            6,
            2.0F,
            14,
            ModTags.Items.LAPIS_HAMMERS_REAPIRS
    );

    public static final ToolMaterial REDSTONE_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.DurabilityRedstoneHammer,
            6,
            2.0F,
            14,
            ModTags.Items.REDSTONE_HAMMERS_REAPIRS
    );

    public static final ToolMaterial DIAMOND_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            ModConfigs.DurabilityDiamondHammer,
            8,
            3.0F,
            10,
            ItemTags.DIAMOND_TOOL_MATERIALS
    );

    public static final ToolMaterial EMERALD_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.DurabilityEmeraldHammer,
            9,
            4.0F,
            15,
            ModTags.Items.EMERALD_HAMMERS_REAPIRS
    );

    public static final ToolMaterial OBSIDIAN_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.DurabilityObsidianHammer,
            9,
            4.0F,
            10,
            ModTags.Items.OBSIDIAN_HAMMERS_REAPIRS
    );

    public static final ToolMaterial NETHERITE_HAMMER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.DurabilityNetheriteHammer,
            9,
            4.0F,
            15,
            ItemTags.NETHERITE_TOOL_MATERIALS
    );
}