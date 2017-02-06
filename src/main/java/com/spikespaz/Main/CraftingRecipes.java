package com.spikespaz.Main;

import com.spikespaz.blocks.ModBlocks;
import com.spikespaz.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingRecipes
{
  public static void mainRegistry()
  {
    addCraftingRecipes();
    addSmeltingRecipes();
  }

  public static void addCraftingRecipes() { GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldHelmet, 1), new Object[] { "EEE", "E E", "   ", Character.valueOf('E'), Items.emerald });
    GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldChestplate, 1), new Object[] { "E E", "EEE", "EEE", Character.valueOf('E'), Items.emerald });
    GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldLeggings, 1), new Object[] { "EEE", "E E", "E E", Character.valueOf('E'), Items.emerald });
    GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldBoots, 1), new Object[] { "   ", "E E", "E E", Character.valueOf('E'), Items.emerald });

    GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianHelmet, 1), new Object[] { "OOO", "O O", "   ", Character.valueOf('O'), ModItems.ObsidianShard });
    GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianChestplate, 1), new Object[] { "O O", "OOO", "OOO", Character.valueOf('O'), ModItems.ObsidianShard });
    GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianLeggings, 1), new Object[] { "OOO", "O O", "O O", Character.valueOf('O'), ModItems.ObsidianShard });
    GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianBoots, 1), new Object[] { "   ", "O O", "O O", Character.valueOf('O'), ModItems.ObsidianShard });

    GameRegistry.addRecipe(new ItemStack(ModItems.RubyHelmet, 1), new Object[] { "RRR", "R R", "   ", Character.valueOf('R'), ModItems.Ruby });
    GameRegistry.addRecipe(new ItemStack(ModItems.RubyChestplate, 1), new Object[] { "R R", "RRR", "RRR", Character.valueOf('R'), ModItems.Ruby });
    GameRegistry.addRecipe(new ItemStack(ModItems.RubyLeggings, 1), new Object[] { "RRR", "R R", "R R", Character.valueOf('R'), ModItems.Ruby });
    GameRegistry.addRecipe(new ItemStack(ModItems.RubyBoots, 1), new Object[] { "   ", "R R", "R R", Character.valueOf('R'), ModItems.Ruby });

    GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet, 1), new Object[] { "CCC", "C C", "   ", Character.valueOf('C'), ModItems.ChainLink });
    GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate, 1), new Object[] { "C C", "CCC", "CCC", Character.valueOf('C'), ModItems.ChainLink });
    GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings, 1), new Object[] { "CCC", "C C", "C C", Character.valueOf('C'), ModItems.ChainLink });
    GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots, 1), new Object[] { "   ", "C C", "C C", Character.valueOf('C'), ModItems.ChainLink });

    GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldSword, 1), new Object[] { " E ", " E ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('E'), Items.emerald });
    GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldAxe, 1), new Object[] { "EE ", "ES ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('E'), Items.emerald });
    GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldShovel, 1), new Object[] { " E ", " S ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('E'), Items.emerald });
    GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldPickaxe, 1), new Object[] { "EEE", " S ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('E'), Items.emerald });
    GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldHoe, 1), new Object[] { "EE ", " S ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('E'), Items.emerald });

    GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianSword, 1), new Object[] { " O ", " O ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('O'), ModItems.ObsidianShard });
    GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianAxe, 1), new Object[] { "OO ", "OS ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('O'), ModItems.ObsidianShard });
    GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianShovel, 1), new Object[] { " O ", " S ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('O'), ModItems.ObsidianShard });
    GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianPickaxe, 1), new Object[] { "OOO", " S ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('O'), ModItems.ObsidianShard });
    GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianHoe, 1), new Object[] { "OO ", " S ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('O'), ModItems.ObsidianShard });

    GameRegistry.addRecipe(new ItemStack(ModItems.RubySword, 1), new Object[] { " R ", " R ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('R'), ModItems.Ruby });
    GameRegistry.addRecipe(new ItemStack(ModItems.RubyAxe, 1), new Object[] { "RR ", "RS ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('R'), ModItems.Ruby });
    GameRegistry.addRecipe(new ItemStack(ModItems.RubyShovel, 1), new Object[] { " R ", " S ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('R'), ModItems.Ruby });
    GameRegistry.addRecipe(new ItemStack(ModItems.RubyPickaxe, 1), new Object[] { "RRR", " S ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('R'), ModItems.Ruby });
    GameRegistry.addRecipe(new ItemStack(ModItems.RubyHoe, 1), new Object[] { "RR ", " S ", " S ", Character.valueOf('S'), Items.stick, Character.valueOf('R'), ModItems.Ruby });

    GameRegistry.addRecipe(new ItemStack(Items.saddle, 1), new Object[] { "LLL", "LIL", "S S", Character.valueOf('L'), Items.leather, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('S'), Items.string });
    GameRegistry.addRecipe(new ItemStack(Items.name_tag, 2), new Object[] { " S ", " S ", "TPT", Character.valueOf('S'), Items.string, Character.valueOf('T'), Items.stick, Character.valueOf('P'), Items.paper });
    GameRegistry.addRecipe(new ItemStack(Items.lead, 1), new Object[] { "SS ", "SS ", "  S", Character.valueOf('S'), Items.string });
    GameRegistry.addRecipe(new ItemStack(Blocks.web, 3), new Object[] { "SSS", "SSS", "SSS", Character.valueOf('S'), Items.string });

    GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, 1), new Object[] { "   ", " OO", " OO", Character.valueOf('O'), ModItems.ObsidianShard });
    GameRegistry.addRecipe(new ItemStack(ModBlocks.SulfurBlock, 1), new Object[] { "   ", " SS", " SS", Character.valueOf('S'), ModItems.Sulfur });

    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Sulfur, 4), new Object[] { ModBlocks.SulfurBlock });

    GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor, 1), new Object[] { "  P", "PPP", "PWP", Character.valueOf('P'), ModItems.IronPlating, Character.valueOf('W'), Blocks.wool });
    GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor, 1), new Object[] { "  G", "GGG", "GWG", Character.valueOf('W'), Blocks.wool, Character.valueOf('G'), ModItems.GoldPlating });
    GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor, 1), new Object[] { "DDD", "DAD", "DDD", Character.valueOf('A'), Items.iron_horse_armor, Character.valueOf('D'), Items.diamond });

    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Ruby, 9), new Object[] { ModBlocks.RubyBlock });
    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronPlating, 2), new Object[] { Items.iron_ingot, Items.iron_ingot });
    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldPlating, 2), new Object[] { Items.gold_ingot, Items.gold_ingot });

    GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder, 2), new Object[] { ModItems.CharcoalDust, ModItems.Sulfur });
    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CharcoalDust, 2), new Object[] { Items.coal });


    GameRegistry.addRecipe(new ItemStack(ModBlocks.RubyBlock, 1), new Object[] { "RRR", "RRR", "RRR", Character.valueOf('R'), ModItems.Ruby });
  }

  public static void addSmeltingRecipes() { GameRegistry.addSmelting(ModBlocks.RubyOre, new ItemStack(ModItems.Ruby, 1), 2.0F);

    GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(ModItems.ObsidianShard, 4), 2.0F);
    GameRegistry.addSmelting(Items.leather, new ItemStack(Items.rotten_flesh), 1.0F);
  }
}


/* Location:              C:\Users\spike\Desktop\EssentialAdditions_1.2.8-1.7.10-deobf.jar!\com\spikespaz\Main\CraftingRecipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */