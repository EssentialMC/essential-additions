package com.spikespaz.essentialadditions.items;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

public class BaseArmor extends ItemArmor {

    public BaseArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
}
