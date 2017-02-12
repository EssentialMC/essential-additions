package com.spikespaz.essentialadditions.items;

import net.minecraft.item.ItemSpade;

class BaseSpade extends ItemSpade {
    BaseSpade(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
