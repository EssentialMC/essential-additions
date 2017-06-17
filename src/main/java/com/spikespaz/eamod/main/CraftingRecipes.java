package com.spikespaz.eamod.main;

import com.spikespaz.eamod.block.ModBlocks;
import com.spikespaz.eamod.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipes {
    public static void mainRegistry() {
        addCraftingRecipes();
        addSmeltingRecipes();
    }

    private static void addCraftingRecipes() {
        // Emerald Armor
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_HELMET, 1),
                "EEE", "E E", "   ", 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_CHESTPLATE, 1),
                "E E", "EEE", "EEE", 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_LEGGINGS, 1),
                "EEE", "E E", "E E", 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_BOOTS, 1),
                "   ", "E E", "E E", 'E', Items.EMERALD);
        
        // Obsidian Armor
        GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_HELMET, 1),
                "OOO", "O O", "   ", 'O', ModItems.OBSIDIAN_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_CHESTPLATE, 1),
                "O O", "OOO", "OOO", 'O', ModItems.OBSIDIAN_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_LEGGINGS, 1),
                "OOO", "O O", "O O", 'O', ModItems.OBSIDIAN_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_BOOTS, 1),
                "   ", "O O", "O O", 'O', ModItems.OBSIDIAN_SHARD);

        // Ruby Armor
        GameRegistry.addRecipe(new ItemStack(ModItems.RUBY_HELMET, 1),
                "RRR", "R R", "   ", 'R', ModItems.RUBY);
        GameRegistry.addRecipe(new ItemStack(ModItems.RUBY_CHESTPLATE, 1),
                "R R", "RRR", "RRR", 'R', ModItems.RUBY);
        GameRegistry.addRecipe(new ItemStack(ModItems.RUBY_LEGGINGS, 1),
                "RRR", "R R", "R R", 'R', ModItems.RUBY);
        GameRegistry.addRecipe(new ItemStack(ModItems.RUBY_BOOTS, 1),
                "   ", "R R", "R R", 'R', ModItems.RUBY);

        // Prismarine Armor
        GameRegistry.addRecipe(new ItemStack(ModItems.PRISMARINE_HELMET, 1),
                "RRR", "R R", "   ", 'R', Items.PRISMARINE_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.PRISMARINE_CHESTPLATE, 1),
                "R R", "RRR", "RRR", 'R', Items.PRISMARINE_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.PRISMARINE_LEGGINGS, 1),
                "RRR", "R R", "R R", 'R', Items.PRISMARINE_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.PRISMARINE_BOOTS, 1),
                "   ", "R R", "R R", 'R', Items.PRISMARINE_SHARD);
        
        // Chainmail Armor
        GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_HELMET, 1),
                "CCC", "C C", "   ", 'C', ModItems.CHAIN_LINK);
        GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1),
                "C C", "CCC", "CCC", 'C', ModItems.CHAIN_LINK);
        GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_LEGGINGS, 1),
                "CCC", "C C", "C C", 'C', ModItems.CHAIN_LINK);
        GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_BOOTS, 1),
                "   ", "C C", "C C", 'C', ModItems.CHAIN_LINK);
        
        // Emerald Tools
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_SWORD, 1),
                " E ", " E ", " S ", 'S', Items.STICK, 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_AXE, 1),
                "EE ", "ES ", " S ", 'S', Items.STICK, 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_SHOVEL, 1),
                " E ", " S ", " S ", 'S', Items.STICK, 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_PICKAXE, 1),
                "EEE", " S ", " S ", 'S', Items.STICK, 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_HOE, 1),
                "EE ", " S ", " S ", 'S', Items.STICK, 'E', Items.EMERALD);
        
        // Obsidian Tools
        GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_SWORD, 1),
                " O ", " O ", " S ", 'S', Items.STICK, 'O', ModItems.OBSIDIAN_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_AXE, 1),
                "OO ", "OS ", " S ", 'S', Items.STICK, 'O', ModItems.OBSIDIAN_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_SHOVEL, 1),
                " O ", " S ", " S ", 'S', Items.STICK, 'O', ModItems.OBSIDIAN_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_PICKAXE, 1),
                "OOO", " S ", " S ", 'S', Items.STICK, 'O', ModItems.OBSIDIAN_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_HOE, 1),
                "OO ", " S ", " S ", 'S', Items.STICK, 'O', ModItems.OBSIDIAN_SHARD);

        // Ruby Tools
        GameRegistry.addRecipe(new ItemStack(ModItems.RUBY_SWORD, 1),
                " R ", " R ", " S ", 'S', Items.STICK, 'R', ModItems.RUBY);
        GameRegistry.addRecipe(new ItemStack(ModItems.RUBY_AXE, 1),
                "RR ", "RS ", " S ", 'S', Items.STICK, 'R', ModItems.RUBY);
        GameRegistry.addRecipe(new ItemStack(ModItems.RUBY_SHOVEL, 1),
                " R ", " S ", " S ", 'S', Items.STICK, 'R', ModItems.RUBY);
        GameRegistry.addRecipe(new ItemStack(ModItems.RUBY_PICKAXE, 1),
                "RRR", " S ", " S ", 'S', Items.STICK, 'R', ModItems.RUBY);
        GameRegistry.addRecipe(new ItemStack(ModItems.RUBY_HOE, 1),
                "RR ", " S ", " S ", 'S', Items.STICK, 'R', ModItems.RUBY);

        // Prismarine Tools
        GameRegistry.addRecipe(new ItemStack(ModItems.PRISMARINE_SWORD, 1),
                " R ", " R ", " S ", 'S', Items.STICK, 'R', Items.PRISMARINE_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.PRISMARINE_AXE, 1),
                "RR ", "RS ", " S ", 'S', Items.STICK, 'R', Items.PRISMARINE_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.PRISMARINE_SHOVEL, 1),
                " R ", " S ", " S ", 'S', Items.STICK, 'R', Items.PRISMARINE_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.PRISMARINE_PICKAXE, 1),
                "RRR", " S ", " S ", 'S', Items.STICK, 'R', Items.PRISMARINE_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModItems.PRISMARINE_HOE, 1),
                "RR ", " S ", " S ", 'S', Items.STICK, 'R', Items.PRISMARINE_SHARD);
        
        // Vanilla Items
        GameRegistry.addRecipe(new ItemStack(Items.SADDLE, 1),
                "LLL", "LIL", "S S", 'L', Items.LEATHER, 'I', Items.IRON_INGOT, 'S', Items.STRING);
        GameRegistry.addRecipe(new ItemStack(Items.NAME_TAG, 2),
                " S ", " S ", "TPT", 'S', Items.STRING, 'T', Items.STICK, 'P', Items.PAPER);
        GameRegistry.addRecipe(new ItemStack(Items.LEAD, 1),
                "SS ", "SS ", "  S", 'S', Items.STRING);
        GameRegistry.addRecipe(new ItemStack(Blocks.WEB, 3),
                "SSS", "SSS", "SSS", 'S', Items.STRING);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GUNPOWDER, 2),
                ModItems.CHARCOAL_DUST, ModItems.SULFUR);
        
        // Vanilla Blocks
        GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN, 1),
                "OOO", "OOO", "OOO", 'O', ModItems.OBSIDIAN_SHARD);
        // Horse Armor
        GameRegistry.addRecipe(new ItemStack(Items.IRON_HORSE_ARMOR, 1),
                "  P", "PPP", "PWP", 'P', ModItems.IRON_PLATING, 'W', Blocks.WOOL);
        GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_HORSE_ARMOR, 1),
                "  G", "GGG", "GWG", 'W', Blocks.WOOL, 'G', ModItems.GOLD_PLATING);
        GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_HORSE_ARMOR, 1),
                "DDD", "DAD", "DDD", 'A', Items.IRON_HORSE_ARMOR, 'D', Items.DIAMOND);
        
        // Mod Blocks
        GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN, 1),
                "   ", " OO", " OO", 'O', ModItems.OBSIDIAN_SHARD);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.SULFUR_BLOCK, 1),
                "   ", " SS", " SS", 'S', ModItems.SULFUR);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.CHARCOAL_BLOCK, 1),
                "CCC", "CCC", "CCC", 'C', new ItemStack(Items.COAL, 1, 1));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.RUBY_BLOCK, 1),
                "RRR", "RRR", "RRR", 'R', ModItems.RUBY);
        
        // Mod Resources
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SULFUR, 4),
                ModBlocks.SULFUR_BLOCK);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.RUBY, 9),
                ModBlocks.RUBY_BLOCK);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IRON_PLATING, 2),
                Items.IRON_INGOT, Items.IRON_INGOT);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GOLD_PLATING, 2),
                Items.GOLD_INGOT, Items.GOLD_INGOT);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CHARCOAL_DUST, 2),
                new ItemStack(Items.COAL, 1, 1));
    }

    private static void addSmeltingRecipes() {
        GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 1), 4.0F);

        GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.OBSIDIAN_SHARD, 9), 6.0F);
        GameRegistry.addSmelting(Items.LEATHER, new ItemStack(Items.ROTTEN_FLESH), 2.0F);
    }
}
