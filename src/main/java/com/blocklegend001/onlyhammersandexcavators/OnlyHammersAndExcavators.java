package com.blocklegend001.onlyhammersandexcavators;

import com.blocklegend001.onlyhammersandexcavators.item.ModCreativeModeTabs;
import com.blocklegend001.onlyhammersandexcavators.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.slf4j.Logger;

@Mod(OnlyHammersAndExcavators.MOD_ID)
public class OnlyHammersAndExcavators {

    public static final String MOD_ID = "onlyhammersandexcavators";
    public static final Logger LOGGER = LogUtils.getLogger();

    public OnlyHammersAndExcavators(FMLJavaModLoadingContext context) {
        var modEventBus = context.getModBusGroup();
        context.registerConfig(ModConfig.Type.COMMON, ModConfigs.SPEC, "onlyhammersandexcavators.toml");
        ModConfigs.loadConfig(ModConfigs.SPEC, FMLPaths.CONFIGDIR.get().resolve("onlyhammersandexcavators.toml"));
        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        BuildCreativeModeTabContentsEvent.BUS.addListener(this::addCreative);
        FMLCommonSetupEvent.getBus(modEventBus).addListener(this::setup);
    }

    @SubscribeEvent
    public void setup(final FMLCommonSetupEvent event) {
        ModConfigs.loadConfig(ModConfigs.SPEC, FMLPaths.CONFIGDIR.get().resolve("onlyhammersandexcavators.toml"));
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModCreativeModeTabs.ONLYHAMMERSANDEXCAVATORS.get()) {
            event.accept(ModItems.WOODEN_EXCAVATOR.get());
            event.accept(ModItems.STONE_EXCAVATOR.get());
            event.accept(ModItems.COPPER_EXCAVATOR.get());
            event.accept(ModItems.IRON_EXCAVATOR.get());
            event.accept(ModItems.GOLD_EXCAVATOR.get());
            event.accept(ModItems.LAPIS_EXCAVATOR.get());
            event.accept(ModItems.REDSTONE_EXCAVATOR.get());
            event.accept(ModItems.DIAMOND_EXCAVATOR.get());
            event.accept(ModItems.EMERALD_EXCAVATOR.get());
            event.accept(ModItems.OBSIDIAN_EXCAVATOR.get());
            event.accept(ModItems.NETHERITE_EXCAVATOR.get());

            event.accept(ModItems.WOODEN_HAMMER.get());
            event.accept(ModItems.STONE_HAMMER.get());
            event.accept(ModItems.COPPER_HAMMER.get());
            event.accept(ModItems.IRON_HAMMER.get());
            event.accept(ModItems.GOLD_HAMMER.get());
            event.accept(ModItems.LAPIS_HAMMER.get());
            event.accept(ModItems.REDSTONE_HAMMER.get());
            event.accept(ModItems.DIAMOND_HAMMER.get());
            event.accept(ModItems.EMERALD_HAMMER.get());
            event.accept(ModItems.OBSIDIAN_HAMMER.get());
            event.accept(ModItems.NETHERITE_HAMMER.get());
        }
    }
}