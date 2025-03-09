package com.blocklegend001.onlyhammersandexcavators.item;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import com.blocklegend001.onlyhammersandexcavators.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OnlyHammersAndExcavators.MOD_ID);

    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
            () -> new Hammer(Tiers.WOOD, 1, -3.3F, new Item.Properties().durability(302).attributes(PickaxeItem.createAttributes(Tiers.WOOD, 1, -3.3F))));
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new Hammer(Tiers.STONE, 1, -3.3F, new Item.Properties().durability(650).attributes(PickaxeItem.createAttributes(Tiers.STONE, 1, -3.3F))));
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new Hammer(Tiers.IRON, 1, -3.3F, new Item.Properties().durability(1300).attributes(PickaxeItem.createAttributes(Tiers.IRON, 1, -3.3F))));
    public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register("gold_hammer",
            () -> new Hammer(Tiers.GOLD, 1, -3.3F, new Item.Properties().durability(750).attributes(PickaxeItem.createAttributes(Tiers.GOLD, 1, -3.3F))));
    public static final RegistryObject<Item> LAPIS_HAMMER = ITEMS.register("lapis_hammer",
            () -> new LapisHammer(Tiers.IRON, 1, -3.3F, new Item.Properties().durability(1100).attributes(PickaxeItem.createAttributes(Tiers.IRON, 1, -3.3F))));
    public static final RegistryObject<Item> REDSTONE_HAMMER = ITEMS.register("redstone_hammer",
            () -> new RedstoneHammer(Tiers.IRON, 1, -3.3F, new Item.Properties().durability(1100).attributes(PickaxeItem.createAttributes(Tiers.IRON, 1, -3.3F))));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new Hammer(Tiers.DIAMOND, 1, -3.3F, new Item.Properties().durability(8025).attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 1, -3.3F))));
    public static final RegistryObject<Item> EMERALD_HAMMER = ITEMS.register("emerald_hammer",
            () -> new EmeraldHammer(Tiers.NETHERITE, 1, -3.3F, new Item.Properties().durability(9768).attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 1, -3.3F))));
    public static final RegistryObject<Item> OBSIDIAN_HAMMER = ITEMS.register("obsidian_hammer",
            () -> new ObsidianHammer(Tiers.DIAMOND, 1, -3.3F, new Item.Properties().durability(11200).fireResistant().attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 1, -3.3F))));
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new Hammer(Tiers.NETHERITE, 1, -3.3F, new Item.Properties().durability(13675).fireResistant().attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 1, -3.3F))));

    public static final RegistryObject<Item> WOODEN_EXCAVATOR = ITEMS.register("wooden_excavator",
            () -> new Excavator(Tiers.WOOD, 1.5F, -3.0F, new Item.Properties().durability(302).attributes(ShovelItem.createAttributes(Tiers.WOOD, 1.5F, -3.0F))));
    public static final RegistryObject<Item> STONE_EXCAVATOR = ITEMS.register("stone_excavator",
            () -> new Excavator(Tiers.STONE, 1.5F, -3.0F, new Item.Properties().durability(650).attributes(ShovelItem.createAttributes(Tiers.STONE, 1.5F, -3.0F))));
    public static final RegistryObject<Item> IRON_EXCAVATOR = ITEMS.register("iron_excavator",
            () -> new Excavator(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().durability(1300).attributes(ShovelItem.createAttributes(Tiers.IRON, 1.5F, -3.0F))));
    public static final RegistryObject<Item> GOLD_EXCAVATOR = ITEMS.register("gold_excavator",
            () -> new Excavator(Tiers.GOLD, 1.5F, -3.0F, new Item.Properties().durability(750).attributes(ShovelItem.createAttributes(Tiers.GOLD, 1.5F, -3.0F))));
    public static final RegistryObject<Item> LAPIS_EXCAVATOR = ITEMS.register("lapis_excavator",
            () -> new LapisExcavator(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().durability(1100).attributes(ShovelItem.createAttributes(Tiers.IRON, 1.5F, -3.0F))));
    public static final RegistryObject<Item> REDSTONE_EXCAVATOR = ITEMS.register("redstone_excavator",
            () -> new RedstoneExcavator(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().durability(1100).attributes(ShovelItem.createAttributes(Tiers.IRON, 1.5F, -3.0F))));
    public static final RegistryObject<Item> DIAMOND_EXCAVATOR = ITEMS.register("diamond_excavator",
            () -> new Excavator(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties().durability(8025).attributes(ShovelItem.createAttributes(Tiers.DIAMOND, 1.5F, -3.0F))));
    public static final RegistryObject<Item> EMERALD_EXCAVATOR = ITEMS.register("emerald_excavator",
            () -> new EmeraldExcavator(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().durability(9768).attributes(ShovelItem.createAttributes(Tiers.NETHERITE, 1.5F, -3.0F))));
    public static final RegistryObject<Item> OBSIDIAN_EXCAVATOR = ITEMS.register("obsidian_excavator",
            () -> new ObsidianExcavator(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties().durability(11200).fireResistant().attributes(ShovelItem.createAttributes(Tiers.DIAMOND, 1.5F, -3.0F))));
    public static final RegistryObject<Item> NETHERITE_EXCAVATOR = ITEMS.register("netherite_excavator",
            () -> new Excavator(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().durability(13675).fireResistant().attributes(ShovelItem.createAttributes(Tiers.NETHERITE, 1.5F, -3.0F))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

