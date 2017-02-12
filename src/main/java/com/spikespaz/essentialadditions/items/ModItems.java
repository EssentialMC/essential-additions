package com.spikespaz.essentialadditions.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import static com.spikespaz.essentialadditions.main.EssentialAdditions.proxy;
import static net.minecraft.item.ItemArmor.ArmorMaterial;
import static net.minecraftforge.common.util.EnumHelper.addArmorMaterial;
import static net.minecraftforge.common.util.EnumHelper.addToolMaterial;

public class ModItems {
    private static ArmorMaterial emerald_armor = addArmorMaterial("emerald_armor", "emerald_armor_1", 92, new int[]{4, 8, 5, 4}, 6);
    private static ArmorMaterial obsidian_armor = addArmorMaterial("obsidian_armor", "obsidian_armor_1", 47, new int[]{6, 7, 6, 5}, 5);
    private static ArmorMaterial ruby_armor = addArmorMaterial("ruby_armor", "ruby_armor_1", 85, new int[]{4, 8, 5, 4}, 6);

    private static Item.ToolMaterial emerald_gem = addToolMaterial("Emerald", 3, 2740, 16.5F, 4.0F, 8);
    private static Item.ToolMaterial obsidian_gem = addToolMaterial("Obsidian", 2, 1210, 23.5F, 6.5F, 5);
    private static Item.ToolMaterial ruby_gem = addToolMaterial("ruby", 3, 2290, 16.0F, 4.5F, 7);
    // Static declarations of all items and their properties.
    // Emerald Armor
//    public static Item emerald_helmet = new EmeraldArmor(emerald_armor, proxy.addArmor("emerald_armor"), 0).setUnlocalizedName("emerald_helmet").setCreativeTab(CreativeTabs.tabCombat);
//    public static Item emerald_chestplate = new EmeraldArmor(emerald_armor, proxy.addArmor("emerald_armor"), 1).setUnlocalizedName("emerald_chestplate").setCreativeTab(CreativeTabs.tabCombat);
//    public static Item emerald_leggings = new EmeraldArmor(emerald_armor, proxy.addArmor("emerald_armor"), 2).setUnlocalizedName("emerald_leggings").setCreativeTab(CreativeTabs.tabCombat);
//    public static Item emerald_boots = new EmeraldArmor(emerald_armor, proxy.addArmor("emerald_armor"), 3).setUnlocalizedName("emerald_boots").setCreativeTab(CreativeTabs.tabCombat);
//    // Obsidian Armor
//    public static Item obsidian_helmet = new ObsidianArmor(obsidian_armor, proxy.addArmor("obsidian_armor"), 0).setUnlocalizedName("obsidian_helmet").setCreativeTab(CreativeTabs.tabCombat);
//    public static Item obsidian_chestplate = new ObsidianArmor(obsidian_armor, proxy.addArmor("obsidian_armor"), 1).setUnlocalizedName("obsidian_chestplate").setCreativeTab(CreativeTabs.tabCombat);
//    public static Item obsidian_leggings = new ObsidianArmor(obsidian_armor, proxy.addArmor("obsidian_armor"), 2).setUnlocalizedName("obsidian_leggings").setCreativeTab(CreativeTabs.tabCombat);
//    public static Item obsidian_boots = new ObsidianArmor(obsidian_armor, proxy.addArmor("obsidian_armor"), 3).setUnlocalizedName("obsidian_boots").setCreativeTab(CreativeTabs.tabCombat);
//    // Ruby Armor
//    public static Item ruby_helmet = new RubyArmor(ruby_armor, proxy.addArmor("ruby_armor"), 0).setUnlocalizedName("ruby_helmet").setCreativeTab(CreativeTabs.tabCombat);
//    public static Item ruby_chestplate = new RubyArmor(ruby_armor, proxy.addArmor("ruby_armor"), 1).setUnlocalizedName("ruby_chestplate").setCreativeTab(CreativeTabs.tabCombat);
//    public static Item ruby_leggings = new RubyArmor(ruby_armor, proxy.addArmor("ruby_armor"), 2).setUnlocalizedName("ruby_leggings").setCreativeTab(CreativeTabs.tabCombat);
//    public static Item ruby_boots = new RubyArmor(ruby_armor, proxy.addArmor("ruby_armor"), 3).setUnlocalizedName("ruby_boots").setCreativeTab(CreativeTabs.tabCombat);
    // Emerald Tools
    public static Item emerald_sword = new BaseSword(emerald_gem, "emerald_sword");
    public static Item emerald_axe = new BaseAxe(emerald_gem, "emerald_axe");
    public static Item emerald_shovel = new BaseSpade(emerald_gem, "emerald_shovel");
    public static Item emerald_pickaxe = new BasePickaxe(emerald_gem, "emerald_pickaxe");
    public static Item emerald_hoe = new BaseHoe(emerald_gem, "emerald_hoe");
    // Obsidian Tools
    public static Item obsidian_sword = new BaseSword(obsidian_gem, "obsidian_sword");
    public static Item obsidian_axe = new BaseAxe(obsidian_gem, "obsidian_axe");
    public static Item obsidian_shovel = new BaseSpade(obsidian_gem, "obsidian_shovel");
    public static Item obsidian_pickaxe = new BasePickaxe(obsidian_gem, "obsidian_pickaxe");
    public static Item obsidian_hoe = new BaseHoe(obsidian_gem, "obsidian_hoe");
    // Ruby Tools
    public static Item ruby_sword = new BaseSword(ruby_gem, "ruby_sword");
    public static Item ruby_axe = new BaseAxe(ruby_gem, "ruby_axe");
    public static Item ruby_shovel = new BaseSpade(ruby_gem, "ruby_shovel");
    public static Item ruby_pickaxe = new BasePickaxe(ruby_gem, "ruby_pickaxe");
    public static Item ruby_hoe = new BaseHoe(ruby_gem, "ruby_hoe");
    // Crafting Items
    public static Item obsidian_shard = new Item().setUnlocalizedName("obsidian_shard").setCreativeTab(CreativeTabs.tabMaterials);
    public static Item sulfur = new Item().setUnlocalizedName("sulfur").setCreativeTab(CreativeTabs.tabMaterials);
    public static Item charcoal_dust = new Item().setUnlocalizedName("charcoal_dust").setCreativeTab(CreativeTabs.tabMaterials);

