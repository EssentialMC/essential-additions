package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.item.Item;

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

    private static net.minecraft.item.ItemArmor.ArmorMaterial EmeraldArmor = net.minecraftforge.common.util.EnumHelper.addArmorMaterial("EmeraldArmor", 44, new int[]{4, 8, 5, 4}, 18);
    private static net.minecraft.item.ItemArmor.ArmorMaterial ObsidianArmor = net.minecraftforge.common.util.EnumHelper.addArmorMaterial("ObsidianArmor", 34, new int[]{5, 6, 5, 4}, 18);
    private static net.minecraft.item.ItemArmor.ArmorMaterial RubyArmor = net.minecraftforge.common.util.EnumHelper.addArmorMaterial("RubyArmor", 44, new int[]{4, 8, 5, 4}, 25);
    private static net.minecraft.item.Item.ToolMaterial EmeraldGem = net.minecraftforge.common.util.EnumHelper.addToolMaterial("Emerald", 3, 2000, 15.0F, 4.5F, 8);
    private static net.minecraft.item.Item.ToolMaterial ObsidianToolShard = net.minecraftforge.common.util.EnumHelper.addToolMaterial("Obsidian", 2, 2100, 15.0F, 4.5F, 8);
    private static net.minecraft.item.Item.ToolMaterial RubyGem = net.minecraftforge.common.util.EnumHelper.addToolMaterial("Ruby", 3, 2000, 15.0F, 4.5F, 8);

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
        EmeraldHelmet = new EmeraldArmor(EmeraldArmor, EssentialAdditions.proxy.addArmor("EmeraldArmor"), 0).setUnlocalizedName("EmeraldHelmet").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:EmeraldHelmet");
        EmeraldChestplate = new EmeraldArmor(EmeraldArmor, EssentialAdditions.proxy.addArmor("EmeraldArmor"), 1).setUnlocalizedName("EmeraldChestplate").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:EmeraldChestplate");
        EmeraldLeggings = new EmeraldArmor(EmeraldArmor, EssentialAdditions.proxy.addArmor("EmeraldArmor"), 2).setUnlocalizedName("EmeraldLeggings").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:EmeraldLeggings");
        EmeraldBoots = new EmeraldArmor(EmeraldArmor, EssentialAdditions.proxy.addArmor("EmeraldArmor"), 3).setUnlocalizedName("EmeraldBoots").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:EmeraldBoots");

        ObsidianHelmet = new ObsidianArmor(ObsidianArmor, EssentialAdditions.proxy.addArmor("ObsidianArmor"), 0).setUnlocalizedName("ObsidianHelmet").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:ObsidianHelmet");
        ObsidianChestplate = new ObsidianArmor(ObsidianArmor, EssentialAdditions.proxy.addArmor("ObsidianArmor"), 1).setUnlocalizedName("ObsidianChestplate").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:ObsidianChestplate");
        ObsidianLeggings = new ObsidianArmor(ObsidianArmor, EssentialAdditions.proxy.addArmor("ObsidianArmor"), 2).setUnlocalizedName("ObsidianLeggings").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:ObsidianLeggings");
        ObsidianBoots = new ObsidianArmor(ObsidianArmor, EssentialAdditions.proxy.addArmor("ObsidianArmor"), 3).setUnlocalizedName("ObsidianBoots").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:ObsidianBoots");

        RubyHelmet = new RubyArmor(RubyArmor, EssentialAdditions.proxy.addArmor("RubyArmor"), 0).setUnlocalizedName("RubyHelmet").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:RubyHelmet");
        RubyChestplate = new RubyArmor(RubyArmor, EssentialAdditions.proxy.addArmor("RubyArmor"), 1).setUnlocalizedName("RubyChestplate").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:RubyChestplate");
        RubyLeggings = new RubyArmor(RubyArmor, EssentialAdditions.proxy.addArmor("RubyArmor"), 2).setUnlocalizedName("RubyLeggings").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:RubyLeggings");
        RubyBoots = new RubyArmor(RubyArmor, EssentialAdditions.proxy.addArmor("RubyArmor"), 3).setUnlocalizedName("RubyBoots").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:RubyBoots");

        EmeraldSword = new EmeraldSword(EmeraldGem);
        EmeraldAxe = new EmeraldAxe(EmeraldGem);
        EmeraldShovel = new EmeraldShovel(EmeraldGem);
        EmeraldPickaxe = new EmeraldPickaxe(EmeraldGem);
        EmeraldHoe = new EmeraldHoe(EmeraldGem);

        ObsidianSword = new ObsidianSword(ObsidianToolShard);
        ObsidianAxe = new ObsidianAxe(ObsidianToolShard);
        ObsidianShovel = new ObsidianShovel(ObsidianToolShard);
        ObsidianPickaxe = new ObsidianPickaxe(ObsidianToolShard);
        ObsidianHoe = new ObsidianHoe(ObsidianToolShard);

        RubySword = new RubySword(RubyGem);
        RubyAxe = new RubyAxe(RubyGem);
        RubyShovel = new RubyShovel(RubyGem);
        RubyPickaxe = new RubyPickaxe(RubyGem);
        RubyHoe = new RubyHoe(RubyGem);

        ObsidianShard = new Item().setUnlocalizedName("ObsidianShard").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabMaterials).setTextureName("essentialadditions:ObsidianShard");
        Sulfur = new Item().setUnlocalizedName("Sulfur").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabMaterials).setTextureName("essentialadditions:Sulfur");

        Ruby = new Item().setUnlocalizedName("Ruby").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabMaterials).setTextureName("essentialadditions:Ruby");
        IronPlating = new Item().setUnlocalizedName("IronPlating").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabMaterials).setTextureName("essentialadditions:IronPlating");
        GoldPlating = new Item().setUnlocalizedName("GoldPlating").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabMaterials).setTextureName("essentialadditions:GoldPlating");
        ChainLink = new Item().setUnlocalizedName("ChainLink").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabMaterials).setTextureName("essentialadditions:ChainLink");

        CharcoalDust = new Item().setUnlocalizedName("CharcoalDust").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabMaterials).setTextureName("essentialadditions:CharcoalDust");
    }


    private static void registerItem() {
        cpw.mods.fml.common.registry.GameRegistry.registerItem(EmeraldHelmet, EmeraldHelmet.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(EmeraldChestplate, EmeraldChestplate.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(EmeraldLeggings, EmeraldLeggings.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(EmeraldBoots, EmeraldBoots.getUnlocalizedName());

        cpw.mods.fml.common.registry.GameRegistry.registerItem(ObsidianHelmet, ObsidianHelmet.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(ObsidianChestplate, ObsidianChestplate.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(ObsidianLeggings, ObsidianLeggings.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(ObsidianBoots, ObsidianBoots.getUnlocalizedName());

        cpw.mods.fml.common.registry.GameRegistry.registerItem(RubyHelmet, RubyHelmet.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(RubyChestplate, RubyChestplate.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(RubyLeggings, RubyLeggings.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(RubyBoots, RubyBoots.getUnlocalizedName());

        cpw.mods.fml.common.registry.GameRegistry.registerItem(EmeraldSword, EmeraldSword.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(EmeraldAxe, EmeraldAxe.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(EmeraldShovel, EmeraldShovel.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(EmeraldPickaxe, EmeraldPickaxe.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(EmeraldHoe, EmeraldHoe.getUnlocalizedName());

        cpw.mods.fml.common.registry.GameRegistry.registerItem(ObsidianSword, ObsidianSword.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(ObsidianAxe, ObsidianAxe.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(ObsidianShovel, ObsidianShovel.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(ObsidianPickaxe, ObsidianPickaxe.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(ObsidianHoe, ObsidianHoe.getUnlocalizedName());

        cpw.mods.fml.common.registry.GameRegistry.registerItem(RubySword, RubySword.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(RubyAxe, RubyAxe.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(RubyShovel, RubyShovel.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(RubyPickaxe, RubyPickaxe.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(RubyHoe, RubyHoe.getUnlocalizedName());

        cpw.mods.fml.common.registry.GameRegistry.registerItem(ObsidianShard, ObsidianShard.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(Sulfur, Sulfur.getUnlocalizedName());

        cpw.mods.fml.common.registry.GameRegistry.registerItem(Ruby, Ruby.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(IronPlating, IronPlating.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(GoldPlating, GoldPlating.getUnlocalizedName());
        cpw.mods.fml.common.registry.GameRegistry.registerItem(ChainLink, ChainLink.getUnlocalizedName());

        cpw.mods.fml.common.registry.GameRegistry.registerItem(CharcoalDust, CharcoalDust.getUnlocalizedName());
    }
}
