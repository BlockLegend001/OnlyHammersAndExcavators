package com.blocklegend001.onlyhammersandexcavators;

import com.blocklegend001.onlyhammersandexcavators.config.ModConfigs;
import com.blocklegend001.onlyhammersandexcavators.item.ModItemGroup;
import com.blocklegend001.onlyhammersandexcavators.item.ModItems;
import com.blocklegend001.onlyhammersandexcavators.utils.ExcavatorUsageEvent;
import com.blocklegend001.onlyhammersandexcavators.utils.HammerUsageEvent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OnlyHammersAndExcavators implements ModInitializer {
    public static final String MOD_ID = "onlyhammersandexcavators";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModConfigs.registerConfigs();
        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
        PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
        PlayerBlockBreakEvents.BEFORE.register(new ExcavatorUsageEvent());

    }
}