package com.blocklegend001.onlyhammersandexcavators.item;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ONLYHAMMERSANDEXCAVATORS = FabricItemGroupBuilder.build(
            new Identifier(OnlyHammersAndExcavators.MOD_ID, "onlyhammersandexcavators"), () -> new ItemStack(ModItems.NETHERITE_HAMMER));
}
