package com.spikespaz.essentialadditions.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ObsidianAxe extends ItemAxe
{
  protected ObsidianAxe(Item.ToolMaterial ObsidianToolShard)
  {
    super(ObsidianToolShard);
    setUnlocalizedName("ObsidianAxe").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools).setTextureName("essentialadditions:ObsidianAxe");
  }
}
