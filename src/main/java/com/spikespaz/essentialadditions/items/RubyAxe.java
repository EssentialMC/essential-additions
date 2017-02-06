package com.spikespaz.essentialadditions.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class RubyAxe extends ItemSword
{
  public RubyAxe(Item.ToolMaterial RubyGem)
  {
    super(RubyGem);
    setUnlocalizedName("RubyAxe").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools).setTextureName("essentialadditions:RubyAxe");
  }
}
