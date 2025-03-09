package com.blocklegend001.onlyhammersandexcavators.item;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ONLYHAMMERSANDEXCAVATORS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OnlyHammersAndExcavators.MOD_ID, "only_hammers_and_excavators"),
            FabricItemGroup.builder().displayName(Text.literal("Only Hammers And Excavators"))
                    .icon(() -> new ItemStack(ModItems.NETHERITE_HAMMER)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.WOODEN_HAMMER);
                        entries.add(ModItems.STONE_HAMMER);
                        entries.add(ModItems.IRON_HAMMER);
                        entries.add(ModItems.GOLD_HAMMER);
                        entries.add(ModItems.LAPIS_HAMMER);
                        entries.add(ModItems.REDSTONE_HAMMER);
                        entries.add(ModItems.DIAMOND_HAMMER);
                        entries.add(ModItems.EMERALD_HAMMER);
                        entries.add(ModItems.NETHERITE_HAMMER);

                        entries.add(ModItems.WOODEN_EXCAVATOR);
                        entries.add(ModItems.STONE_EXCAVATOR);
                        entries.add(ModItems.IRON_EXCAVATOR);
                        entries.add(ModItems.GOLD_EXCAVATOR);
                        entries.add(ModItems.LAPIS_EXCAVATOR);
                        entries.add(ModItems.REDSTONE_EXCAVATOR);
                        entries.add(ModItems.DIAMOND_EXCAVATOR);
                        entries.add(ModItems.EMERALD_EXCAVATOR);
                        entries.add(ModItems.NETHERITE_EXCAVATOR);
                    })).build());

    public static void registerItemGroups() {
        OnlyHammersAndExcavators.LOGGER.info("Registering Item Groups for " + OnlyHammersAndExcavators.MOD_ID);
    }
}
