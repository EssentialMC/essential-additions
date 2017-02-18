package com.spikespaz.essentialadditions.main;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import com.spikespaz.essentialadditions.items.ModItems;
import com.spikespaz.essentialadditions.proxy.ClientProxy;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRegistry {
    // Register all items and their unlocalized names.
    public static void registerItems() {
        // Emerald Armor
        GameRegistry.registerItem(ModItems.emerald_helmet);
        GameRegistry.registerItem(ModItems.emerald_chestplate);
        GameRegistry.registerItem(ModItems.emerald_boots);
        GameRegistry.registerItem(ModItems.emerald_leggings);
        // Obsidian Armor
        GameRegistry.registerItem(ModItems.obsidian_helmet);
        GameRegistry.registerItem(ModItems.obsidian_chestplate);
        GameRegistry.registerItem(ModItems.obsidian_leggings);
        GameRegistry.registerItem(ModItems.obsidian_boots);
        // Ruby Armor
        GameRegistry.registerItem(ModItems.ruby_helmet);
        GameRegistry.registerItem(ModItems.ruby_chestplate);
        GameRegistry.registerItem(ModItems.ruby_leggings);
        GameRegistry.registerItem(ModItems.ruby_boots);
        // Emerald Tools
        GameRegistry.registerItem(ModItems.emerald_sword);
        GameRegistry.registerItem(ModItems.emerald_axe);
        GameRegistry.registerItem(ModItems.emerald_shovel);
        GameRegistry.registerItem(ModItems.emerald_pickaxe);
        GameRegistry.registerItem(ModItems.emerald_hoe);
        // Obsidian Tools
        GameRegistry.registerItem(ModItems.obsidian_sword);
        GameRegistry.registerItem(ModItems.obsidian_axe);
        GameRegistry.registerItem(ModItems.obsidian_shovel);
        GameRegistry.registerItem(ModItems.obsidian_pickaxe);
        GameRegistry.registerItem(ModItems.obsidian_hoe);
        // Ruby Tools
        GameRegistry.registerItem(ModItems.ruby_sword);
        GameRegistry.registerItem(ModItems.ruby_axe);
        GameRegistry.registerItem(ModItems.ruby_shovel);
        GameRegistry.registerItem(ModItems.ruby_pickaxe);
        GameRegistry.registerItem(ModItems.ruby_hoe);
        // Crafting Items
        GameRegistry.registerItem(ModItems.obsidian_shard);
        GameRegistry.registerItem(ModItems.sulfur);
        GameRegistry.registerItem(ModItems.charcoal_dust);

        GameRegistry.registerItem(ModItems.ruby);
        GameRegistry.registerItem(ModItems.iron_plating);
        GameRegistry.registerItem(ModItems.gold_plating);
        GameRegistry.registerItem(ModItems.chain_link);
    }

    // Register all blocks and their unlocalized names.
    public static void registerBlocks() {
        // Custom Ores
        GameRegistry.registerBlock(ModBlocks.sulfur_block);

        GameRegistry.registerBlock(ModBlocks.eye_ore);
        // Ruby Blocks
        GameRegistry.registerBlock(ModBlocks.ruby_ore);
        GameRegistry.registerBlock(ModBlocks.ruby_block);

        // Other
        GameRegistry.registerBlock(ModBlocks.charcoal_block);
    }

    // Entries to render all items.
    public static void renderItems() {
        // Emerald Armor
        ClientProxy.renderModObject(ModItems.emerald_helmet);
        ClientProxy.renderModObject(ModItems.emerald_chestplate);
        ClientProxy.renderModObject(ModItems.emerald_boots);
        ClientProxy.renderModObject(ModItems.emerald_leggings);
        // Obsidian Armor
        ClientProxy.renderModObject(ModItems.obsidian_helmet);
        ClientProxy.renderModObject(ModItems.obsidian_chestplate);
        ClientProxy.renderModObject(ModItems.obsidian_leggings);
        ClientProxy.renderModObject(ModItems.obsidian_boots);
        // Ruby Armor
        ClientProxy.renderModObject(ModItems.ruby_helmet);
        ClientProxy.renderModObject(ModItems.ruby_chestplate);
        ClientProxy.renderModObject(ModItems.ruby_leggings);
        ClientProxy.renderModObject(ModItems.ruby_boots);
        // Emerald Tools
        ClientProxy.renderModObject(ModItems.emerald_sword);
        ClientProxy.renderModObject(ModItems.emerald_axe);
        ClientProxy.renderModObject(ModItems.emerald_shovel);
        ClientProxy.renderModObject(ModItems.emerald_pickaxe);
        ClientProxy.renderModObject(ModItems.emerald_hoe);
        // Obsidian Tools
        ClientProxy.renderModObject(ModItems.obsidian_sword);
        ClientProxy.renderModObject(ModItems.obsidian_axe);
        ClientProxy.renderModObject(ModItems.obsidian_shovel);
        ClientProxy.renderModObject(ModItems.obsidian_pickaxe);
        ClientProxy.renderModObject(ModItems.obsidian_hoe);
        // Ruby Tools
        ClientProxy.renderModObject(ModItems.ruby_sword);
        ClientProxy.renderModObject(ModItems.ruby_axe);
        ClientProxy.renderModObject(ModItems.ruby_shovel);
        ClientProxy.renderModObject(ModItems.ruby_pickaxe);
        ClientProxy.renderModObject(ModItems.ruby_hoe);
        // Crafting Items
        ClientProxy.renderModObject(ModItems.obsidian_shard);
        ClientProxy.renderModObject(ModItems.sulfur);
        ClientProxy.renderModObject(ModItems.charcoal_dust);

        ClientProxy.renderModObject(ModItems.ruby);
        ClientProxy.renderModObject(ModItems.iron_plating);
        ClientProxy.renderModObject(ModItems.gold_plating);
        ClientProxy.renderModObject(ModItems.chain_link);
    }

    // Render all blocks.
    public static void renderBlocks() {
        // Custom Ores
        ClientProxy.renderModObject(ModBlocks.sulfur_block);

        ClientProxy.renderModObject(ModBlocks.eye_ore);
        // Ruby Blocks
        ClientProxy.renderModObject(ModBlocks.ruby_ore);
        ClientProxy.renderModObject(ModBlocks.ruby_block);

        // Other
        ClientProxy.renderModObject(ModBlocks.charcoal_block);
    }
}
