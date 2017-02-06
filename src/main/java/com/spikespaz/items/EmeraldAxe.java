package com.spikespaz.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class EmeraldAxe extends ItemSword
{
  public EmeraldAxe(Item.ToolMaterial EmeraldGem)
  {
    super(EmeraldGem);
    setUnlocalizedName("EmeraldAxe").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools).setTextureName("essentialadditions:EmeraldAxe");
  }
}
