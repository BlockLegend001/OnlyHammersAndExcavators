package com.blocklegend001.onlyhammersandexcavators.datagen;

import com.blocklegend001.onlyhammersandexcavators.item.ModItems;
import com.blocklegend001.onlyhammersandexcavators.utils.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VanillaItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends VanillaItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.WOODEN_HAMMERS).add(ModItems.WOODEN_HAMMER.getKey());
        tag(ModTags.Items.STONE_HAMMERS).add(ModItems.STONE_HAMMER.getKey());
        tag(ModTags.Items.COPPER_HAMMERS).add(ModItems.COPPER_HAMMER.getKey());
        tag(ModTags.Items.IRON_HAMMERS).add(ModItems.IRON_HAMMER.getKey());
        tag(ModTags.Items.GOLD_HAMMERS).add(ModItems.GOLD_HAMMER.getKey());
        tag(ModTags.Items.LAPIS_HAMMERS).add(ModItems.LAPIS_HAMMER.getKey());
        tag(ModTags.Items.REDSTONE_HAMMERS).add(ModItems.REDSTONE_HAMMER.getKey());
        tag(ModTags.Items.DIAMOND_HAMMERS).add(ModItems.DIAMOND_HAMMER.getKey());
        tag(ModTags.Items.EMERALD_HAMMERS).add(ModItems.EMERALD_HAMMER.getKey());
        tag(ModTags.Items.OBSIDIAN_HAMMERS).add(ModItems.OBSIDIAN_HAMMER.getKey());
        tag(ModTags.Items.NETHERITE_HAMMERS).add(ModItems.NETHERITE_HAMMER.getKey());

        tag(ModTags.Items.WOODEN_EXCAVATORS).add(ModItems.WOODEN_EXCAVATOR.getKey());
        tag(ModTags.Items.STONE_EXCAVATORS).add(ModItems.STONE_EXCAVATOR.getKey());
        tag(ModTags.Items.COPPER_EXCAVATORS).add(ModItems.COPPER_EXCAVATOR.getKey());
        tag(ModTags.Items.IRON_EXCAVATORS).add(ModItems.IRON_EXCAVATOR.getKey());
        tag(ModTags.Items.GOLD_EXCAVATORS).add(ModItems.GOLD_EXCAVATOR.getKey());
        tag(ModTags.Items.LAPIS_EXCAVATORS).add(ModItems.LAPIS_EXCAVATOR.getKey());
        tag(ModTags.Items.REDSTONE_EXCAVATORS).add(ModItems.REDSTONE_EXCAVATOR.getKey());
        tag(ModTags.Items.DIAMOND_EXCAVATORS).add(ModItems.DIAMOND_EXCAVATOR.getKey());
        tag(ModTags.Items.EMERALD_EXCAVATORS).add(ModItems.EMERALD_EXCAVATOR.getKey());
        tag(ModTags.Items.OBSIDIAN_EXCAVATORS).add(ModItems.OBSIDIAN_EXCAVATOR.getKey());
        tag(ModTags.Items.NETHERITE_EXCAVATORS).add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey())

                .add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey())

                .add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(ItemTags.VANISHING_ENCHANTABLE).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey())

                .add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(ItemTags.MINING_ENCHANTABLE).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey())

                .add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(ItemTags.PICKAXES).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey());

        tag(ItemTags.SHOVELS).add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(ItemTags.CLUSTER_MAX_HARVESTABLES).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey());

        tag(ItemTags.BREAKS_DECORATED_POTS).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey())

                .add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(Tags.Items.TOOLS).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey())

                .add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());

        tag(Tags.Items.MINING_TOOL_TOOLS).add(ModItems.WOODEN_HAMMER.getKey())
                .add(ModItems.STONE_HAMMER.getKey())
                .add(ModItems.COPPER_HAMMER.getKey())
                .add(ModItems.IRON_HAMMER.getKey())
                .add(ModItems.GOLD_HAMMER.getKey())
                .add(ModItems.REDSTONE_HAMMER.getKey())
                .add(ModItems.LAPIS_HAMMER.getKey())
                .add(ModItems.DIAMOND_HAMMER.getKey())
                .add(ModItems.EMERALD_HAMMER.getKey())
                .add(ModItems.OBSIDIAN_HAMMER.getKey())
                .add(ModItems.NETHERITE_HAMMER.getKey())

                .add(ModItems.WOODEN_EXCAVATOR.getKey())
                .add(ModItems.STONE_EXCAVATOR.getKey())
                .add(ModItems.COPPER_EXCAVATOR.getKey())
                .add(ModItems.IRON_EXCAVATOR.getKey())
                .add(ModItems.GOLD_EXCAVATOR.getKey())
                .add(ModItems.REDSTONE_EXCAVATOR.getKey())
                .add(ModItems.LAPIS_EXCAVATOR.getKey())
                .add(ModItems.DIAMOND_EXCAVATOR.getKey())
                .add(ModItems.EMERALD_EXCAVATOR.getKey())
                .add(ModItems.OBSIDIAN_EXCAVATOR.getKey())
                .add(ModItems.NETHERITE_EXCAVATOR.getKey());
    }
}

