package com.spikespaz.essentialadditions.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import static com.spikespaz.essentialadditions.main.EssentialAdditions.MODID;
import static net.minecraft.inventory.EntityEquipmentSlot.*;
import static net.minecraft.item.ItemArmor.ArmorMaterial;
import static net.minecraftforge.common.util.EnumHelper.addToolMaterial;

public class ModItems {
    private static ArmorMaterial emerald_armor = EnumHelper.addArmorMaterial("emerald_armor",
            MODID +":emerald_armor", 80, new int[]{4, 8, 5, 4}, 6, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
    private static ArmorMaterial obsidian_armor = EnumHelper.addArmorMaterial("obsidian_armor",
            MODID +":obsidian_armor", 47, new int[]{6, 7, 6, 5}, 5, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
    private static ArmorMaterial ruby_armor = EnumHelper.addArmorMaterial("ruby_armor",
            MODID +":ruby_armor", 85, new int[]{4, 8, 5, 4}, 6, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);

    private static Item.ToolMaterial emerald_gem = addToolMaterial("Emerald", 3, 2740, 16.5F, 4.0F, 8);
    private static Item.ToolMaterial obsidian_gem = addToolMaterial("Obsidian", 2, 1210, 23.5F, 6.5F, 5);
    private static Item.ToolMaterial ruby_gem = addToolMaterial("ruby", 3, 2290, 16.0F, 4.5F, 7);
    // Static declarations of all items and their properties.
    // Emerald Armor
    public static Item emerald_helmet = new BaseArmor("emerald_helmet", emerald_armor, 1, HEAD);
    public static Item emerald_chestplate = new BaseArmor("emerald_chestplate", emerald_armor, 1, CHEST);
    public static Item emerald_leggings = new BaseArmor("emerald_leggings", emerald_armor, 2, LEGS);
    public static Item emerald_boots = new BaseArmor("emerald_boots", emerald_armor, 1, FEET);
//    // Obsidian Armor
    public static Item obsidian_helmet = new BaseArmor("obsidian_helmet", obsidian_armor, 1, HEAD);
    public static Item obsidian_chestplate = new BaseArmor("obsidian_chestplate", obsidian_armor, 1, CHEST);
    public static Item obsidian_leggings = new BaseArmor("obsidian_leggings", obsidian_armor, 2, LEGS);
    public static Item obsidian_boots = new BaseArmor("obsidian_boots", obsidian_armor, 1, FEET);
//    // Ruby Armor
    public static Item ruby_helmet = new BaseArmor("ruby_helmet", ruby_armor, 1, HEAD);
    public static Item ruby_chestplate = new BaseArmor("ruby_chestplate", ruby_armor, 1, CHEST);
    public static Item ruby_leggings = new BaseArmor("ruby_leggings", ruby_armor, 2, LEGS);
    public static Item ruby_boots = new BaseArmor("ruby_boots", ruby_armor, 1, FEET);
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
    public static Item obsidian_shard = new Item().setUnlocalizedName("obsidian_shard").setCreativeTab(CreativeTabs.MATERIALS);
    public static Item sulfur = new Item().setUnlocalizedName("sulfur").setCreativeTab(CreativeTabs.MATERIALS);
    public static Item charcoal_dust = new Item().setUnlocalizedName("charcoal_dust").setCreativeTab(CreativeTabs.MATERIALS);

    public static Item ruby = new Item().setUnlocalizedName("ruby").setCreativeTab(CreativeTabs.MATERIALS);
    public static Item iron_plating = new Item().setUnlocalizedName("iron_plating").setCreativeTab(CreativeTabs.MATERIALS);
    public static Item gold_plating = new Item().setUnlocalizedName("gold_plating").setCreativeTab(CreativeTabs.MATERIALS);
    public static Item chain_link = new Item().setUnlocalizedName("chain_link").setCreativeTab(CreativeTabs.MATERIALS);
}
