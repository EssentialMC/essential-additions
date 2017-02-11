package com.spikespaz.essentialadditions.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import static com.spikespaz.essentialadditions.EssentialAdditions.MODID;
import static com.spikespaz.essentialadditions.EssentialAdditions.proxy;
import static net.minecraft.item.ItemArmor.ArmorMaterial;
import static net.minecraftforge.common.util.EnumHelper.addArmorMaterial;
import static net.minecraftforge.common.util.EnumHelper.addToolMaterial;

public class ModItems {
    // Static declarations of all Tool and Armor materials and their properties.
    private static ArmorMaterial EmeraldArmor = addArmorMaterial("EmeraldArmor", 92, new int[]{4, 8, 5, 4}, 6);
    private static ArmorMaterial ObsidianArmor = addArmorMaterial("ObsidianArmor", 47, new int[]{6, 7, 6, 5}, 5);
    private static ArmorMaterial RubyArmor = addArmorMaterial("RubyArmor", 85, new int[]{4, 8, 5, 4}, 6);

    private static Item.ToolMaterial EmeraldGem = addToolMaterial("Emerald", 3, 2740, 16.5F, 4.0F, 8);
    private static Item.ToolMaterial ObsidianToolShard = addToolMaterial("Obsidian", 2, 1210, 23.5F, 6.5F, 5);
    private static Item.ToolMaterial RubyGem = addToolMaterial("Ruby", 3, 2290, 16.0F, 4.5F, 7);
    // Static declarations of all items and their properties.
    // Emerald Armor
    public static Item EmeraldHelmet = new EmeraldArmor(EmeraldArmor, proxy.addArmor("EmeraldArmor"), 0).setUnlocalizedName("EmeraldHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":EmeraldHelmet");
    public static Item EmeraldChestplate = new EmeraldArmor(EmeraldArmor, proxy.addArmor("EmeraldArmor"), 1).setUnlocalizedName("EmeraldChestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":EmeraldChestplate");
    public static Item EmeraldLeggings = new EmeraldArmor(EmeraldArmor, proxy.addArmor("EmeraldArmor"), 2).setUnlocalizedName("EmeraldLeggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":EmeraldLeggings");
    public static Item EmeraldBoots = new EmeraldArmor(EmeraldArmor, proxy.addArmor("EmeraldArmor"), 3).setUnlocalizedName("EmeraldBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":EmeraldBoots");
    // Obsidian Armor
    public static Item ObsidianHelmet = new ObsidianArmor(ObsidianArmor, proxy.addArmor("ObsidianArmor"), 0).setUnlocalizedName("ObsidianHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":ObsidianHelmet");
    public static Item ObsidianChestplate = new ObsidianArmor(ObsidianArmor, proxy.addArmor("ObsidianArmor"), 1).setUnlocalizedName("ObsidianChestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":ObsidianChestplate");
    public static Item ObsidianLeggings = new ObsidianArmor(ObsidianArmor, proxy.addArmor("ObsidianArmor"), 2).setUnlocalizedName("ObsidianLeggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":ObsidianLeggings");
    public static Item ObsidianBoots = new ObsidianArmor(ObsidianArmor, proxy.addArmor("ObsidianArmor"), 3).setUnlocalizedName("ObsidianBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":ObsidianBoots");
    // Ruby Armor
    public static Item RubyHelmet = new RubyArmor(RubyArmor, proxy.addArmor("RubyArmor"), 0).setUnlocalizedName("RubyHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":RubyHelmet");
    public static Item RubyChestplate = new RubyArmor(RubyArmor, proxy.addArmor("RubyArmor"), 1).setUnlocalizedName("RubyChestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":RubyChestplate");
    public static Item RubyLeggings = new RubyArmor(RubyArmor, proxy.addArmor("RubyArmor"), 2).setUnlocalizedName("RubyLeggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":RubyLeggings");
    public static Item RubyBoots = new RubyArmor(RubyArmor, proxy.addArmor("RubyArmor"), 3).setUnlocalizedName("RubyBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":RubyBoots");
    // Emerald Tools
    public static Item EmeraldSword = new BaseSword(EmeraldGem, "EmeraldSword");
    public static Item EmeraldAxe = new BaseAxe(EmeraldGem, "EmeraldAxe");
    public static Item EmeraldShovel = new BaseSpade(EmeraldGem, "EmeraldShovel");
    public static Item EmeraldPickaxe = new BasePickaxe(EmeraldGem, "EmeraldPickaxe");
    public static Item EmeraldHoe = new BaseHoe(EmeraldGem, "EmeraldHoe");
    // Obsidian Tools
    public static Item ObsidianSword = new BaseSword(ObsidianToolShard, "ObsidianSword");
    public static Item ObsidianAxe = new BaseAxe(ObsidianToolShard, "ObsidianAxe");
    public static Item ObsidianShovel = new BaseSpade(ObsidianToolShard, "ObsidianShovel");
    public static Item ObsidianPickaxe = new BasePickaxe(ObsidianToolShard, "ObsidianPickaxe");
    public static Item ObsidianHoe = new BaseHoe(ObsidianToolShard, "ObsidianHoe");
    // Ruby Tools
    public static Item RubySword = new BaseSword(RubyGem, "RubySword");
    public static Item RubyAxe = new BaseAxe(RubyGem, "RubyAxe");
    public static Item RubyShovel = new BaseSpade(RubyGem, "RubyShovel");
    public static Item RubyPickaxe = new BasePickaxe(RubyGem, "RubyPickaxe");
    public static Item RubyHoe = new BaseHoe(RubyGem, "RubyHoe");
    // Crafting Items
    public static Item ObsidianShard = new Item().setUnlocalizedName("ObsidianShard").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":ObsidianShard");
    public static Item Sulfur = new Item().setUnlocalizedName("Sulfur").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":Sulfur");
    public static Item CharcoalDust = new Item().setUnlocalizedName("CharcoalDust").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":CharcoalDust");

    public static Item Ruby = new Item().setUnlocalizedName("Ruby").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":Ruby");
    public static Item IronPlating = new Item().setUnlocalizedName("IronPlating").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":IronPlating");
    public static Item GoldPlating = new Item().setUnlocalizedName("GoldPlating").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":GoldPlating");
    public static Item ChainLink = new Item().setUnlocalizedName("ChainLink").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":ChainLink");

    // Register all items and their unlocalized names.
    public static void registerItems() {
        // Emerald Armor
        GameRegistry.registerItem(EmeraldHelmet, EmeraldHelmet.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldChestplate, EmeraldChestplate.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldLeggings, EmeraldLeggings.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldBoots, EmeraldBoots.getUnlocalizedName());
        // Obsidian Armor
        GameRegistry.registerItem(ObsidianHelmet, ObsidianHelmet.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianChestplate, ObsidianChestplate.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianLeggings, ObsidianLeggings.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianBoots, ObsidianBoots.getUnlocalizedName());
        // Ruby Armor
        GameRegistry.registerItem(RubyHelmet, RubyHelmet.getUnlocalizedName());
        GameRegistry.registerItem(RubyChestplate, RubyChestplate.getUnlocalizedName());
        GameRegistry.registerItem(RubyLeggings, RubyLeggings.getUnlocalizedName());
        GameRegistry.registerItem(RubyBoots, RubyBoots.getUnlocalizedName());
        // Emerald Tools
        GameRegistry.registerItem(EmeraldSword, EmeraldSword.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldAxe, EmeraldAxe.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldShovel, EmeraldShovel.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldPickaxe, EmeraldPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldHoe, EmeraldHoe.getUnlocalizedName());
        // Obsidian Tools
        GameRegistry.registerItem(ObsidianSword, ObsidianSword.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianAxe, ObsidianAxe.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianShovel, ObsidianShovel.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianPickaxe, ObsidianPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianHoe, ObsidianHoe.getUnlocalizedName());
        // Ruby Tools
        GameRegistry.registerItem(RubySword, RubySword.getUnlocalizedName());
        GameRegistry.registerItem(RubyAxe, RubyAxe.getUnlocalizedName());
        GameRegistry.registerItem(RubyShovel, RubyShovel.getUnlocalizedName());
        GameRegistry.registerItem(RubyPickaxe, RubyPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(RubyHoe, RubyHoe.getUnlocalizedName());
        // Crafting Items
        GameRegistry.registerItem(ObsidianShard, ObsidianShard.getUnlocalizedName());
        GameRegistry.registerItem(Sulfur, Sulfur.getUnlocalizedName());
        GameRegistry.registerItem(CharcoalDust, CharcoalDust.getUnlocalizedName());

        GameRegistry.registerItem(Ruby, Ruby.getUnlocalizedName());
        GameRegistry.registerItem(IronPlating, IronPlating.getUnlocalizedName());
        GameRegistry.registerItem(GoldPlating, GoldPlating.getUnlocalizedName());
        GameRegistry.registerItem(ChainLink, ChainLink.getUnlocalizedName());
    }
}
