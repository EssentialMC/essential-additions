package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ObsidianHoe extends ItemHoe {
    public ObsidianHoe(Item.ToolMaterial ObsidianToolShard) {
        super(ObsidianToolShard);
        setUnlocalizedName("ObsidianHoe").setCreativeTab(CreativeTabs.tabTools).setTextureName(EssentialAdditions.MODID + ":ObsidianHoe");
    }
}
