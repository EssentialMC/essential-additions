package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.item.ItemAxe;

class BaseAxe extends ItemAxe {
    BaseAxe(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(EssentialAdditions.MODID + ":" + unlocalizedName);
    }
}
