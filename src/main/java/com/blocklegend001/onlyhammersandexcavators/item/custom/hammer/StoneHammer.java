package com.blocklegend001.onlyhammersandexcavators.item.custom.hammer;

import com.blocklegend001.onlyhammersandexcavators.item.custom.Hammer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;

public class StoneHammer extends Hammer {
    public StoneHammer(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings.maxDamage(650));
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.getItem() == Items.COBBLESTONE;
    }

}