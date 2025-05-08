package com.blocklegend001.onlyhammersandexcavators;

import com.blocklegend001.onlyhammersandexcavators.utils.ExcavatorOverlayRenderer;
import com.blocklegend001.onlyhammersandexcavators.utils.ExcavatorUsageEvent;
import com.blocklegend001.onlyhammersandexcavators.utils.HammerOverlayRenderer;
import com.blocklegend001.onlyhammersandexcavators.utils.HammerUsageEvent;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.util.ActionResult;

public class OnlyHammersAndExcavatorsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExcavatorOverlayRenderer.init();
        HammerOverlayRenderer.init();
        AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
            if (world.isClient) {
                HammerUsageEvent.isSneaking = player.isSneaking();
                ExcavatorUsageEvent.isSneaking = player.isSneaking();
            }
            return ActionResult.PASS;
        });
    }
}