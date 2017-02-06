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


/* Location:              C:\Users\spike\Desktop\EssentialAdditions_1.2.8-1.7.10-deobf.jar!\com\spikespaz\items\EmeraldSword.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */