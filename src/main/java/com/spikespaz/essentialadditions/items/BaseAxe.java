package com.spikespaz.essentialadditions.items;

import net.minecraft.item.ItemAxe;

class BaseAxe extends ItemAxe {
    BaseAxe(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
   }
}
