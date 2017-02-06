package com.spikespaz.essentialadditions.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class EmeraldPickaxe extends ItemPickaxe
{
  public EmeraldPickaxe(Item.ToolMaterial EmeraldGem)
  {
    super(EmeraldGem);
    setUnlocalizedName("EmeraldPickaxe").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools).setTextureName("essentialadditions:EmeraldPickaxe");
  }
}
