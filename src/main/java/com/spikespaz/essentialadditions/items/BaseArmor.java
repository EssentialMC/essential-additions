package com.spikespaz.essentialadditions.items;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

class BaseArmor extends ItemArmor {
    BaseArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorSlot) {
        super(material, renderIndex, armorSlot);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
