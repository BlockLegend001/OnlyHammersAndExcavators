package com.blocklegend001.onlyhammersandexcavators.utils;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber(modid = OnlyHammersAndExcavators.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)

public class KeyBinding {

    public static final KeyMapping HAE_SHOW_OUTLINE_KEY = new KeyMapping(
            "key.onlyhammersandexcavators.showoutline",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_O,
            "key.category.onlyhammersandexcavators.showoutline"
    );

    @SubscribeEvent
    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(HAE_SHOW_OUTLINE_KEY);
    }
}