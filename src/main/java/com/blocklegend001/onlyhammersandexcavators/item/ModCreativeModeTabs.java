package com.blocklegend001.onlyhammersandexcavators.item;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OnlyHammersAndExcavators.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab ONLYHAMMERSANDEXCAVATORS;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        ONLYHAMMERSANDEXCAVATORS = event.registerCreativeModeTab(new ResourceLocation(OnlyHammersAndExcavators.MOD_ID, "only_hammers_and_excavators"),
                builder -> builder.icon(() -> new ItemStack(ModItems.NETHERITE_EXCAVATOR.get()))
                        .title(Component.translatable("itemGroup.onlyhammersandexcavators")));
    }
}
