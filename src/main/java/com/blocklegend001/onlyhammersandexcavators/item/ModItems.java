package com.blocklegend001.onlyhammersandexcavators.item;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import com.blocklegend001.onlyhammersandexcavators.item.custom.excavator.*;
import com.blocklegend001.onlyhammersandexcavators.item.custom.hammer.*;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer",
            new WoodenHammer(ModToolMaterials.WOODEN_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_HAMMER, 1, -3.3F))));

    public static final Item STONE_HAMMER = registerItem("stone_hammer",
            new StoneHammer(ModToolMaterials.STONE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STONE_HAMMER, 1, -3.3F))));

    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new IronHammer(ModToolMaterials.IRON_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRON_HAMMER, 1, -3.3F))));

    public static final Item GOLD_HAMMER = registerItem("gold_hammer",
            new GoldHammer(ModToolMaterials.GOLD_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.GOLD_HAMMER, 1, -3.3F))));

    public static final Item LAPIS_HAMMER = registerItem("lapis_hammer",
            new LapisHammer(ModToolMaterials.LAPIS_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LAPIS_HAMMER, 1, -3.3F))));

    public static final Item REDSTONE_HAMMER = registerItem("redstone_hammer",
            new RedstoneHammer(ModToolMaterials.REDSTONE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.REDSTONE_HAMMER, 1, -3.3F))));

    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new DiamondHammer(ModToolMaterials.DIAMOND_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.DIAMOND_HAMMER, 1, -3.3F))));

    public static final Item EMERALD_HAMMER = registerItem("emerald_hammer",
            new EmeraldHammer(ModToolMaterials.EMERALD_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.EMERALD_HAMMER, 1, -3.3F))));

    public static final Item OBSIDIAN_HAMMER = registerItem("obsidian_hammer",
            new ObsidianHammer(ModToolMaterials.OBSIDIAN_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN_HAMMER, 1, -3.3F))));

    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new NetheriteHammer(ModToolMaterials.NETHERITE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.NETHERITE_HAMMER, 1, -3.3F))));

    public static final Item WOODEN_EXCAVATOR = registerItem("wooden_excavator",
            new WoodenExcavator(ModToolMaterials.WOODEN_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WOODEN_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item STONE_EXCAVATOR = registerItem("stone_excavator",
            new StoneExcavator(ModToolMaterials.STONE_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STONE_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item IRON_EXCAVATOR = registerItem("iron_excavator",
            new IronExcavator(ModToolMaterials.IRON_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRON_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item GOLD_EXCAVATOR = registerItem("gold_excavator",
            new GoldExcavator(ModToolMaterials.GOLD_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.GOLD_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item LAPIS_EXCAVATOR = registerItem("lapis_excavator",
            new LapisExcavator(ModToolMaterials.LAPIS_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.LAPIS_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item REDSTONE_EXCAVATOR = registerItem("redstone_excavator",
            new RedstoneExcavator(ModToolMaterials.REDSTONE_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.REDSTONE_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item DIAMOND_EXCAVATOR = registerItem("diamond_excavator",
            new DiamondExcavator(ModToolMaterials.DIAMOND_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.DIAMOND_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item EMERALD_EXCAVATOR = registerItem("emerald_excavator",
            new EmeraldExcavator(ModToolMaterials.EMERALD_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.EMERALD_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item OBSIDIAN_EXCAVATOR = registerItem("obsidian_excavator",
            new ObsidianExcavator(ModToolMaterials.OBSIDIAN_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN_EXCAVATOR, 1.5F, -3.0F))));

    public static final Item NETHERITE_EXCAVATOR = registerItem("netherite_excavator",
            new NetheriteExcavator(ModToolMaterials.NETHERITE_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.NETHERITE_EXCAVATOR, 1.5F, -3.0F))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OnlyHammersAndExcavators.LOGGER.debug("Registering Mod Items for " + OnlyHammersAndExcavators.MOD_ID);
    }
}
