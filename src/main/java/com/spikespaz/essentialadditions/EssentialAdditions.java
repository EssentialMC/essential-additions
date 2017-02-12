package com.spikespaz.essentialadditions;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import com.spikespaz.essentialadditions.items.ModItems;
import com.spikespaz.essentialadditions.proxy.CommonProxy;
import com.spikespaz.essentialadditions.world.WorldGeneration;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = EssentialAdditions.MODID, name = EssentialAdditions.NAME, version = EssentialAdditions.VERSION)
public class EssentialAdditions {
    public static final String MODID = "essentialadditions";
    static final String NAME = "Essential Additions";
    static final String VERSION = "1.4.0";
    private static final String CLIENTSIDE = "com.spikespaz.essentialadditions.proxy.ClientProxy";
    private static final String SERVERSIDE = "com.spikespaz.essentialadditions.proxy.CommonProxy";

    @SidedProxy(clientSide = EssentialAdditions.CLIENTSIDE, serverSide = EssentialAdditions.SERVERSIDE)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreLoad(FMLPreInitializationEvent PreEvent) {
        // Load the main mod classes.
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        CraftingRecipes.mainRegistry();
        proxy.registerRenderInfo();

        // Adjust maximum stack sizes.
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
        // Decoration
        Items.wooden_door.setMaxStackSize(16);
        Items.iron_door.setMaxStackSize(16);
        Items.sign.setMaxStackSize(64);
        Items.bed.setMaxStackSize(16);
    }

    @Mod.EventHandler
    public static void Load(FMLInitializationEvent event) {
        GameRegistry.registerFuelHandler(new FuelHandler());
        // modGenerationWeight being set to 10 is polite to other mods, and will take it's ore generation someplace last.
        GameRegistry.registerWorldGenerator(new WorldGeneration(), 10);
    }
}
