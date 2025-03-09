package com.blocklegend001.onlyhammersandexcavators.datagen;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import com.blocklegend001.onlyhammersandexcavators.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OnlyHammersAndExcavators.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.WOODEN_HAMMER);
        handheldItem(ModItems.STONE_HAMMER);
        handheldItem(ModItems.IRON_HAMMER);
        handheldItem(ModItems.GOLD_HAMMER);
        handheldItem(ModItems.REDSTONE_HAMMER);
        handheldItem(ModItems.LAPIS_HAMMER);
        handheldItem(ModItems.DIAMOND_HAMMER);
        handheldItem(ModItems.EMERALD_HAMMER);
        handheldItem(ModItems.OBSIDIAN_HAMMER);
        handheldItem(ModItems.NETHERITE_HAMMER);

        handheldItem(ModItems.WOODEN_EXCAVATOR);
        handheldItem(ModItems.STONE_EXCAVATOR);
        handheldItem(ModItems.IRON_EXCAVATOR);
        handheldItem(ModItems.GOLD_EXCAVATOR);
        handheldItem(ModItems.REDSTONE_EXCAVATOR);
        handheldItem(ModItems.LAPIS_EXCAVATOR);
        handheldItem(ModItems.DIAMOND_EXCAVATOR);
        handheldItem(ModItems.EMERALD_EXCAVATOR);
        handheldItem(ModItems.OBSIDIAN_EXCAVATOR);
        handheldItem(ModItems.NETHERITE_EXCAVATOR);
    }

    private ItemModelBuilder simpleItem(DeferredItem<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(OnlyHammersAndExcavators.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(DeferredItem<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(OnlyHammersAndExcavators.MODID,"item/" + item.getId().getPath()));
    }
}
