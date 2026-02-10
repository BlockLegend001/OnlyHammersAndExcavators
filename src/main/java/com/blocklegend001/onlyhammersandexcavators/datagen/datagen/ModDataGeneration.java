package com.blocklegend001.onlyhammersandexcavators.datagen.datagen;

import com.blocklegend001.onlyhammersandexcavators.datagen.ModItemTagsGeneration;
import com.blocklegend001.onlyhammersandexcavators.datagen.ModModelProvider;
import com.blocklegend001.onlyhammersandexcavators.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ModDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModItemTagsGeneration::new);
        pack.addProvider(ModRecipeProvider::new);
    }
}
