package com.blocklegend001.onlyhammersandexcavators.datagen;

import com.blocklegend001.onlyhammersandexcavators.item.ModItems;
import com.blocklegend001.onlyhammersandexcavators.utils.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsGeneration extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsGeneration(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataOutput, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.LAPIS_HAMMER)
                .add(ModItems.REDSTONE_HAMMER)
                .add(ModItems.OBSIDIAN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.EMERALD_HAMMER)
                .add(ModItems.NETHERITE_HAMMER)
                .add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);


        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.LAPIS_HAMMER)
                .add(ModItems.REDSTONE_HAMMER)
                .add(ModItems.OBSIDIAN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.EMERALD_HAMMER)
                .add(ModItems.NETHERITE_HAMMER)
                .add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);


        getOrCreateTagBuilder(ItemTags.VANISHING_ENCHANTABLE).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.LAPIS_HAMMER)
                .add(ModItems.REDSTONE_HAMMER)
                .add(ModItems.OBSIDIAN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.EMERALD_HAMMER)
                .add(ModItems.NETHERITE_HAMMER)
                .add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.LAPIS_HAMMER)
                .add(ModItems.REDSTONE_HAMMER)
                .add(ModItems.OBSIDIAN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.EMERALD_HAMMER)
                .add(ModItems.NETHERITE_HAMMER)
                .add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        getOrCreateTagBuilder(ModTags.Items.WOODEN_HAMMER).add(ModItems.WOODEN_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.STONE_HAMMER).add(ModItems.STONE_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.IRON_HAMMER).add(ModItems.IRON_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.GOLD_HAMMER).add(ModItems.GOLD_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.LAPIS_HAMMER).add(ModItems.LAPIS_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.REDSTONE_HAMMER).add(ModItems.REDSTONE_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.OBSIDIAN_HAMMER).add(ModItems.OBSIDIAN_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.DIAMOND_HAMMER).add(ModItems.DIAMOND_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.EMERALD_HAMMER).add(ModItems.EMERALD_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.NETHERITE_HAMMER).add(ModItems.NETHERITE_HAMMER);
        getOrCreateTagBuilder(ModTags.Items.WOODEN_EXCAVATOR).add(ModItems.WOODEN_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.STONE_EXCAVATOR).add(ModItems.STONE_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.IRON_EXCAVATOR).add(ModItems.IRON_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.GOLD_EXCAVATOR).add(ModItems.GOLD_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.LAPIS_EXCAVATOR).add(ModItems.LAPIS_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.REDSTONE_EXCAVATOR).add(ModItems.REDSTONE_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.OBSIDIAN_EXCAVATOR).add(ModItems.OBSIDIAN_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.DIAMOND_EXCAVATOR).add(ModItems.DIAMOND_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.EMERALD_EXCAVATOR).add(ModItems.EMERALD_EXCAVATOR);
        getOrCreateTagBuilder(ModTags.Items.NETHERITE_EXCAVATOR).add(ModItems.NETHERITE_EXCAVATOR);

        getOrCreateTagBuilder(ModTags.Items.LAPIS_EXCAVATORS_REPAIRS).add(Items.LAPIS_LAZULI);
        getOrCreateTagBuilder(ModTags.Items.REDSTONE_EXCAVATORS_REPAIRS).add(Items.REDSTONE);
        getOrCreateTagBuilder(ModTags.Items.EMERALD_EXCAVATORS_REPAIRS).add(Items.EMERALD);
        getOrCreateTagBuilder(ModTags.Items.OBSIDIAN_EXCAVATORS_REPAIRS).add(Items.OBSIDIAN);

        getOrCreateTagBuilder(ModTags.Items.LAPIS_HAMMERS_REAPIRS).add(Items.LAPIS_LAZULI);
        getOrCreateTagBuilder(ModTags.Items.REDSTONE_HAMMERS_REAPIRS).add(Items.REDSTONE);
        getOrCreateTagBuilder(ModTags.Items.EMERALD_HAMMERS_REAPIRS).add(Items.EMERALD);
        getOrCreateTagBuilder(ModTags.Items.OBSIDIAN_HAMMERS_REAPIRS).add(Items.OBSIDIAN);
    }
}
