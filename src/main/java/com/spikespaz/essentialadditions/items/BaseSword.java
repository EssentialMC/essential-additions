package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.item.ItemSword;

class BaseSword extends ItemSword {
    BaseSword(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(EssentialAdditions.MODID + ":" + unlocalizedName);
    }
}
