package com.blocklegend001.onlyhammersandexcavators.utils;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;

@EventBusSubscriber(modid = OnlyHammersAndExcavators.MODID, value = Dist.CLIENT)

public class KeyBinding {

    public static final KeyMapping SHOW_OUTLINE_KEY = new KeyMapping(
            "key.onlyhammersandexcavators.showoutline",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_O,
            "key.category.onlyhammersandexcavators.showoutline"
    );

    @SubscribeEvent
    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(SHOW_OUTLINE_KEY);
    }
}