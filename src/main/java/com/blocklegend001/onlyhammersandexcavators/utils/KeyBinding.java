package com.blocklegend001.onlyhammersandexcavators.utils;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;

import static com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators.MOD_ID;

public class KeyBinding {
    public static final KeyMapping.Category ONLYHAMMERSANDEXCAVATORS_CATEGORY =
            KeyMapping.Category.register(
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "showoutline")
            );

    public static final KeyMapping HAE_SHOW_OUTLINE_KEY = new KeyMapping(
            "key.onlyhammersandexcavators.showoutline",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_O,
            ONLYHAMMERSANDEXCAVATORS_CATEGORY
    );

    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(HAE_SHOW_OUTLINE_KEY);
    }
}