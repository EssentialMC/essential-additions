package com.spikespaz.essentialadditions.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class RubySword extends ItemSword {
    public RubySword(Item.ToolMaterial RubyGem) {
        super(RubyGem);
        setUnlocalizedName("RubySword").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat).setTextureName("essentialadditions:RubySword");
    }
}