    public static Item ruby = new Item().setUnlocalizedName("ruby").setCreativeTab(CreativeTabs.tabMaterials);
    public static Item iron_plating = new Item().setUnlocalizedName("iron_plating").setCreativeTab(CreativeTabs.tabMaterials);
    public static Item gold_plating = new Item().setUnlocalizedName("gold_plating").setCreativeTab(CreativeTabs.tabMaterials);
    public static Item chain_link = new Item().setUnlocalizedName("chain_link").setCreativeTab(CreativeTabs.tabMaterials);

    // Register all items and their unlocalized names.
    public static void registerItems() {
//        // Emerald Armor
//        proxy.RegisterModObject(emerald_helmet);
//        proxy.RegisterModObject(emerald_chestplate);
//        proxy.RegisterModObject(emerald_leggings);
//        proxy.RegisterModObject(emerald_boots);
//        // Obsidian Armor
//        proxy.RegisterModObject(obsidian_helmet);
//        proxy.RegisterModObject(obsidian_chestplate);
//        proxy.RegisterModObject(obsidian_leggings);
//        proxy.RegisterModObject(obsidian_boots);
//        // Ruby Armor
//        proxy.RegisterModObject(ruby_helmet);
//        proxy.RegisterModObject(ruby_chestplate);
//        proxy.RegisterModObject(ruby_leggings);
//        proxy.RegisterModObject(ruby_boots);
        // Emerald Tools
        proxy.RegisterModObject(emerald_sword);
        proxy.RegisterModObject(emerald_axe);
        proxy.RegisterModObject(emerald_shovel);
        proxy.RegisterModObject(emerald_pickaxe);
        proxy.RegisterModObject(emerald_hoe);
        // Obsidian Tools
        proxy.RegisterModObject(obsidian_sword);
        proxy.RegisterModObject(obsidian_axe);
        proxy.RegisterModObject(obsidian_shovel);
        proxy.RegisterModObject(obsidian_pickaxe);
        proxy.RegisterModObject(obsidian_hoe);
        // Ruby Tools
        proxy.RegisterModObject(ruby_sword);
        proxy.RegisterModObject(ruby_axe);
        proxy.RegisterModObject(ruby_shovel);
        proxy.RegisterModObject(ruby_pickaxe);
        proxy.RegisterModObject(ruby_hoe);
        // Crafting Items
        proxy.RegisterModObject(obsidian_shard);
        proxy.RegisterModObject(sulfur);
        proxy.RegisterModObject(charcoal_dust);

        proxy.RegisterModObject(ruby);
        proxy.RegisterModObject(iron_plating);
        proxy.RegisterModObject(gold_plating);
        proxy.RegisterModObject(chain_link);
    }
}
