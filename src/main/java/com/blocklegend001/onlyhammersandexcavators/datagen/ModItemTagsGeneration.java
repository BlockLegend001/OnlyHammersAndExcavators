package com.blocklegend001.onlyhammersandexcavators.datagen;

import com.blocklegend001.onlyhammersandexcavators.item.ModItems;
import com.blocklegend001.onlyhammersandexcavators.utils.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
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
        valueLookupBuilder(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.COPPER_HAMMER)
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
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);


        valueLookupBuilder(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.COPPER_HAMMER)
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
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);


        valueLookupBuilder(ItemTags.VANISHING_ENCHANTABLE).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.COPPER_HAMMER)
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
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ItemTags.MINING_ENCHANTABLE).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.COPPER_HAMMER)
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
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.COPPER_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.LAPIS_HAMMER)
                .add(ModItems.REDSTONE_HAMMER)
                .add(ModItems.OBSIDIAN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.EMERALD_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);

        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.WOODEN_EXCAVATOR)
                .add(ModItems.STONE_EXCAVATOR)
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ItemTags.BREAKS_DECORATED_POTS).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.COPPER_HAMMER)
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
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ConventionalItemTags.TOOLS).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.COPPER_HAMMER)
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
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ItemTags.CLUSTER_MAX_HARVESTABLES).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.COPPER_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.LAPIS_HAMMER)
                .add(ModItems.REDSTONE_HAMMER)
                .add(ModItems.OBSIDIAN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.EMERALD_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);

        valueLookupBuilder(ConventionalItemTags.MINING_TOOL_TOOLS).add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.COPPER_HAMMER)
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
                .add(ModItems.COPPER_EXCAVATOR)
                .add(ModItems.IRON_EXCAVATOR)
                .add(ModItems.GOLD_EXCAVATOR)
                .add(ModItems.LAPIS_EXCAVATOR)
                .add(ModItems.REDSTONE_EXCAVATOR)
                .add(ModItems.OBSIDIAN_EXCAVATOR)
                .add(ModItems.DIAMOND_EXCAVATOR)
                .add(ModItems.EMERALD_EXCAVATOR)
                .add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ModTags.Items.WOODEN_HAMMER).add(ModItems.WOODEN_HAMMER);
        valueLookupBuilder(ModTags.Items.STONE_HAMMER).add(ModItems.STONE_HAMMER);
        valueLookupBuilder(ModTags.Items.COPPER_HAMMER).add(ModItems.COPPER_HAMMER);
        valueLookupBuilder(ModTags.Items.IRON_HAMMER).add(ModItems.IRON_HAMMER);
        valueLookupBuilder(ModTags.Items.GOLD_HAMMER).add(ModItems.GOLD_HAMMER);
        valueLookupBuilder(ModTags.Items.LAPIS_HAMMER).add(ModItems.LAPIS_HAMMER);
        valueLookupBuilder(ModTags.Items.REDSTONE_HAMMER).add(ModItems.REDSTONE_HAMMER);
        valueLookupBuilder(ModTags.Items.OBSIDIAN_HAMMER).add(ModItems.OBSIDIAN_HAMMER);
        valueLookupBuilder(ModTags.Items.DIAMOND_HAMMER).add(ModItems.DIAMOND_HAMMER);
        valueLookupBuilder(ModTags.Items.EMERALD_HAMMER).add(ModItems.EMERALD_HAMMER);
        valueLookupBuilder(ModTags.Items.NETHERITE_HAMMER).add(ModItems.NETHERITE_HAMMER);
        valueLookupBuilder(ModTags.Items.WOODEN_EXCAVATOR).add(ModItems.WOODEN_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.STONE_EXCAVATOR).add(ModItems.STONE_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.COPPER_EXCAVATOR).add(ModItems.COPPER_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.IRON_EXCAVATOR).add(ModItems.IRON_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.GOLD_EXCAVATOR).add(ModItems.GOLD_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.LAPIS_EXCAVATOR).add(ModItems.LAPIS_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.REDSTONE_EXCAVATOR).add(ModItems.REDSTONE_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.OBSIDIAN_EXCAVATOR).add(ModItems.OBSIDIAN_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.DIAMOND_EXCAVATOR).add(ModItems.DIAMOND_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.EMERALD_EXCAVATOR).add(ModItems.EMERALD_EXCAVATOR);
        valueLookupBuilder(ModTags.Items.NETHERITE_EXCAVATOR).add(ModItems.NETHERITE_EXCAVATOR);

        valueLookupBuilder(ModTags.Items.LAPIS_EXCAVATORS_REPAIRS).add(Items.LAPIS_LAZULI);
        valueLookupBuilder(ModTags.Items.REDSTONE_EXCAVATORS_REPAIRS).add(Items.REDSTONE);
        valueLookupBuilder(ModTags.Items.EMERALD_EXCAVATORS_REPAIRS).add(Items.EMERALD);
        valueLookupBuilder(ModTags.Items.OBSIDIAN_EXCAVATORS_REPAIRS).add(Items.OBSIDIAN);

        valueLookupBuilder(ModTags.Items.LAPIS_HAMMERS_REAPIRS).add(Items.LAPIS_LAZULI);
        valueLookupBuilder(ModTags.Items.REDSTONE_HAMMERS_REAPIRS).add(Items.REDSTONE);
        valueLookupBuilder(ModTags.Items.EMERALD_HAMMERS_REAPIRS).add(Items.EMERALD);
        valueLookupBuilder(ModTags.Items.OBSIDIAN_HAMMERS_REAPIRS).add(Items.OBSIDIAN);
    }
}
