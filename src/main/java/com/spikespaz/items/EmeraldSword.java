package com.spikespaz.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class EmeraldSword extends ItemSword
{
  public EmeraldSword(Item.ToolMaterial EmeraldGem)
  {
    super(EmeraldGem);
    setUnlocalizedName("EmeraldSword").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:EmeraldSword");
  }
}
