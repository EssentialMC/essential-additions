package com.spikespaz.essentialadditions.proxy;

import com.spikespaz.essentialadditions.main.CraftingRecipes;
import com.spikespaz.essentialadditions.main.FuelHandler;
import com.spikespaz.essentialadditions.blocks.ModBlocks;
import com.spikespaz.essentialadditions.items.ModItems;
import com.spikespaz.essentialadditions.world.WorldGeneration;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        // Load the main mod classes.
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        CraftingRecipes.mainRegistry();
    }

    public void init(FMLInitializationEvent e) {
        // Adjust maximum stack sizes.
        changeVanillaStack();
        GameRegistry.registerFuelHandler(new FuelHandler());
        // modGenerationWeight being set to 10 is polite to other mods, and will take it's ore generation someplace last.
        GameRegistry.registerWorldGenerator(new WorldGeneration(), 10);
    }

    public void postInit(FMLPostInitializationEvent e) {}

    private static void changeVanillaStack(){
        // Miscellaneous
        Items.minecart.setMaxStackSize(16);
        Items.bucket.setMaxStackSize(64);
        Items.writable_book.setMaxStackSize(64);
        // Horse Armor
        Items.diamond_horse_armor.setMaxStackSize(64);
        Items.golden_horse_armor.setMaxStackSize(64);
        Items.iron_horse_armor.setMaxStackSize(64);
        // Records / Music Discs
        Items.record_13.setMaxStackSize(16);
        Items.record_cat.setMaxStackSize(16);
        Items.record_blocks.setMaxStackSize(16);
        Items.record_chirp.setMaxStackSize(16);
        Items.record_far.setMaxStackSize(16);
        Items.record_mall.setMaxStackSize(16);
        Items.record_mellohi.setMaxStackSize(16);
        Items.record_stal.setMaxStackSize(16);
        Items.record_strad.setMaxStackSize(16);
        Items.record_ward.setMaxStackSize(16);
        Items.record_11.setMaxStackSize(16);
        Items.record_wait.setMaxStackSize(16);
        // Throwable Items
        Items.ender_pearl.setMaxStackSize(64);
        Items.egg.setMaxStackSize(64);
        Items.snowball.setMaxStackSize(64);
        Items.potionitem.setMaxStackSize(16);
        // Doors
        Items.oak_door.setMaxStackSize(16);
        Items.spruce_door.setMaxStackSize(16);
        Items.birch_door.setMaxStackSize(16);
        Items.jungle_door.setMaxStackSize(16);
        Items.acacia_door.setMaxStackSize(16);
        Items.dark_oak_door.setMaxStackSize(16);
        Items.iron_door.setMaxStackSize(16);
        // Decoration
        Items.sign.setMaxStackSize(64);
        Items.bed.setMaxStackSize(16);
    }
}
