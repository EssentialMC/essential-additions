package com.spikespaz.essentialadditions.main;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import com.spikespaz.essentialadditions.items.ModItems;
import com.spikespaz.essentialadditions.proxy.ClientProxy;

import static com.spikespaz.essentialadditions.main.EssentialAdditions.proxy;

public class ModRegistry {
    // Register all items and their unlocalized names.
    public static void registerItems() {
        // Emerald Armor
        proxy.registerModObject(ModItems.EMERALD_CHESTPLATE);
        proxy.registerModObject(ModItems.EMERALD_HELMET);
        proxy.registerModObject(ModItems.EMERALD_BOOTS);
        proxy.registerModObject(ModItems.EMERALD_LEGGINGS);
        // Obsidian Armor
        proxy.registerModObject(ModItems.OBSIDIAN_HELMET);
        proxy.registerModObject(ModItems.OBSIDIAN_CHESTPLATE);
        proxy.registerModObject(ModItems.OBSIDIAN_LEGGINGS);
        proxy.registerModObject(ModItems.OBSIDIAN_BOOTS);
        // Ruby Armor
        proxy.registerModObject(ModItems.RUBY_HELMET);
        proxy.registerModObject(ModItems.RUBY_CHESTPLATE);
        proxy.registerModObject(ModItems.RUBY_LEGGINGS);
        proxy.registerModObject(ModItems.RUBY_BOOTS);
        // Emerald Tools
        proxy.registerModObject(ModItems.EMERALD_SWORD);
        proxy.registerModObject(ModItems.EMERALD_AXE);
        proxy.registerModObject(ModItems.EMERALD_SHOVEL);
        proxy.registerModObject(ModItems.EMERALD_PICKAXE);
        proxy.registerModObject(ModItems.EMERALD_HOE);
        // Obsidian Tools
        proxy.registerModObject(ModItems.OBSIDIAN_SWORD);
        proxy.registerModObject(ModItems.OBSIDIAN_AXE);
        proxy.registerModObject(ModItems.OBSIDIAN_SHOVEL);
        proxy.registerModObject(ModItems.OBSIDIAN_PICKAXE);
        proxy.registerModObject(ModItems.OBSIDIAN_HOE);
        // Ruby Tools
        proxy.registerModObject(ModItems.RUBY_SWORD);
        proxy.registerModObject(ModItems.RUBY_AXE);
        proxy.registerModObject(ModItems.RUBY_SHOVEL);
        proxy.registerModObject(ModItems.RUBY_PICKAXE);
        proxy.registerModObject(ModItems.RUBY_HOE);
        // Crafting Items
        proxy.registerModObject(ModItems.OBSIDIAN_SHARD);
        proxy.registerModObject(ModItems.SULFUR);
        proxy.registerModObject(ModItems.CHARCOAL_DUST);

        proxy.registerModObject(ModItems.RUBY);
        proxy.registerModObject(ModItems.IRON_PLATING);
        proxy.registerModObject(ModItems.GOLD_PLATING);
        proxy.registerModObject(ModItems.CHAIN_LINK);
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
        ClientProxy.renderModObject(ModItems.EMERALD_CHESTPLATE);
        ClientProxy.renderModObject(ModItems.EMERALD_HELMET);
        ClientProxy.renderModObject(ModItems.EMERALD_BOOTS);
        ClientProxy.renderModObject(ModItems.EMERALD_LEGGINGS);
        // Obsidian Armor
        ClientProxy.renderModObject(ModItems.OBSIDIAN_HELMET);
        ClientProxy.renderModObject(ModItems.OBSIDIAN_CHESTPLATE);
        ClientProxy.renderModObject(ModItems.OBSIDIAN_LEGGINGS);
        ClientProxy.renderModObject(ModItems.OBSIDIAN_BOOTS);
        // Ruby Armor
        ClientProxy.renderModObject(ModItems.RUBY_HELMET);
        ClientProxy.renderModObject(ModItems.RUBY_CHESTPLATE);
        ClientProxy.renderModObject(ModItems.RUBY_LEGGINGS);
        ClientProxy.renderModObject(ModItems.RUBY_BOOTS);
        // Emerald Tools
        ClientProxy.renderModObject(ModItems.EMERALD_SWORD);
        ClientProxy.renderModObject(ModItems.EMERALD_AXE);
        ClientProxy.renderModObject(ModItems.EMERALD_SHOVEL);
        ClientProxy.renderModObject(ModItems.EMERALD_PICKAXE);
        ClientProxy.renderModObject(ModItems.EMERALD_HOE);
        // Obsidian Tools
        ClientProxy.renderModObject(ModItems.OBSIDIAN_SWORD);
        ClientProxy.renderModObject(ModItems.OBSIDIAN_AXE);
        ClientProxy.renderModObject(ModItems.OBSIDIAN_SHOVEL);
        ClientProxy.renderModObject(ModItems.OBSIDIAN_PICKAXE);
        ClientProxy.renderModObject(ModItems.OBSIDIAN_HOE);
        // Ruby Tools
        ClientProxy.renderModObject(ModItems.RUBY_SWORD);
        ClientProxy.renderModObject(ModItems.RUBY_AXE);
        ClientProxy.renderModObject(ModItems.RUBY_SHOVEL);
        ClientProxy.renderModObject(ModItems.RUBY_PICKAXE);
        ClientProxy.renderModObject(ModItems.RUBY_HOE);
        // Crafting Items
        ClientProxy.renderModObject(ModItems.OBSIDIAN_SHARD);
        ClientProxy.renderModObject(ModItems.SULFUR);
        ClientProxy.renderModObject(ModItems.CHARCOAL_DUST);

        ClientProxy.renderModObject(ModItems.RUBY);
        ClientProxy.renderModObject(ModItems.IRON_PLATING);
        ClientProxy.renderModObject(ModItems.GOLD_PLATING);
        ClientProxy.renderModObject(ModItems.CHAIN_LINK);
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
