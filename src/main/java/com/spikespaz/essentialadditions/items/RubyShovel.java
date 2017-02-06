package com.spikespaz.essentialadditions.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class RubyShovel extends ItemSpade
{
  public RubyShovel(Item.ToolMaterial RubyGem)
  {
    super(RubyGem);
    setUnlocalizedName("RubyShovel").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools).setTextureName("essentialadditions:RubyShovel");
  }
}
