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
    public static Item EmeraldHelmet;
    public static Item EmeraldChestplate;
    public static Item EmeraldLeggings;
    public static Item EmeraldBoots;

    public static Item ObsidianHelmet;
    public static Item ObsidianChestplate;
    public static Item ObsidianLeggings;
    public static Item ObsidianBoots;

    public static Item RubyHelmet;
    public static Item RubyChestplate;
    public static Item RubyLeggings;
    public static Item RubyBoots;

    public static Item EmeraldSword;
    public static Item EmeraldAxe;
    public static Item EmeraldShovel;
    public static Item EmeraldPickaxe;
    public static Item EmeraldHoe;

    public static Item ObsidianSword;
    public static Item ObsidianAxe;
    public static Item ObsidianShovel;
    public static Item ObsidianPickaxe;
    public static Item ObsidianHoe;

    public static Item RubySword;
    public static Item RubyAxe;
    public static Item RubyShovel;
    public static Item RubyPickaxe;
    public static Item RubyHoe;

    private static ArmorMaterial EmeraldArmor =          addArmorMaterial("EmeraldArmor", 92, new int[]{4, 8, 5, 4}, 6);
    private static ArmorMaterial ObsidianArmor =         addArmorMaterial("ObsidianArmor", 47, new int[]{6, 7, 6, 5}, 5);
    private static ArmorMaterial RubyArmor =             addArmorMaterial("RubyArmor", 85, new int[]{4, 8, 5, 4}, 6);
    private static Item.ToolMaterial EmeraldGem =        addToolMaterial("Emerald", 3, 2740, 14.0F, 4.0F, 8);
    private static Item.ToolMaterial ObsidianToolShard = addToolMaterial("Obsidian", 2, 1210, 17.0F, 6.5F, 5);
    private static Item.ToolMaterial RubyGem =           addToolMaterial("Ruby", 2, 2290, 15.0F, 4.5F, 7);

    public static Item ObsidianShard;
    public static Item Sulfur;
    public static Item Ruby;

    public static Item IronPlating;
    public static Item GoldPlating;
    public static Item ChainLink;
    public static Item CharcoalDust;

    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }

    private static void initializeItem() {
        EmeraldHelmet =     new EmeraldArmor(EmeraldArmor, proxy.addArmor("EmeraldArmor"), 0).setUnlocalizedName("EmeraldHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":EmeraldHelmet");
        EmeraldChestplate = new EmeraldArmor(EmeraldArmor, proxy.addArmor("EmeraldArmor"), 1).setUnlocalizedName("EmeraldChestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":EmeraldChestplate");
        EmeraldLeggings =   new EmeraldArmor(EmeraldArmor, proxy.addArmor("EmeraldArmor"), 2).setUnlocalizedName("EmeraldLeggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":EmeraldLeggings");
        EmeraldBoots =      new EmeraldArmor(EmeraldArmor, proxy.addArmor("EmeraldArmor"), 3).setUnlocalizedName("EmeraldBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":EmeraldBoots");

        ObsidianHelmet =     new ObsidianArmor(ObsidianArmor, proxy.addArmor("ObsidianArmor"), 0).setUnlocalizedName("ObsidianHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":ObsidianHelmet");
        ObsidianChestplate = new ObsidianArmor(ObsidianArmor, proxy.addArmor("ObsidianArmor"), 1).setUnlocalizedName("ObsidianChestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":ObsidianChestplate");
        ObsidianLeggings =   new ObsidianArmor(ObsidianArmor, proxy.addArmor("ObsidianArmor"), 2).setUnlocalizedName("ObsidianLeggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":ObsidianLeggings");
        ObsidianBoots =      new ObsidianArmor(ObsidianArmor, proxy.addArmor("ObsidianArmor"), 3).setUnlocalizedName("ObsidianBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":ObsidianBoots");

        RubyHelmet =     new RubyArmor(RubyArmor, proxy.addArmor("RubyArmor"), 0).setUnlocalizedName("RubyHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":RubyHelmet");
        RubyChestplate = new RubyArmor(RubyArmor, proxy.addArmor("RubyArmor"), 1).setUnlocalizedName("RubyChestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":RubyChestplate");
        RubyLeggings =   new RubyArmor(RubyArmor, proxy.addArmor("RubyArmor"), 2).setUnlocalizedName("RubyLeggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":RubyLeggings");
        RubyBoots =      new RubyArmor(RubyArmor, proxy.addArmor("RubyArmor"), 3).setUnlocalizedName("RubyBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":RubyBoots");

        EmeraldSword =   new BaseSword(EmeraldGem, "EmeraldSword");
        EmeraldAxe =     new BaseAxe(EmeraldGem, "EmeraldAxe");
        EmeraldShovel =  new BaseSpade(EmeraldGem, "EmeraldShovel");
        EmeraldPickaxe = new BasePickaxe(EmeraldGem, "EmeraldPickaxe");
        EmeraldHoe =     new BaseHoe(EmeraldGem, "EmeraldHoe");
        
        ObsidianSword =   new BaseSword(ObsidianToolShard, "ObsidianSword");
        ObsidianAxe =     new BaseAxe(ObsidianToolShard, "ObsidianAxe");
        ObsidianShovel =  new BaseSpade(ObsidianToolShard, "ObsidianShovel");
        ObsidianPickaxe = new BasePickaxe(ObsidianToolShard, "ObsidianPickaxe");
        ObsidianHoe =     new BaseHoe(ObsidianToolShard, "ObsidianHoe");

        RubySword =   new BaseSword(RubyGem, "RubySword");
        RubyAxe =     new BaseAxe(RubyGem, "RubyAxe");
        RubyShovel =  new BaseSpade(RubyGem, "RubyShovel");
        RubyPickaxe = new BasePickaxe(RubyGem, "RubyPickaxe");
        RubyHoe =     new BaseHoe(RubyGem, "RubyHoe");

        ObsidianShard = new Item().setUnlocalizedName("ObsidianShard").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":ObsidianShard");
        Sulfur =        new Item().setUnlocalizedName("Sulfur").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":Sulfur");

        Ruby =        new Item().setUnlocalizedName("Ruby").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":Ruby");
        IronPlating = new Item().setUnlocalizedName("IronPlating").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":IronPlating");
        GoldPlating = new Item().setUnlocalizedName("GoldPlating").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":GoldPlating");
        ChainLink =   new Item().setUnlocalizedName("ChainLink").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":ChainLink");

        CharcoalDust = new Item().setUnlocalizedName("CharcoalDust").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(MODID + ":CharcoalDust");
    }

    private static void registerItem() {
        GameRegistry.registerItem(EmeraldHelmet, EmeraldHelmet.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldChestplate, EmeraldChestplate.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldLeggings, EmeraldLeggings.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldBoots, EmeraldBoots.getUnlocalizedName());

        GameRegistry.registerItem(ObsidianHelmet, ObsidianHelmet.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianChestplate, ObsidianChestplate.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianLeggings, ObsidianLeggings.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianBoots, ObsidianBoots.getUnlocalizedName());

        GameRegistry.registerItem(RubyHelmet, RubyHelmet.getUnlocalizedName());
        GameRegistry.registerItem(RubyChestplate, RubyChestplate.getUnlocalizedName());
        GameRegistry.registerItem(RubyLeggings, RubyLeggings.getUnlocalizedName());
        GameRegistry.registerItem(RubyBoots, RubyBoots.getUnlocalizedName());

        GameRegistry.registerItem(EmeraldSword, EmeraldSword.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldAxe, EmeraldAxe.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldShovel, EmeraldShovel.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldPickaxe, EmeraldPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(EmeraldHoe, EmeraldHoe.getUnlocalizedName());

        GameRegistry.registerItem(ObsidianSword, ObsidianSword.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianAxe, ObsidianAxe.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianShovel, ObsidianShovel.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianPickaxe, ObsidianPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(ObsidianHoe, ObsidianHoe.getUnlocalizedName());

        GameRegistry.registerItem(RubySword, RubySword.getUnlocalizedName());
        GameRegistry.registerItem(RubyAxe, RubyAxe.getUnlocalizedName());
        GameRegistry.registerItem(RubyShovel, RubyShovel.getUnlocalizedName());
        GameRegistry.registerItem(RubyPickaxe, RubyPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(RubyHoe, RubyHoe.getUnlocalizedName());

        GameRegistry.registerItem(ObsidianShard, ObsidianShard.getUnlocalizedName());
        GameRegistry.registerItem(Sulfur, Sulfur.getUnlocalizedName());

        GameRegistry.registerItem(Ruby, Ruby.getUnlocalizedName());
        GameRegistry.registerItem(IronPlating, IronPlating.getUnlocalizedName());
        GameRegistry.registerItem(GoldPlating, GoldPlating.getUnlocalizedName());
        GameRegistry.registerItem(ChainLink, ChainLink.getUnlocalizedName());

        GameRegistry.registerItem(CharcoalDust, CharcoalDust.getUnlocalizedName());
    }
}
