package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.item.ItemSpade;

class BaseSpade extends ItemSpade {
    BaseSpade(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(EssentialAdditions.MODID + ":" + unlocalizedName);
    }
}
