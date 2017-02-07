package com.spikespaz.essentialadditions.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ObsidianShovel extends ItemSpade {
    public ObsidianShovel(Item.ToolMaterial ObsidianToolShard) {
        super(ObsidianToolShard);
        setUnlocalizedName("ObsidianShovel").setCreativeTab(CreativeTabs.tabTools).setTextureName("essentialadditions:ObsidianShovel");
    }
}
