package com.spikespaz.essentialadditions.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class EmeraldAxe extends ItemSword {
    public EmeraldAxe(Item.ToolMaterial EmeraldGem) {
        super(EmeraldGem);
        setUnlocalizedName("EmeraldAxe").setCreativeTab(CreativeTabs.tabTools).setTextureName("essentialadditions:EmeraldAxe");
    }
}
