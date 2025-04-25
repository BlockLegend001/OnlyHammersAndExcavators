package com.blocklegend001.onlyhammersandexcavators;

import com.blocklegend001.onlyhammersandexcavators.utils.ExcavatorOverlayRenderer;
import com.blocklegend001.onlyhammersandexcavators.utils.HammerOverlayRenderer;
import net.fabricmc.api.ClientModInitializer;

public class OnlyHammersAndExcavatorsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HammerOverlayRenderer.init();
        ExcavatorOverlayRenderer.init();
    }
}
