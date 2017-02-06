package com.spikespaz.items;

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


/* Location:              C:\Users\spike\Desktop\EssentialAdditions_1.2.8-1.7.10-deobf.jar!\com\spikespaz\items\RubyShovel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */