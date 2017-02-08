package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ObsidianSword extends ItemSword {
    public ObsidianSword(Item.ToolMaterial ObsidianToolShard) {
        super(ObsidianToolShard);
        this.setUnlocalizedName("ObsidianSword").setCreativeTab(CreativeTabs.tabCombat).setTextureName(EssentialAdditions.MODID + ":ObsidianSword");
    }
}
