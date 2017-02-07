package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class EmeraldSword extends ItemSword {
    public EmeraldSword(Item.ToolMaterial EmeraldGem) {
        super(EmeraldGem);
        setUnlocalizedName("EmeraldSword").setCreativeTab(CreativeTabs.tabCombat).setTextureName(EssentialAdditions.MODID + ":EmeraldSword");
    }
}
