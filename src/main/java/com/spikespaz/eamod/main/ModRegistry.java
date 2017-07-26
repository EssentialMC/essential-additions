package com.spikespaz.eamod.main;

import com.spikespaz.eamod.block.ModBlocks;
import com.spikespaz.eamod.item.ModItems;
import com.spikespaz.eamod.proxy.ClientProxy;
import com.spikespaz.eamod.tileentity.TileEntityEyeOre;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.spikespaz.eamod.main.EssentialAdditions.proxy;

public class ModRegistry {
    // Register all item and their registry names.
    public static void registerItems() {
        // Emerald Armor
        proxy.registerModItem(ModItems.EMERALD_HELMET, "emerald_helmet");
        proxy.registerModItem(ModItems.EMERALD_CHESTPLATE, "emerald_chestplate");
        proxy.registerModItem(ModItems.EMERALD_BOOTS, "emerald_boots");
        proxy.registerModItem(ModItems.EMERALD_LEGGINGS, "emerald_leggings");
        
        // Obsidian Armor
        proxy.registerModItem(ModItems.OBSIDIAN_HELMET, "obsidian_helmet");
        proxy.registerModItem(ModItems.OBSIDIAN_CHESTPLATE, "obsidian_chestplate");
        proxy.registerModItem(ModItems.OBSIDIAN_LEGGINGS, "obsidian_leggings");
        proxy.registerModItem(ModItems.OBSIDIAN_BOOTS, "obsidian_boots");
        
        // Ruby Armor
        proxy.registerModItem(ModItems.RUBY_HELMET, "ruby_helmet");
        proxy.registerModItem(ModItems.RUBY_CHESTPLATE, "ruby_chestplate");
        proxy.registerModItem(ModItems.RUBY_LEGGINGS, "ruby_leggings");
        proxy.registerModItem(ModItems.RUBY_BOOTS, "ruby_boots");
        
        // Prismarine Armor
        proxy.registerModItem(ModItems.PRISMARINE_HELMET, "prismarine_helmet");
        proxy.registerModItem(ModItems.PRISMARINE_CHESTPLATE, "prismarine_chestplate");
        proxy.registerModItem(ModItems.PRISMARINE_LEGGINGS, "prismarine_leggings");
        proxy.registerModItem(ModItems.PRISMARINE_BOOTS, "prismarine_boots");
        
        // Emerald Tools
        proxy.registerModItem(ModItems.EMERALD_SWORD, "emerald_sword");
        proxy.registerModItem(ModItems.EMERALD_AXE, "emerald_axe");
        proxy.registerModItem(ModItems.EMERALD_SHOVEL, "emerald_shovel");
        proxy.registerModItem(ModItems.EMERALD_PICKAXE, "emerald_pickaxe");
        proxy.registerModItem(ModItems.EMERALD_HOE, "emerald_hoe");
        
        // Obsidian Tools
        proxy.registerModItem(ModItems.OBSIDIAN_SWORD, "obsidian_sword");
        proxy.registerModItem(ModItems.OBSIDIAN_AXE, "obsidian_axe");
        proxy.registerModItem(ModItems.OBSIDIAN_SHOVEL, "obsidian_shovel");
        proxy.registerModItem(ModItems.OBSIDIAN_PICKAXE, "obsidian_pickaxe");
        proxy.registerModItem(ModItems.OBSIDIAN_HOE, "obsidian_hoe");
        
        // Ruby Tools
        proxy.registerModItem(ModItems.RUBY_SWORD, "ruby_sword");
        proxy.registerModItem(ModItems.RUBY_AXE, "ruby_axe");
        proxy.registerModItem(ModItems.RUBY_SHOVEL, "ruby_shovel");
        proxy.registerModItem(ModItems.RUBY_PICKAXE, "ruby_pickaxe");
        proxy.registerModItem(ModItems.RUBY_HOE, "ruby_hoe");

        // Prismarine Tools
        proxy.registerModItem(ModItems.PRISMARINE_SWORD, "prismarine_sword");
        proxy.registerModItem(ModItems.PRISMARINE_AXE, "prismarine_axe");
        proxy.registerModItem(ModItems.PRISMARINE_SHOVEL, "prismarine_shovel");
        proxy.registerModItem(ModItems.PRISMARINE_PICKAXE, "prismarine_pickaxe");
        proxy.registerModItem(ModItems.PRISMARINE_HOE, "prismarine_hoe");
        
        // Crafting Items
        proxy.registerModItem(ModItems.OBSIDIAN_SHARD, "obsidian_shard");
        proxy.registerModItem(ModItems.SULFUR, "sulfur");
        proxy.registerModItem(ModItems.CHARCOAL_DUST, "charcoal_dust");

        proxy.registerModItem(ModItems.RUBY, "ruby");
        proxy.registerModItem(ModItems.IRON_PLATING, "iron_plating");
        proxy.registerModItem(ModItems.GOLD_PLATING, "gold_plating");
        proxy.registerModItem(ModItems.CHAIN_LINK, "chain_link");
    }

    public static void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntityEyeOre.class, "eye_ore_te");
    }

    // Entries to render all item.
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

        // Prismarine Armor
        ClientProxy.renderModObject(ModItems.PRISMARINE_HELMET);
        ClientProxy.renderModObject(ModItems.PRISMARINE_CHESTPLATE);
        ClientProxy.renderModObject(ModItems.PRISMARINE_LEGGINGS);
        ClientProxy.renderModObject(ModItems.PRISMARINE_BOOTS);

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

        // Prismarine Tools
        ClientProxy.renderModObject(ModItems.PRISMARINE_SWORD);
        ClientProxy.renderModObject(ModItems.PRISMARINE_AXE);
        ClientProxy.renderModObject(ModItems.PRISMARINE_SHOVEL);
        ClientProxy.renderModObject(ModItems.PRISMARINE_PICKAXE);
        ClientProxy.renderModObject(ModItems.PRISMARINE_HOE);
        
        // Crafting Items
        ClientProxy.renderModObject(ModItems.OBSIDIAN_SHARD);
        ClientProxy.renderModObject(ModItems.SULFUR);
        ClientProxy.renderModObject(ModItems.CHARCOAL_DUST);

        ClientProxy.renderModObject(ModItems.RUBY);
        ClientProxy.renderModObject(ModItems.IRON_PLATING);
        ClientProxy.renderModObject(ModItems.GOLD_PLATING);
        ClientProxy.renderModObject(ModItems.CHAIN_LINK);
    }

    // Render all block.
    public static void renderBlocks() {
        // Custom Ores
        ClientProxy.renderModObject(ModBlocks.SULFUR_BLOCK);

        ClientProxy.renderModObject(ModBlocks.EYE_ORE);
        // Ruby Blocks
        ClientProxy.renderModObject(ModBlocks.RUBY_ORE);
        ClientProxy.renderModObject(ModBlocks.RUBY_BLOCK);

        // Other
        ClientProxy.renderModObject(ModBlocks.CHARCOAL_BLOCK);
        ClientProxy.renderModObject(ModBlocks.FOREST_MULCH);
    }
}
