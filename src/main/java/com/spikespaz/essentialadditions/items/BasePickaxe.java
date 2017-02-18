package com.spikespaz.essentialadditions.items;

import net.minecraft.item.ItemPickaxe;

class BasePickaxe extends ItemPickaxe {
    BasePickaxe(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
    }
}
