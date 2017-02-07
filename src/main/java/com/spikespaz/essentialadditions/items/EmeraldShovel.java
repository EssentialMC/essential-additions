package com.spikespaz.essentialadditions.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class EmeraldShovel extends ItemSpade {
    public EmeraldShovel(Item.ToolMaterial EmeraldGem) {
        super(EmeraldGem);
        setUnlocalizedName("EmeraldShovel").setCreativeTab(CreativeTabs.tabTools).setTextureName("essentialadditions:EmeraldShovel");
    }
}
