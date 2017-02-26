package com.spikespaz.essentialadditions.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

class BaseAxe extends ItemAxe {
    BaseAxe(Item.ToolMaterial material, float attackSpeed, String unlocalizedName) {
        super(material, material.getDamageVsEntity(), attackSpeed);
        this.setUnlocalizedName(unlocalizedName);
    }
}
