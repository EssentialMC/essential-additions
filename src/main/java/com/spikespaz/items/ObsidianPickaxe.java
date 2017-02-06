package com.spikespaz.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ObsidianPickaxe extends ItemPickaxe
{
  protected ObsidianPickaxe(Item.ToolMaterial ObsidianToolShard)
  {
    super(ObsidianToolShard);
    setUnlocalizedName("ObsidianPickaxe").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools).setTextureName("essentialadditions:ObsidianPickaxe");
  }
}
