package com.spikespaz.essentialadditions.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import static com.spikespaz.essentialadditions.main.EssentialAdditions.MODID;
import static net.minecraft.inventory.EntityEquipmentSlot.*;
import static net.minecraft.item.ItemArmor.ArmorMaterial;
import static net.minecraftforge.common.util.EnumHelper.addToolMaterial;

public class ModItems {
    // Crafting Items
    public static Item OBSIDIAN_SHARD = new Item().setUnlocalizedName(MODID + ".obsidian_shard").setCreativeTab(CreativeTabs.MATERIALS);
    public static Item SULFUR = new Item().setUnlocalizedName(MODID + ".sulfur").setCreativeTab(CreativeTabs.MATERIALS);
    public static Item CHARCOAL_DUST = new Item().setUnlocalizedName(MODID + ".charcoal_dust").setCreativeTab(CreativeTabs.MATERIALS);
    public static Item RUBY = new Item().setUnlocalizedName(MODID + ".ruby").setCreativeTab(CreativeTabs.MATERIALS);
    public static Item IRON_PLATING = new Item().setUnlocalizedName(MODID + ".iron_plating").setCreativeTab(CreativeTabs.MATERIALS);
    public static Item GOLD_PLATING = new Item().setUnlocalizedName(MODID + ".gold_plating").setCreativeTab(CreativeTabs.MATERIALS);
    public static Item CHAIN_LINK = new Item().setUnlocalizedName(MODID + ".chain_link").setCreativeTab(CreativeTabs.MATERIALS);
    private static ArmorMaterial EMERALD_ARMOR = EnumHelper.addArmorMaterial(MODID + ".emerald_armor",
            MODID + ":emerald_armor", 80, new int[]{4, 8, 5, 4}, 6, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    // Static declarations of all item and their properties.
    // Emerald Armor
    public static Item EMERALD_HELMET = new BaseArmor(MODID + ".emerald_helmet", EMERALD_ARMOR, 1, HEAD);
    public static Item EMERALD_CHESTPLATE = new BaseArmor(MODID + ".emerald_chestplate", EMERALD_ARMOR, 1, CHEST);
    public static Item EMERALD_LEGGINGS = new BaseArmor(MODID + ".emerald_leggings", EMERALD_ARMOR, 2, LEGS);
    public static Item EMERALD_BOOTS = new BaseArmor(MODID + ".emerald_boots", EMERALD_ARMOR, 1, FEET);
    private static ArmorMaterial OBSIDIAN_ARMOR = EnumHelper.addArmorMaterial(MODID + ".obsidian_armor",
            MODID + ":obsidian_armor", 47, new int[]{6, 7, 6, 5}, 5, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
    // Obsidian Armor
    public static Item OBSIDIAN_HELMET = new BaseArmor(MODID + ".obsidian_helmet", OBSIDIAN_ARMOR, 1, HEAD);
    public static Item OBSIDIAN_CHESTPLATE = new BaseArmor(MODID + ".obsidian_chestplate", OBSIDIAN_ARMOR, 1, CHEST);
    public static Item OBSIDIAN_LEGGINGS = new BaseArmor(MODID + ".obsidian_leggings", OBSIDIAN_ARMOR, 2, LEGS);
    public static Item OBSIDIAN_BOOTS = new BaseArmor(MODID + ".obsidian_boots", OBSIDIAN_ARMOR, 1, FEET);
    private static ArmorMaterial RUBY_ARMOR = EnumHelper.addArmorMaterial(MODID + ".ruby_armor",
            MODID + ":ruby_armor", 85, new int[]{4, 8, 5, 4}, 6, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    // Ruby Armor
    public static Item RUBY_HELMET = new BaseArmor(MODID + ".ruby_helmet", RUBY_ARMOR, 1, HEAD);
    public static Item RUBY_CHESTPLATE = new BaseArmor(MODID + ".ruby_chestplate", RUBY_ARMOR, 1, CHEST);
    public static Item RUBY_LEGGINGS = new BaseArmor(MODID + ".ruby_leggings", RUBY_ARMOR, 2, LEGS);
    public static Item RUBY_BOOTS = new BaseArmor(MODID + ".ruby_boots", RUBY_ARMOR, 1, FEET);
    private static Item.ToolMaterial EMERALD_GEM = addToolMaterial(MODID + ".emerald", 3, 2740, 16.5F, 4.0F, 8);
    // Emerald Tools
    public static Item EMERALD_SWORD = new BaseSword(EMERALD_GEM, MODID + ".emerald_sword");
    public static Item EMERALD_AXE = new BaseAxe(EMERALD_GEM, -3.0F, MODID + ".emerald_axe");
    public static Item EMERALD_SHOVEL = new BaseSpade(EMERALD_GEM, MODID + ".emerald_shovel");
    public static Item EMERALD_PICKAXE = new BasePickaxe(EMERALD_GEM, MODID + ".emerald_pickaxe");
    public static Item EMERALD_HOE = new BaseHoe(EMERALD_GEM, MODID + ".emerald_hoe");
    private static Item.ToolMaterial OBSIDIAN_GEM = addToolMaterial(MODID + ".obsidian", 2, 1210, 23.5F, 6.5F, 5);
    // Obsidian Tools
    public static Item OBSIDIAN_SWORD = new BaseSword(OBSIDIAN_GEM, MODID + ".obsidian_sword");
    public static Item OBSIDIAN_AXE = new BaseAxe(OBSIDIAN_GEM, -3.0F, MODID + ".obsidian_axe");
    public static Item OBSIDIAN_SHOVEL = new BaseSpade(OBSIDIAN_GEM, MODID + ".obsidian_shovel");
    public static Item OBSIDIAN_PICKAXE = new BasePickaxe(OBSIDIAN_GEM, MODID + ".obsidian_pickaxe");
    public static Item OBSIDIAN_HOE = new BaseHoe(OBSIDIAN_GEM, MODID + ".obsidian_hoe");
    private static Item.ToolMaterial RUBY_GEM = addToolMaterial(MODID + ".ruby", 3, 2290, 16.0F, 4.5F, 7);
    // Ruby Tools
    public static Item RUBY_SWORD = new BaseSword(RUBY_GEM, MODID + ".ruby_sword");
    public static Item RUBY_AXE = new BaseAxe(RUBY_GEM, -3.0F, MODID + ".ruby_axe");
    public static Item RUBY_SHOVEL = new BaseSpade(RUBY_GEM, MODID + ".ruby_shovel");
    public static Item RUBY_PICKAXE = new BasePickaxe(RUBY_GEM, MODID + ".ruby_pickaxe");
    public static Item RUBY_HOE = new BaseHoe(RUBY_GEM, MODID + ".ruby_hoe");
}
