package com.spikespaz.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ObsidianShovel extends ItemSpade
{
  public ObsidianShovel(Item.ToolMaterial ObsidianToolShard)
  {
    super(ObsidianToolShard);
    setUnlocalizedName("ObsidianShovel").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools).setTextureName("essentialadditions:ObsidianShovel");
  }
}
