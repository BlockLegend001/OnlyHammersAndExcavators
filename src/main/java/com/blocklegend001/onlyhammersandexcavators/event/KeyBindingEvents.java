package com.blocklegend001.onlyhammersandexcavators.event;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import com.blocklegend001.onlyhammersandexcavators.utils.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OnlyHammersAndExcavators.MOD_ID, value = Dist.CLIENT)
public class KeyBindingEvents {

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        while (KeyBinding.SHOW_OUTLINE_KEY.consumeClick()) {
            OnlyHammersAndExcavators.SHOW_OUTLINE_ENABLED =
                    !OnlyHammersAndExcavators.SHOW_OUTLINE_ENABLED;

            if (Minecraft.getInstance().player != null) {
                Minecraft.getInstance().player.displayClientMessage(
                        Component.literal(
                                "Outline: " +
                                        (OnlyHammersAndExcavators.SHOW_OUTLINE_ENABLED ? "ON" : "OFF")
                        ), false
                );
            }
        }
    }
}