package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ObsidianAxe extends ItemAxe {
    protected ObsidianAxe(Item.ToolMaterial ObsidianToolShard) {
        super(ObsidianToolShard);
        setUnlocalizedName("ObsidianAxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(EssentialAdditions.MODID + ":ObsidianAxe");
    }
}
