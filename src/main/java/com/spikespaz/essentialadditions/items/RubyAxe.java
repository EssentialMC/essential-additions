package com.spikespaz.essentialadditions.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class RubyAxe extends ItemSword {
    public RubyAxe(Item.ToolMaterial RubyGem) {
        super(RubyGem);
        setUnlocalizedName("RubyAxe").setCreativeTab(CreativeTabs.tabTools).setTextureName("essentialadditions:RubyAxe");
    }
}
