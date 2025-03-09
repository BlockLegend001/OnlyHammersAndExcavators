package com.blocklegend001.onlyhammersandexcavators.item.custom.hammer;

import com.blocklegend001.onlyhammersandexcavators.item.custom.Hammer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;

public class LapisHammer extends Hammer {

    public LapisHammer(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.getItem() == Items.LAPIS_LAZULI;
    }
}
