package com.spikespaz.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ObsidianSword extends ItemSword
{
  public ObsidianSword(Item.ToolMaterial ObsidianToolShard)
  {
    super(ObsidianToolShard);
    setUnlocalizedName("ObsidianSword").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:ObsidianSword");
  }
}
