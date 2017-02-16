package com.spikespaz.essentialadditions.proxy;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import com.spikespaz.essentialadditions.items.ModItems;
import com.spikespaz.essentialadditions.main.CraftingRecipes;
import com.spikespaz.essentialadditions.main.EventHandler;
import com.spikespaz.essentialadditions.main.FuelHandler;
import com.spikespaz.essentialadditions.world.WorldGeneration;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
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
        modifyStacks();
        GameRegistry.registerFuelHandler(new FuelHandler());
        // modGenerationWeight being set to 10 is polite to other mods, and will take it's ore generation someplace last.
        GameRegistry.registerWorldGenerator(new WorldGeneration(), 10);
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }

    public void postInit(FMLPostInitializationEvent e) {}

    // Register items and blocks to the game. Easier than having two separate functions.
    public void RegisterModObject(Object object) {
        if (object instanceof Item) {
            Item item = (Item) object;
            GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
        //    System.out.println("========================================================================> Registered Items in game.");
        } else if (object instanceof Block) {
            Block block = (Block) object;
            GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
        //    System.out.println("========================================================================> Registered Blocks in game.");
        }
    }

    private static void modifyStacks() {
        // Change vanilla stack sizes.
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
