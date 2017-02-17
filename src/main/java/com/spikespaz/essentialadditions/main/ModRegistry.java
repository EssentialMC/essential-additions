package com.spikespaz.essentialadditions.main;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import com.spikespaz.essentialadditions.items.ModItems;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
}
