package com.spikespaz.essentialadditions;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import com.spikespaz.essentialadditions.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingRecipes {
    static void mainRegistry() {
        addCraftingRecipes();
        addSmeltingRecipes();
    }

    private static void addCraftingRecipes() {
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldHelmet, 1),
                "EEE", "E E", "   ", 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldChestplate, 1),
                "E E", "EEE", "EEE", 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldLeggings, 1),
                "EEE", "E E", "E E", 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldBoots, 1),
                "   ", "E E", "E E", 'E', Items.emerald);

        GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianHelmet, 1),
                "OOO", "O O", "   ", 'O', ModItems.ObsidianShard);
        GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianChestplate, 1),
                "O O", "OOO", "OOO", 'O', ModItems.ObsidianShard);
        GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianLeggings, 1),
                "OOO", "O O", "O O", 'O', ModItems.ObsidianShard);
        GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianBoots, 1),
                "   ", "O O", "O O", 'O', ModItems.ObsidianShard);

        GameRegistry.addRecipe(new ItemStack(ModItems.RubyHelmet, 1),
                "RRR", "R R", "   ", 'R', ModItems.Ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.RubyChestplate, 1),
                "R R", "RRR", "RRR", 'R', ModItems.Ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.RubyLeggings, 1),
                "RRR", "R R", "R R", 'R', ModItems.Ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.RubyBoots, 1),
                "   ", "R R", "R R", 'R', ModItems.Ruby);

        GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet, 1),
                "CCC", "C C", "   ", 'C', ModItems.ChainLink);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate, 1),
                "C C", "CCC", "CCC", 'C', ModItems.ChainLink);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings, 1),
                "CCC", "C C", "C C", 'C', ModItems.ChainLink);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots, 1),
                "   ", "C C", "C C", 'C', ModItems.ChainLink);

        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldSword, 1),
                " E ", " E ", " S ", 'S', Items.stick, 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldAxe, 1),
                "EE ", "ES ", " S ", 'S', Items.stick, 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldShovel, 1),
                " E ", " S ", " S ", 'S', Items.stick, 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldPickaxe, 1),
                "EEE", " S ", " S ", 'S', Items.stick, 'E', Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldHoe, 1),
                "EE ", " S ", " S ", 'S', Items.stick, 'E', Items.emerald);

        GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianSword, 1),
                " O ", " O ", " S ", 'S', Items.stick, 'O', ModItems.ObsidianShard);
        GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianAxe, 1),
                "OO ", "OS ", " S ", 'S', Items.stick, 'O', ModItems.ObsidianShard);
        GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianShovel, 1),
                " O ", " S ", " S ", 'S', Items.stick, 'O', ModItems.ObsidianShard);
        GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianPickaxe, 1),
                "OOO", " S ", " S ", 'S', Items.stick, 'O', ModItems.ObsidianShard);
        GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianHoe, 1),
                "OO ", " S ", " S ", 'S', Items.stick, 'O', ModItems.ObsidianShard);

        GameRegistry.addRecipe(new ItemStack(ModItems.RubySword, 1),
                " R ", " R ", " S ", 'S', Items.stick, 'R', ModItems.Ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.RubyAxe, 1),
                "RR ", "RS ", " S ", 'S', Items.stick, 'R', ModItems.Ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.RubyShovel, 1),
                " R ", " S ", " S ", 'S', Items.stick, 'R', ModItems.Ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.RubyPickaxe, 1),
                "RRR", " S ", " S ", 'S', Items.stick, 'R', ModItems.Ruby);
        GameRegistry.addRecipe(new ItemStack(ModItems.RubyHoe, 1),
                "RR ", " S ", " S ", 'S', Items.stick, 'R', ModItems.Ruby);

        GameRegistry.addRecipe(new ItemStack(Items.saddle, 1),
                "LLL", "LIL", "S S", 'L', Items.leather, 'I', Items.iron_ingot, 'S', Items.string);
        GameRegistry.addRecipe(new ItemStack(Items.name_tag, 2),
                " S ", " S ", "TPT", 'S', Items.string, 'T', Items.stick, 'P', Items.paper);
        GameRegistry.addRecipe(new ItemStack(Items.lead, 1),
                "SS ", "SS ", "  S", 'S', Items.string);
        GameRegistry.addRecipe(new ItemStack(Blocks.web, 3),
                "SSS", "SSS", "SSS", 'S', Items.string);

        GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, 1),
                "   ", " OO", " OO", 'O', ModItems.ObsidianShard);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.SulfurBlock, 1),
                "   ", " SS", " SS", 'S', ModItems.Sulfur);

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Sulfur, 4),
                ModBlocks.SulfurBlock);

        GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor, 1),
                "  P", "PPP", "PWP", 'P', ModItems.IronPlating, 'W', Blocks.wool);
        GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor, 1),
                "  G", "GGG", "GWG", 'W', Blocks.wool, 'G', ModItems.GoldPlating);
        GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor, 1),
                "DDD", "DAD", "DDD", 'A', Items.iron_horse_armor, 'D', Items.diamond);

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Ruby, 9),
                ModBlocks.RubyBlock);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronPlating, 2),
                Items.iron_ingot, Items.iron_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldPlating, 2),
                Items.gold_ingot, Items.gold_ingot);

        GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder, 2),
                ModItems.CharcoalDust, ModItems.Sulfur);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CharcoalDust, 2),
                Items.coal);


        GameRegistry.addRecipe(new ItemStack(ModBlocks.RubyBlock, 1),
                "RRR", "RRR", "RRR", 'R', ModItems.Ruby);
    }

    private static void addSmeltingRecipes() {
        GameRegistry.addSmelting(ModBlocks.RubyOre, new ItemStack(ModItems.Ruby, 1), 2.0F);

        GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(ModItems.ObsidianShard, 4), 2.0F);
        GameRegistry.addSmelting(Items.leather, new ItemStack(Items.rotten_flesh), 2.0F);
    }
}
