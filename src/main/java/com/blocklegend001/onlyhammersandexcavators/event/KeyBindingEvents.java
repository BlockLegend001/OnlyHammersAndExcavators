package com.blocklegend001.onlyhammersandexcavators.event;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import com.blocklegend001.onlyhammersandexcavators.utils.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

@EventBusSubscriber(modid = OnlyHammersAndExcavators.MODID, value = Dist.CLIENT)
public class KeyBindingEvents {

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {

        if (KeyBinding.HAE_SHOW_OUTLINE_KEY.consumeClick()) {

            OnlyHammersAndExcavators.SHOW_OUTLINE_ENABLED =
                    !OnlyHammersAndExcavators.SHOW_OUTLINE_ENABLED;

            var mc = Minecraft.getInstance();

            if (mc.player != null) {
                mc.player.displayClientMessage(
                        Component.literal(
                                "Outline: " +
                                        (OnlyHammersAndExcavators.SHOW_OUTLINE_ENABLED ? "ON" : "OFF")
                        ), false
                );
            }
        }
    }
}