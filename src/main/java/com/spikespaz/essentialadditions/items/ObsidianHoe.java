package com.spikespaz.essentialadditions.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ObsidianHoe extends ItemHoe {
    public ObsidianHoe(Item.ToolMaterial ObsidianToolShard) {
        super(ObsidianToolShard);
        setUnlocalizedName("ObsidianHoe").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools).setTextureName("essentialadditions:ObsidianHoe");
    }
}
