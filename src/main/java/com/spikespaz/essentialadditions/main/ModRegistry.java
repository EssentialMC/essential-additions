package com.spikespaz.essentialadditions.main;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import com.spikespaz.essentialadditions.items.ModItems;
import com.spikespaz.essentialadditions.proxy.ClientProxy;

import static com.spikespaz.essentialadditions.main.EssentialAdditions.proxy;

public class ModRegistry {
    // Register all items and their unlocalized names.
    public static void registerItems() {
        // Emerald Armor
        proxy.registerModObject(ModItems.emerald_chestplate);
        proxy.registerModObject(ModItems.emerald_helmet);
        proxy.registerModObject(ModItems.emerald_boots);
        proxy.registerModObject(ModItems.emerald_leggings);
        // Obsidian Armor
        proxy.registerModObject(ModItems.obsidian_helmet);
        proxy.registerModObject(ModItems.obsidian_chestplate);
        proxy.registerModObject(ModItems.obsidian_leggings);
        proxy.registerModObject(ModItems.obsidian_boots);
        // Ruby Armor
        proxy.registerModObject(ModItems.ruby_helmet);
        proxy.registerModObject(ModItems.ruby_chestplate);
        proxy.registerModObject(ModItems.ruby_leggings);
        proxy.registerModObject(ModItems.ruby_boots);
        // Emerald Tools
        proxy.registerModObject(ModItems.emerald_sword);
        proxy.registerModObject(ModItems.emerald_axe);
        proxy.registerModObject(ModItems.emerald_shovel);
        proxy.registerModObject(ModItems.emerald_pickaxe);
        proxy.registerModObject(ModItems.emerald_hoe);
        // Obsidian Tools
        proxy.registerModObject(ModItems.obsidian_sword);
        proxy.registerModObject(ModItems.obsidian_axe);
        proxy.registerModObject(ModItems.obsidian_shovel);
        proxy.registerModObject(ModItems.obsidian_pickaxe);
        proxy.registerModObject(ModItems.obsidian_hoe);
        // Ruby Tools
        proxy.registerModObject(ModItems.ruby_sword);
        proxy.registerModObject(ModItems.ruby_axe);
        proxy.registerModObject(ModItems.ruby_shovel);
        proxy.registerModObject(ModItems.ruby_pickaxe);
        proxy.registerModObject(ModItems.ruby_hoe);
        // Crafting Items
        proxy.registerModObject(ModItems.obsidian_shard);
        proxy.registerModObject(ModItems.sulfur);
        proxy.registerModObject(ModItems.charcoal_dust);

        proxy.registerModObject(ModItems.ruby);
        proxy.registerModObject(ModItems.iron_plating);
        proxy.registerModObject(ModItems.gold_plating);
        proxy.registerModObject(ModItems.chain_link);
    }

    // Register all blocks and their unlocalized names.
    public static void registerBlocks() {
        // Custom Ores
        proxy.registerModObject(ModBlocks.sulfur_block);

        proxy.registerModObject(ModBlocks.eye_ore);
        // Ruby Blocks
        proxy.registerModObject(ModBlocks.ruby_ore);
        proxy.registerModObject(ModBlocks.ruby_block);

        // Other
        proxy.registerModObject(ModBlocks.charcoal_block);
    }

    // Entries to render all items.
    public static void renderItems() {
        // Emerald Armor
        ClientProxy.renderModObject(ModItems.emerald_chestplate);
        ClientProxy.renderModObject(ModItems.emerald_helmet);
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
