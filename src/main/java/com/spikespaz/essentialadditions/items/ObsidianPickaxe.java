package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ObsidianPickaxe extends ItemPickaxe {
    protected ObsidianPickaxe(Item.ToolMaterial ObsidianToolShard) {
        super(ObsidianToolShard);
        setUnlocalizedName("ObsidianPickaxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(EssentialAdditions.MODID + ":ObsidianPickaxe");
    }
}
