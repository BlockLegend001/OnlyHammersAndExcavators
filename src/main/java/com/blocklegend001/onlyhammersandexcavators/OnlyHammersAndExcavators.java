package com.blocklegend001.onlyhammersandexcavators;

import com.blocklegend001.onlyhammersandexcavators.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod("onlyhammersandexcavators")
public class OnlyHammersAndExcavators {
    public static final String MODID = "onlyhammersandexcavators";

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ONLYHAMMERSANDEXCAVATORS = CREATIVE_MODE_TABS.register("onlyhammersandexcavators", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.onlyhammersandexcavators"))
            .icon(() -> ModItems.NETHERITE_EXCAVATOR.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.WOODEN_HAMMER.get());
                output.accept(ModItems.STONE_HAMMER.get());
                output.accept(ModItems.IRON_HAMMER.get());
                output.accept(ModItems.GOLD_HAMMER.get());
                output.accept(ModItems.REDSTONE_HAMMER.get());
                output.accept(ModItems.LAPIS_HAMMER.get());
                output.accept(ModItems.DIAMOND_HAMMER.get());
                output.accept(ModItems.EMERALD_HAMMER.get());
                output.accept(ModItems.OBSIDIAN_HAMMER.get());
                output.accept(ModItems.NETHERITE_HAMMER.get());

                output.accept(ModItems.WOODEN_EXCAVATOR.get());
                output.accept(ModItems.STONE_EXCAVATOR.get());
                output.accept(ModItems.IRON_EXCAVATOR.get());
                output.accept(ModItems.GOLD_EXCAVATOR.get());
                output.accept(ModItems.REDSTONE_EXCAVATOR.get());
                output.accept(ModItems.LAPIS_EXCAVATOR.get());
                output.accept(ModItems.DIAMOND_EXCAVATOR.get());
                output.accept(ModItems.EMERALD_EXCAVATOR.get());
                output.accept(ModItems.OBSIDIAN_EXCAVATOR.get());
                output.accept(ModItems.NETHERITE_EXCAVATOR.get());
            }).build());

    public OnlyHammersAndExcavators(IEventBus modEventBus) {
        ModConfigs.loadConfig();
        NeoForge.EVENT_BUS.register(ModEventsExcavator.class);
        NeoForge.EVENT_BUS.register(ModEventsHammer.class);
        CREATIVE_MODE_TABS.register(modEventBus);
        ModItems.register(modEventBus);
    }
}
