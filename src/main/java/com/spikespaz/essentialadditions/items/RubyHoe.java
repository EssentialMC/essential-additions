package com.spikespaz.essentialadditions.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class RubyHoe extends ItemHoe {
    public RubyHoe(Item.ToolMaterial RubyGem) {
        super(RubyGem);
        setUnlocalizedName("RubyHoe").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools).setTextureName("essentialadditions:RubyHoe");
    }
}
