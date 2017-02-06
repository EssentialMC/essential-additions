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


/* Location:              C:\Users\spike\Desktop\EssentialAdditions_1.2.8-1.7.10-deobf.jar!\com\spikespaz\items\ObsidianPickaxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */