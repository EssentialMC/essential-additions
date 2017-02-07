package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class EmeraldPickaxe extends ItemPickaxe {
    public EmeraldPickaxe(Item.ToolMaterial EmeraldGem) {
        super(EmeraldGem);
        setUnlocalizedName("EmeraldPickaxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(EssentialAdditions.MODID + ":EmeraldPickaxe");
    }
}
