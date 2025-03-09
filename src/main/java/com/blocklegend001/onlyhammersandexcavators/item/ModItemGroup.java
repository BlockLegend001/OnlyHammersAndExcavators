package com.blocklegend001.onlyhammersandexcavators.item;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup ONLYHAMMERSANDEXCAVATORS;

    public static void registerItemGroup() {
        ONLYHAMMERSANDEXCAVATORS = FabricItemGroup.builder(new Identifier(OnlyHammersAndExcavators.MOD_ID, "only_hammers_and_excavators"))
                .displayName(Text.literal("Only Hammers and Excavators"))
                .icon(() -> new ItemStack(ModItems.NETHERITE_HAMMER)).build();
    }
}
