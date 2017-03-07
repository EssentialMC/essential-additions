package com.spikespaz.eamod.item;

import net.minecraft.item.ItemSword;

class BaseSword extends ItemSword {
    BaseSword(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
