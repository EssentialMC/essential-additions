package com.spikespaz.eamod.item;

import net.minecraft.item.ItemAxe;

class BaseAxe extends ItemAxe {
    BaseAxe(ToolMaterial material, float attackSpeed, String unlocalizedName) {
        super(material, material.getDamageVsEntity(), attackSpeed);
        this.setUnlocalizedName(unlocalizedName);
    }
}
