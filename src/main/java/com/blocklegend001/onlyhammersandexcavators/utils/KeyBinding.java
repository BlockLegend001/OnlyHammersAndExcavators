package com.blocklegend001.onlyhammersandexcavators.utils;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;

import static com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators.MODID;

@EventBusSubscriber(modid = MODID, value = Dist.CLIENT)

public class KeyBinding {
    public static final KeyMapping.Category ONLYHAMMERSANDEXCAVATOR_CATEGORY =
            KeyMapping.Category.register(
                    ResourceLocation.fromNamespaceAndPath(MODID, "showoutline")
            );

    public static final KeyMapping SHOW_OUTLINE_KEY = new KeyMapping(
            "key.onlyhammersandexcavators.showoutline",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_O,
            ONLYHAMMERSANDEXCAVATOR_CATEGORY
    );

    @SubscribeEvent
    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(SHOW_OUTLINE_KEY);
    }
}