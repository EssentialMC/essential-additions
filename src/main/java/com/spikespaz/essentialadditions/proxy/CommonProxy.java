package com.spikespaz.essentialadditions.proxy;

import com.spikespaz.essentialadditions.main.CraftingRecipes;
import com.spikespaz.essentialadditions.main.FuelHandler;
import com.spikespaz.essentialadditions.main.ModRegistry;
import com.spikespaz.essentialadditions.world.WorldGeneration;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        // Load the main mod classes.
        ModRegistry.registerItems();
        ModRegistry.registerTileEntities();
        CraftingRecipes.mainRegistry();
    }

    public void init(FMLInitializationEvent event) {
        // Adjust maximum stack sizes.
        modifyStacks();
        GameRegistry.registerFuelHandler(new FuelHandler());
        // modGenerationWeight being set to 10 is polite to other mods, and will take it's ore generation someplace last.
        GameRegistry.registerWorldGenerator(new WorldGeneration(), 10);
//        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }

    public void postInit(FMLPostInitializationEvent event) {}

    // Register item and block to the game. Easier than having two separate functions.
    public void registerModItem(Item item, String name) {
        item.setRegistryName(name);
        GameRegistry.register(item);
    }

    private static void modifyStacks() {
        // Change vanilla stack sizes.
        // Miscellaneous
        Items.MINECART.setMaxStackSize(16);
        Items.BUCKET.setMaxStackSize(64);
        Items.WRITABLE_BOOK.setMaxStackSize(64);
        // Horse Armor
        Items.DIAMOND_HORSE_ARMOR.setMaxStackSize(64);
        Items.GOLDEN_HORSE_ARMOR.setMaxStackSize(64);
        Items.IRON_HORSE_ARMOR.setMaxStackSize(64);
        // Records / Music Discs
        Items.RECORD_13.setMaxStackSize(16);
        Items.RECORD_CAT.setMaxStackSize(16);
        Items.RECORD_BLOCKS.setMaxStackSize(16);
        Items.RECORD_CHIRP.setMaxStackSize(16);
        Items.RECORD_FAR.setMaxStackSize(16);
        Items.RECORD_MALL.setMaxStackSize(16);
        Items.RECORD_MELLOHI.setMaxStackSize(16);
        Items.RECORD_STAL.setMaxStackSize(16);
        Items.RECORD_STRAD.setMaxStackSize(16);
        Items.RECORD_WARD.setMaxStackSize(16);
        Items.RECORD_11.setMaxStackSize(16);
        Items.RECORD_WAIT.setMaxStackSize(16);
        // Throwable Items
        Items.ENDER_PEARL.setMaxStackSize(64);
        Items.EGG.setMaxStackSize(64);
        Items.SNOWBALL.setMaxStackSize(64);
        // Doors
        Items.OAK_DOOR.setMaxStackSize(16);
        Items.SPRUCE_DOOR.setMaxStackSize(16);
        Items.BIRCH_DOOR.setMaxStackSize(16);
        Items.JUNGLE_DOOR.setMaxStackSize(16);
        Items.ACACIA_DOOR.setMaxStackSize(16);
        Items.DARK_OAK_DOOR.setMaxStackSize(16);
        Items.IRON_DOOR.setMaxStackSize(16);
        // Decoration
        Items.SIGN.setMaxStackSize(64);
        Items.BED.setMaxStackSize(16);
    }
}
