package com.blocklegend001.onlyhammersandexcavators.item;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {
    public static final CreativeModeTab ONLYHAMMERSANDEXCAVATORS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(OnlyHammersAndExcavators.MOD_ID, "only_hammers_and_excavators"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NETHERITE_HAMMER))
                    .title(Component.translatable("itemGroup.onlyhammersandexcavators.onlyhammersandexcavators").withStyle(ChatFormatting.DARK_AQUA))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.WOODEN_HAMMER);
                        output.accept(ModItems.STONE_HAMMER);
                        output.accept(ModItems.COPPER_HAMMER);
                        output.accept(ModItems.IRON_HAMMER);
                        output.accept(ModItems.GOLD_HAMMER);
                        output.accept(ModItems.LAPIS_HAMMER);
                        output.accept(ModItems.REDSTONE_HAMMER);
                        output.accept(ModItems.DIAMOND_HAMMER);
                        output.accept(ModItems.EMERALD_HAMMER);
                        output.accept(ModItems.NETHERITE_HAMMER);

                        output.accept(ModItems.WOODEN_EXCAVATOR);
                        output.accept(ModItems.STONE_EXCAVATOR);
                        output.accept(ModItems.COPPER_EXCAVATOR);
                        output.accept(ModItems.IRON_EXCAVATOR);
                        output.accept(ModItems.GOLD_EXCAVATOR);
                        output.accept(ModItems.LAPIS_EXCAVATOR);
                        output.accept(ModItems.REDSTONE_EXCAVATOR);
                        output.accept(ModItems.DIAMOND_EXCAVATOR);
                        output.accept(ModItems.EMERALD_EXCAVATOR);
                        output.accept(ModItems.NETHERITE_EXCAVATOR);
                    }).build());

    public static void registerItemGroups() {
        OnlyHammersAndExcavators.LOGGER.info("Registering Item Groups for " + OnlyHammersAndExcavators.MOD_ID);
    }
}
