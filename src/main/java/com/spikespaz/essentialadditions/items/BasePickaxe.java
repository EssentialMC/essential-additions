package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.item.ItemPickaxe;

class BasePickaxe extends ItemPickaxe {
    BasePickaxe(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(EssentialAdditions.MODID + ":" + unlocalizedName);
    }
}
