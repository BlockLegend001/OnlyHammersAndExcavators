package com.blocklegend001.onlyhammersandexcavators.item;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import com.blocklegend001.onlyhammersandexcavators.item.custom.Excavator;
import com.blocklegend001.onlyhammersandexcavators.item.custom.Hammer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_EXCAVATOR = registerItem("wooden_excavator",
            new Excavator(ModToolMaterials.WOODEN_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "wooden_excavator")))));

    public static final Item STONE_EXCAVATOR = registerItem("stone_excavator",
            new Excavator(ModToolMaterials.STONE_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "stone_excavator")))));

    public static final Item IRON_EXCAVATOR = registerItem("iron_excavator",
            new Excavator(ModToolMaterials.IRON_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "iron_excavator")))));

    public static final Item GOLD_EXCAVATOR = registerItem("gold_excavator",
            new Excavator(ModToolMaterials.GOLD_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "gold_excavator")))));

    public static final Item LAPIS_EXCAVATOR = registerItem("lapis_excavator",
            new Excavator(ModToolMaterials.LAPIS_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "lapis_excavator")))));

    public static final Item REDSTONE_EXCAVATOR = registerItem("redstone_excavator",
            new Excavator(ModToolMaterials.REDSTONE_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "redstone_excavator")))));

    public static final Item DIAMOND_EXCAVATOR = registerItem("diamond_excavator",
            new Excavator(ModToolMaterials.DIAMOND_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "diamond_excavator")))));

    public static final Item EMERALD_EXCAVATOR = registerItem("emerald_excavator",
            new Excavator(ModToolMaterials.EMERALD_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "emerald_excavator")))));

    public static final Item OBSIDIAN_EXCAVATOR = registerItem("obsidian_excavator",
            new Excavator(ModToolMaterials.OBSIDIAN_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "obsidian_excavator")))));

    public static final Item NETHERITE_EXCAVATOR = registerItem("netherite_excavator",
            new Excavator(ModToolMaterials.NETHERITE_EXCAVATOR, 1.5F, -3.0F,
                    new Item.Settings().fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "netherite_excavator")))));

    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer",
            new Hammer(ModToolMaterials.WOODEN_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "wooden_hammer")))));

    public static final Item STONE_HAMMER = registerItem("stone_hammer",
            new Hammer(ModToolMaterials.STONE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "stone_hammer")))));

    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new Hammer(ModToolMaterials.IRON_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "iron_hammer")))));

    public static final Item GOLD_HAMMER = registerItem("gold_hammer",
            new Hammer(ModToolMaterials.GOLD_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "gold_hammer")))));

    public static final Item LAPIS_HAMMER = registerItem("lapis_hammer",
            new Hammer(ModToolMaterials.LAPIS_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "lapis_hammer")))));

    public static final Item REDSTONE_HAMMER = registerItem("redstone_hammer",
            new Hammer(ModToolMaterials.REDSTONE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "redstone_hammer")))));

    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new Hammer(ModToolMaterials.DIAMOND_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "diamond_hammer")))));

    public static final Item EMERALD_HAMMER = registerItem("emerald_hammer",
            new Hammer(ModToolMaterials.EMERALD_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "emerald_hammer")))));

    public static final Item OBSIDIAN_HAMMER = registerItem("obsidian_hammer",
            new Hammer(ModToolMaterials.OBSIDIAN_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).fireproof()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "obsidian_hammer")))));

    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new Hammer(ModToolMaterials.NETHERITE_HAMMER, 1, -3.3F,
                    new Item.Settings().maxCount(1).fireproof()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, "netherite_hammer")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OnlyHammersAndExcavators.LOGGER.debug("Registering Mod Items for " + OnlyHammersAndExcavators.MOD_ID);
    }
}
