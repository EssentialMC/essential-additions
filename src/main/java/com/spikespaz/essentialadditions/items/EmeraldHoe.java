package com.spikespaz.essentialadditions.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class EmeraldHoe extends ItemHoe {
    public EmeraldHoe(Item.ToolMaterial EmeraldGem) {
        super(EmeraldGem);
        setUnlocalizedName("EmeraldHoe").setCreativeTab(CreativeTabs.tabTools).setTextureName("essentialadditions:EmeraldHoe");
    }
}
