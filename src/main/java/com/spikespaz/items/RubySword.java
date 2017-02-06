package com.spikespaz.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class RubySword extends ItemSword
{
  public RubySword(Item.ToolMaterial RubyGem)
  {
    super(RubyGem);
    setUnlocalizedName("RubySword").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:RubySword");
  }
}


/* Location:              C:\Users\spike\Desktop\EssentialAdditions_1.2.8-1.7.10-deobf.jar!\com\spikespaz\items\RubySword.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */