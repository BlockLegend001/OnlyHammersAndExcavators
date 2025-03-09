package com.blocklegend001.onlyhammersandexcavators.utils;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {

        public static final TagKey<Item> WOODEN_HAMMERS = tag("wooden_hammers");
        public static final TagKey<Item> STONE_HAMMERS = tag("stone_hammers");
        public static final TagKey<Item> IRON_HAMMERS = tag("iron_hammers");
        public static final TagKey<Item> GOLD_HAMMERS = tag("gold_hammers");
        public static final TagKey<Item> LAPIS_HAMMERS = tag("lapis_hammers");
        public static final TagKey<Item> REDSTONE_HAMMERS = tag("redstone_hammers");
        public static final TagKey<Item> DIAMOND_HAMMERS = tag("diamond_hammers");
        public static final TagKey<Item> EMERALD_HAMMERS = tag("emerald_hammers");
        public static final TagKey<Item> OBSIDIAN_HAMMERS = tag("obsidian_hammers");
        public static final TagKey<Item> NETHERITE_HAMMERS = tag("netherite_hammers");

        public static final TagKey<Item> WOODEN_EXCAVATORS = tag("wooden_excavators");
        public static final TagKey<Item> STONE_EXCAVATORS = tag("stone_excavators");
        public static final TagKey<Item> IRON_EXCAVATORS = tag("iron_excavators");
        public static final TagKey<Item> GOLD_EXCAVATORS = tag("gold_excavators");
        public static final TagKey<Item> LAPIS_EXCAVATORS = tag("lapis_excavators");
        public static final TagKey<Item> REDSTONE_EXCAVATORS = tag("redstone_excavators");
        public static final TagKey<Item> DIAMOND_EXCAVATORS = tag("diamond_excavators");
        public static final TagKey<Item> EMERALD_EXCAVATORS = tag("emerald_excavators");
        public static final TagKey<Item> OBSIDIAN_EXCAVATORS = tag("obsidian_excavators");
        public static final TagKey<Item> NETHERITE_EXCAVATORS = tag("netherite_excavators");

        private static TagKey<Item> tag(String name) {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyHammersAndExcavators.MOD_ID, name));
        }
    }
}
