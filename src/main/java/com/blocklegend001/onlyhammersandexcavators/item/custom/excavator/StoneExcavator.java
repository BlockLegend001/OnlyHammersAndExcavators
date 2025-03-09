package com.blocklegend001.onlyhammersandexcavators.item.custom.excavator;

import com.blocklegend001.onlyhammersandexcavators.item.custom.Excavator;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;

public class StoneExcavator extends Excavator {

    public StoneExcavator(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.getItem() == Items.COBBLESTONE;
    }
}