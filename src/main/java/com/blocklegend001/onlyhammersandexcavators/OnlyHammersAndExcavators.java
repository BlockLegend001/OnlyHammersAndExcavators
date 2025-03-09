package com.blocklegend001.onlyhammersandexcavators;

import com.blocklegend001.onlyhammersandexcavators.item.ModItemGroup;
import com.blocklegend001.onlyhammersandexcavators.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OnlyHammersAndExcavators implements ModInitializer {
    public static final String MOD_ID = "onlyhammersandexcavators";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroup();
        ModItems.registerModItems();
    }
}