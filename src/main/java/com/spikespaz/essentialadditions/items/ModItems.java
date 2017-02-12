package com.spikespaz.essentialadditions.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.spikespaz.essentialadditions.EssentialAdditions.MODID;
import static com.spikespaz.essentialadditions.EssentialAdditions.proxy;
import static net.minecraft.item.ItemArmor.ArmorMaterial;
import static net.minecraftforge.common.util.EnumHelper.addArmorMaterial;
import static net.minecraftforge.common.util.EnumHelper.addToolMaterial;

public class ModItems {
    // Static declarations of all Tool and Armor materials and their properties.
    private static ArmorMaterial emerald_armor = addArmorMaterial("emerald_armor", 92, new int[]{4, 8, 5, 4}, 6);
    private static ArmorMaterial obsidian_armor = addArmorMaterial("obsidian_armor", 47, new int[]{6, 7, 6, 5}, 5);
    private static ArmorMaterial ruby_armor = addArmorMaterial("ruby_armor", 85, new int[]{4, 8, 5, 4}, 6);

    private static Item.ToolMaterial emerald_gem = addToolMaterial("Emerald", 3, 2740, 16.5F, 4.0F, 8);
    private static Item.ToolMaterial obsidian_gem = addToolMaterial("Obsidian", 2, 1210, 23.5F, 6.5F, 5);
    private static Item.ToolMaterial ruby_gem = addToolMaterial("ruby", 3, 2290, 16.0F, 4.5F, 7);
    // Static declarations of all items and their properties.
    // Emerald Armor
    public static Item emerald_helmet = new EmeraldArmor(emerald_armor, proxy.addArmor("emerald_armor"), 0).setUnlocalizedName("emerald_helmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":emerald_helmet");
    public static Item emerald_chestplate = new EmeraldArmor(emerald_armor, proxy.addArmor("emerald_armor"), 1).setUnlocalizedName("emerald_chestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":emerald_chestplate");
    public static Item emerald_leggings = new EmeraldArmor(emerald_armor, proxy.addArmor("emerald_armor"), 2).setUnlocalizedName("emerald_leggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":emerald_leggings");
    public static Item emerald_boots = new EmeraldArmor(emerald_armor, proxy.addArmor("emerald_armor"), 3).setUnlocalizedName("emerald_boots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":emerald_boots");
    // Obsidian Armor
    public static Item obsidian_helmet = new ObsidianArmor(obsidian_armor, proxy.addArmor("obsidian_armor"), 0).setUnlocalizedName("obsidian_helmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":obsidian_helmet");
    public static Item obsidian_chestplate = new ObsidianArmor(obsidian_armor, proxy.addArmor("obsidian_armor"), 1).setUnlocalizedName("obsidian_chestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":obsidian_chestplate");
    public static Item obsidian_leggings = new ObsidianArmor(obsidian_armor, proxy.addArmor("obsidian_armor"), 2).setUnlocalizedName("obsidian_leggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":obsidian_leggings");
    public static Item obsidian_boots = new ObsidianArmor(obsidian_armor, proxy.addArmor("obsidian_armor"), 3).setUnlocalizedName("obsidian_boots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":obsidian_boots");
    // ruby Armor
    public static Item ruby_helmet = new RubyArmor(ruby_armor, proxy.addArmor("ruby_armor"), 0).setUnlocalizedName("ruby_helmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":ruby_helmet");
    public static Item ruby_chestplate = new RubyArmor(ruby_armor, proxy.addArmor("ruby_armor"), 1).setUnlocalizedName("ruby_chestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":ruby_chestplate");
    public static Item ruby_leggings = new RubyArmor(ruby_armor, proxy.addArmor("ruby_armor"), 2).setUnlocalizedName("ruby_leggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":ruby_leggings");
    public static Item ruby_boots = new RubyArmor(ruby_armor, proxy.addArmor("ruby_armor"), 3).setUnlocalizedName("ruby_boots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":ruby_boots");
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
    // ruby Tools
    public static Item ruby_sword = new BaseSword(ruby_gem, "ruby_sword");
    public static Item ruby_axe = new BaseAxe(ruby_gem, "ruby_axe");
    public static Item ruby_shovel = new BaseSpade(ruby_gem, "ruby_shovel");
    public static Item ruby_pickaxe = new BasePickaxe(ruby_gem, "ruby_pickaxe");
    public static Item ruby_hoe = new BaseHoe(ruby_gem, "ruby_hoe");
    // Crafting Items
    public static Item obsidian_shard = new Item().setUnlocalizedName("obsidian_shard").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":obsidian_shard");
    public static Item sulfur = new Item().setUnlocalizedName("sulfur").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":sulfur");
    public static Item charcoal_dust = new Item().setUnlocalizedName("charcoal_dust").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":charcoal_dust");

    public static Item ruby = new Item().setUnlocalizedName("ruby").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":ruby");
    public static Item iron_plating = new Item().setUnlocalizedName("iron_plating").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":iron_plating");
    public static Item gold_plating = new Item().setUnlocalizedName("gold_plating").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":gold_plating");
    public static Item chain_link = new Item().setUnlocalizedName("chain_link").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":chain_link");

    // Register all items and their unlocalized names.
    public static void registerItems() {
        // Emerald Armor
        GameRegistry.registerItem(emerald_helmet, emerald_helmet.getUnlocalizedName());
        GameRegistry.registerItem(emerald_chestplate, emerald_chestplate.getUnlocalizedName());
        GameRegistry.registerItem(emerald_leggings, emerald_leggings.getUnlocalizedName());
        GameRegistry.registerItem(emerald_boots, emerald_boots.getUnlocalizedName());
        // Obsidian Armor
        GameRegistry.registerItem(obsidian_helmet, obsidian_helmet.getUnlocalizedName());
        GameRegistry.registerItem(obsidian_chestplate, obsidian_chestplate.getUnlocalizedName());
        GameRegistry.registerItem(obsidian_leggings, obsidian_leggings.getUnlocalizedName());
        GameRegistry.registerItem(obsidian_boots, obsidian_boots.getUnlocalizedName());
        // ruby Armor
        GameRegistry.registerItem(ruby_helmet, ruby_helmet.getUnlocalizedName());
        GameRegistry.registerItem(ruby_chestplate, ruby_chestplate.getUnlocalizedName());
        GameRegistry.registerItem(ruby_leggings, ruby_leggings.getUnlocalizedName());
        GameRegistry.registerItem(ruby_boots, ruby_boots.getUnlocalizedName());
        // Emerald Tools
        GameRegistry.registerItem(emerald_sword, emerald_sword.getUnlocalizedName());
        GameRegistry.registerItem(emerald_axe, emerald_axe.getUnlocalizedName());
        GameRegistry.registerItem(emerald_shovel, emerald_shovel.getUnlocalizedName());
        GameRegistry.registerItem(emerald_pickaxe, emerald_pickaxe.getUnlocalizedName());
        GameRegistry.registerItem(emerald_hoe, emerald_hoe.getUnlocalizedName());
        // Obsidian Tools
        GameRegistry.registerItem(obsidian_sword, obsidian_sword.getUnlocalizedName());
        GameRegistry.registerItem(obsidian_axe, obsidian_axe.getUnlocalizedName());
        GameRegistry.registerItem(obsidian_shovel, obsidian_shovel.getUnlocalizedName());
        GameRegistry.registerItem(obsidian_pickaxe, obsidian_pickaxe.getUnlocalizedName());
        GameRegistry.registerItem(obsidian_hoe, obsidian_hoe.getUnlocalizedName());
        // ruby Tools
        GameRegistry.registerItem(ruby_sword, ruby_sword.getUnlocalizedName());
        GameRegistry.registerItem(ruby_axe, ruby_axe.getUnlocalizedName());
        GameRegistry.registerItem(ruby_shovel, ruby_shovel.getUnlocalizedName());
        GameRegistry.registerItem(ruby_pickaxe, ruby_pickaxe.getUnlocalizedName());
        GameRegistry.registerItem(ruby_hoe, ruby_hoe.getUnlocalizedName());
        // Crafting Items
        GameRegistry.registerItem(obsidian_shard, obsidian_shard.getUnlocalizedName());
        GameRegistry.registerItem(sulfur, sulfur.getUnlocalizedName());
        GameRegistry.registerItem(charcoal_dust, charcoal_dust.getUnlocalizedName());

        GameRegistry.registerItem(ruby, ruby.getUnlocalizedName());
        GameRegistry.registerItem(iron_plating, iron_plating.getUnlocalizedName());
        GameRegistry.registerItem(gold_plating, gold_plating.getUnlocalizedName());
        GameRegistry.registerItem(chain_link, chain_link.getUnlocalizedName());
    }
}
