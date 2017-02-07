package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class RubySword extends ItemSword {
    public RubySword(Item.ToolMaterial RubyGem) {
        super(RubyGem);
        setUnlocalizedName("RubySword").setCreativeTab(CreativeTabs.tabCombat).setTextureName(EssentialAdditions.MODID + ":RubySword");
    }
}
