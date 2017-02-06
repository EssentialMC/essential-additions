package com.spikespaz.essentialadditions.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class RubyPickaxe extends ItemPickaxe {
    public RubyPickaxe(Item.ToolMaterial RubyGem) {
        super(RubyGem);
        setUnlocalizedName("RubyPickaxe").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools).setTextureName("essentialadditions:RubyPickaxe");
    }
}
