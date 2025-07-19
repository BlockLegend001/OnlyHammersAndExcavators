package com.blocklegend001.onlyhammersandexcavators;

import com.blocklegend001.onlyhammersandexcavators.utils.excavator.ExcavatorOverlayRenderer;
import com.blocklegend001.onlyhammersandexcavators.utils.hammer.HammerOverlayRenderer;
import net.fabricmc.api.ClientModInitializer;

public class OnlyHammersAndExcavatorsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExcavatorOverlayRenderer.init();
        HammerOverlayRenderer.init();
    }
}