package com.spikespaz.essentialadditions.items;

import net.minecraft.item.ItemSword;

class BaseSword extends ItemSword {
    BaseSword(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
