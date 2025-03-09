package com.blocklegend001.onlyhammersandexcavators.item;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            OnlyHammersAndExcavators.MOD_ID);

    public static RegistryObject<CreativeModeTab> ONLYHAMMERSANDEXCAVATORS = CREATIVE_MODE_TABS.register("only_hammers_and_excavators", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NETHERITE_HAMMER.get()))
                    .title(Component.translatable("itemGroup.onlyhammersandexcavators")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
