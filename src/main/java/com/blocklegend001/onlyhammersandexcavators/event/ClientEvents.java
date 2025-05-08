package com.blocklegend001.onlyhammersandexcavators.event;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

@EventBusSubscriber(modid = OnlyHammersAndExcavators.MODID, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Pre event) {
        if (Minecraft.getInstance().player != null) {
            ModEventsHammer.isSneaking = Minecraft.getInstance().player.isShiftKeyDown();
            ModEventsExcavator.isSneaking = Minecraft.getInstance().player.isShiftKeyDown();
        }
    }
}