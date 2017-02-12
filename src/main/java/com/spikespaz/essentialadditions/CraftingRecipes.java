package com.spikespaz.essentialadditions;

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
     /*   GameRegistry.addRecipe(new ItemStack(ModItems.emerald_helmet, 1),
                "EEE", "E E", "   ", 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_chestplate, 1),
                "E E", "EEE", "EEE", 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_leggings, 1),
                "EEE", "E E", "E E", 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_boots, 1),
                "   ", "E E", "E E", 'E', Items.emerald);
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
                "   ", "R R", "R R", 'R', ModItems.ruby);*/
        // Chainmail Armor
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet, 1),
                "CCC", "C C", "   ", 'C', ModItems.chain_link);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate, 1),
                "C C", "CCC", "CCC", 'C', ModItems.chain_link);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings, 1),
                "CCC", "C C", "C C", 'C', ModItems.chain_link);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots, 1),
                "   ", "C C", "C C", 'C', ModItems.chain_link);
        // Emerald Tools
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_sword, 1),
                " E ", " E ", " S ", 'S', Items.stick, 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_axe, 1),
                "EE ", "ES ", " S ", 'S', Items.stick, 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_shovel, 1),
                " E ", " S ", " S ", 'S', Items.stick, 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_pickaxe, 1),
                "EEE", " S ", " S ", 'S', Items.stick, 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.emerald_hoe, 1),
                "EE ", " S ", " S ", 'S', Items.stick, 'E', Items.emerald);
        // Obsidian Tools
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_sword, 1),
                " O ", " O ", " S ", 'S', Items.stick, 'O', ModItems.obsidian_shard);
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_axe, 1),
                "OO ", "OS ", " S ", 'S', Items.stick, 'O', ModItems.obsidian_shard);
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_shovel, 1),
                " O ", " S ", " S ", 'S', Items.stick, 'O', ModItems.obsidian_shard);
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_pickaxe, 1),
                "OOO", " S ", " S ", 'S', Items.stick, 'O', ModItems.obsidian_shard);
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_hoe, 1),
                "OO ", " S ", " S ", 'S', Items.stick, 'O', ModItems.obsidian_shard);
        // ruby Tools
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_sword, 1),
                " R ", " R ", " S ", 'S', Items.stick, 'R', ModItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_axe, 1),
                "RR ", "RS ", " S ", 'S', Items.stick, 'R', ModItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_shovel, 1),
                " R ", " S ", " S ", 'S', Items.stick, 'R', ModItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_pickaxe, 1),
                "RRR", " S ", " S ", 'S', Items.stick, 'R', ModItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.ruby_hoe, 1),
                "RR ", " S ", " S ", 'S', Items.stick, 'R', ModItems.ruby);
        // Vanilla Items
        GameRegistry.addRecipe(new ItemStack(Items.saddle, 1),
                "LLL", "LIL", "S S", 'L', Items.leather, 'I', Items.iron_ingot, 'S', Items.string);
        GameRegistry.addRecipe(new ItemStack(Items.name_tag, 2),
                " S ", " S ", "TPT", 'S', Items.string, 'T', Items.stick, 'P', Items.paper);
        GameRegistry.addRecipe(new ItemStack(Items.lead, 1),
                "SS ", "SS ", "  S", 'S', Items.string);
        GameRegistry.addRecipe(new ItemStack(Blocks.web, 3),
                "SSS", "SSS", "SSS", 'S', Items.string);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder, 2),
                ModItems.charcoal_dust, ModItems.sulfur);
        // Vanilla Blocks
        GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, 1),
                "OOO", "OOO", "OOO", 'O', ModItems.obsidian_shard);
        // Horse Armor
        GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor, 1),
                "  P", "PPP", "PWP", 'P', ModItems.iron_plating, 'W', Blocks.wool);
        GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor, 1),
                "  G", "GGG", "GWG", 'W', Blocks.wool, 'G', ModItems.gold_plating);
        GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor, 1),
                "DDD", "DAD", "DDD", 'A', Items.iron_horse_armor, 'D', Items.diamond);
        // Mod Blocks
        GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, 1),
                "   ", " OO", " OO", 'O', ModItems.obsidian_shard);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.sulfur_block, 1),
                "   ", " SS", " SS", 'S', ModItems.sulfur);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.charcoal_block, 1),
                "CCC", "CCC", "CCC", 'C', new ItemStack(Items.coal, 1, 1));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.ruby_block, 1),
                "RRR", "RRR", "RRR", 'R', ModItems.ruby);
        // Mod Resources
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sulfur, 4),
                ModBlocks.sulfur_block);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ruby, 9),
                ModBlocks.ruby_block);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.iron_plating, 2),
                Items.iron_ingot, Items.iron_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gold_plating, 2),
                Items.gold_ingot, Items.gold_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.charcoal_dust, 2),
                new ItemStack(Items.coal, 1, 1));
    }

    private static void addSmeltingRecipes() {
        GameRegistry.addSmelting(ModBlocks.ruby_ore, new ItemStack(ModItems.ruby, 1), 4.0F);

        GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(ModItems.obsidian_shard, 9), 6.0F);
        GameRegistry.addSmelting(Items.leather, new ItemStack(Items.rotten_flesh), 2.0F);
    }
}
