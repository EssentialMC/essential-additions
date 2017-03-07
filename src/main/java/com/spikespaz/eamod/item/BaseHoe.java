package com.spikespaz.eamod.item;

import net.minecraft.item.ItemHoe;

class BaseHoe extends ItemHoe {
    BaseHoe(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
