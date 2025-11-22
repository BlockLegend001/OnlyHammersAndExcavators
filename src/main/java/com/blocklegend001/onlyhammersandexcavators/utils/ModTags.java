package com.blocklegend001.onlyhammersandexcavators.utils;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {

        public static final TagKey<Item> WOODEN_HAMMER = createTag("wooden_hammer");
        public static final TagKey<Item> STONE_HAMMER = createTag("stone_hammer");
        public static final TagKey<Item> IRON_HAMMER = createTag("iron_hammer");
        public static final TagKey<Item> GOLD_HAMMER = createTag("gold_hammer");
        public static final TagKey<Item> LAPIS_HAMMER = createTag("lapis_hammer");
        public static final TagKey<Item> REDSTONE_HAMMER = createTag("redstone_hammer");
        public static final TagKey<Item> OBSIDIAN_HAMMER = createTag("obsidian_hammer");
        public static final TagKey<Item> DIAMOND_HAMMER = createTag("diamond_hammer");
        public static final TagKey<Item> EMERALD_HAMMER = createTag("emerald_hammer");
        public static final TagKey<Item> NETHERITE_HAMMER = createTag("netherite_hammer");
        public static final TagKey<Item> WOODEN_EXCAVATOR = createTag("wooden_excavator");
        public static final TagKey<Item> STONE_EXCAVATOR = createTag("stone_excavator");
        public static final TagKey<Item> IRON_EXCAVATOR = createTag("iron_excavator");
        public static final TagKey<Item> GOLD_EXCAVATOR = createTag("gold_excavator");
        public static final TagKey<Item> LAPIS_EXCAVATOR = createTag("lapis_excavator");
        public static final TagKey<Item> REDSTONE_EXCAVATOR = createTag("redstone_excavator");
        public static final TagKey<Item> OBSIDIAN_EXCAVATOR = createTag("obsidian_excavator");
        public static final TagKey<Item> DIAMOND_EXCAVATOR = createTag("diamond_excavator");
        public static final TagKey<Item> EMERALD_EXCAVATOR = createTag("emerald_excavator");
        public static final TagKey<Item> NETHERITE_EXCAVATOR = createTag("netherite_excavator");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(OnlyHammersAndExcavators.MOD_ID, name));
        }
    }
}