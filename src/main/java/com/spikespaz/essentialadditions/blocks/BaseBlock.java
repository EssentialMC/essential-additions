package com.spikespaz.essentialadditions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import static com.spikespaz.essentialadditions.EssentialAdditions.MODID;

class BaseBlock extends Block {
    BaseBlock(Material material, String unlocalizedName, Float hardness, Float resistance, String tool, Integer mineLevel, CreativeTabs creativeTab) {
        super(material);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel(tool, mineLevel);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(MODID + ":" + unlocalizedName);
        this.setCreativeTab(creativeTab);
    }
}
