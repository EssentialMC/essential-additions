package com.spikespaz.essentialadditions.main;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import com.spikespaz.essentialadditions.items.ModItems;
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
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_helmet, 1),
                "EEE", "E E", "   ", 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_chestplate, 1),
                "E E", "EEE", "EEE", 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_leggings, 1),
                "EEE", "E E", "E E", 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_boots, 1),
                "   ", "E E", "E E", 'E', Items.EMERALD);
        // Obsidian Armor
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_helmet, 1),
                "OOO", "O O", "   ", 'O', ModItems.obsidian_shard);
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_chestplate, 1),
                "O O", "OOO", "OOO", 'O', ModItems.obsidian_shard);
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_leggings, 1),
                "OOO", "O O", "O O", 'O', ModItems.obsidian_shard);
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_boots, 1),
                "   ", "O O", "O O", 'O', ModItems.obsidian_shard);
        // ruby Armor
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_helmet, 1),
                "RRR", "R R", "   ", 'R', ModItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_chestplate, 1),
                "R R", "RRR", "RRR", 'R', ModItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_leggings, 1),
                "RRR", "R R", "R R", 'R', ModItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_boots, 1),
                "   ", "R R", "R R", 'R', ModItems.ruby);
        // Chainmail Armor
        GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_HELMET, 1),
                "CCC", "C C", "   ", 'C', ModItems.chain_link);
        GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1),
                "C C", "CCC", "CCC", 'C', ModItems.chain_link);
        GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_LEGGINGS, 1),
                "CCC", "C C", "C C", 'C', ModItems.chain_link);
        GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_BOOTS, 1),
                "   ", "C C", "C C", 'C', ModItems.chain_link);
        // Emerald Tools
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_sword, 1),
                " E ", " E ", " S ", 'S', Items.STICK, 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_axe, 1),
                "EE ", "ES ", " S ", 'S', Items.STICK, 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_shovel, 1),
                " E ", " S ", " S ", 'S', Items.STICK, 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_pickaxe, 1),
                "EEE", " S ", " S ", 'S', Items.STICK, 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_hoe, 1),
                "EE ", " S ", " S ", 'S', Items.STICK, 'E', Items.EMERALD);
        // Obsidian Tools
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_sword, 1),
                " O ", " O ", " S ", 'S', Items.STICK, 'O', ModItems.obsidian_shard);
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_axe, 1),
                "OO ", "OS ", " S ", 'S', Items.STICK, 'O', ModItems.obsidian_shard);
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_shovel, 1),
                " O ", " S ", " S ", 'S', Items.STICK, 'O', ModItems.obsidian_shard);
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_pickaxe, 1),
                "OOO", " S ", " S ", 'S', Items.STICK, 'O', ModItems.obsidian_shard);
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_hoe, 1),
                "OO ", " S ", " S ", 'S', Items.STICK, 'O', ModItems.obsidian_shard);
        // ruby Tools
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_sword, 1),
                " R ", " R ", " S ", 'S', Items.STICK, 'R', ModItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_axe, 1),
                "RR ", "RS ", " S ", 'S', Items.STICK, 'R', ModItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_shovel, 1),
                " R ", " S ", " S ", 'S', Items.STICK, 'R', ModItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_pickaxe, 1),
                "RRR", " S ", " S ", 'S', Items.STICK, 'R', ModItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_hoe, 1),
                "RR ", " S ", " S ", 'S', Items.STICK, 'R', ModItems.ruby);
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
                ModItems.charcoal_dust, ModItems.sulfur);
        // Vanilla Blocks
        GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN, 1),
                "OOO", "OOO", "OOO", 'O', ModItems.obsidian_shard);
        // Horse Armor
        GameRegistry.addRecipe(new ItemStack(Items.IRON_HORSE_ARMOR, 1),
                "  P", "PPP", "PWP", 'P', ModItems.iron_plating, 'W', Blocks.WOOL);
        GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_HORSE_ARMOR, 1),
                "  G", "GGG", "GWG", 'W', Blocks.WOOL, 'G', ModItems.gold_plating);
        GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_HORSE_ARMOR, 1),
                "DDD", "DAD", "DDD", 'A', Items.IRON_HORSE_ARMOR, 'D', Items.DIAMOND);
        // Mod Blocks
        GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN, 1),
                "   ", " OO", " OO", 'O', ModItems.obsidian_shard);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.sulfur_block, 1),
                "   ", " SS", " SS", 'S', ModItems.sulfur);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.charcoal_block, 1),
                "CCC", "CCC", "CCC", 'C', new ItemStack(Items.COAL, 1, 1));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.ruby_block, 1),
                "RRR", "RRR", "RRR", 'R', ModItems.ruby);
        // Mod Resources
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sulfur, 4),
                ModBlocks.sulfur_block);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ruby, 9),
                ModBlocks.ruby_block);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.iron_plating, 2),
                Items.IRON_INGOT, Items.IRON_INGOT);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gold_plating, 2),
                Items.GOLD_INGOT, Items.GOLD_INGOT);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.charcoal_dust, 2),
                new ItemStack(Items.COAL, 1, 1));
    }

    private static void addSmeltingRecipes() {
        GameRegistry.addSmelting(ModBlocks.ruby_ore, new ItemStack(ModItems.ruby, 1), 4.0F);

        GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.obsidian_shard, 9), 6.0F);
        GameRegistry.addSmelting(Items.LEATHER, new ItemStack(Items.ROTTEN_FLESH), 2.0F);
    }
}
