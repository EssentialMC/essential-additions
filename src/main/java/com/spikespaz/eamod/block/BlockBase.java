package com.spikespaz.eamod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.spikespaz.eamod.main.EssentialAdditions.MODID;

class BlockBase extends Block {
    BlockBase(Material material, Float hardness, Float resistance, String tool, Integer mineLevel, CreativeTabs creativeTab, SoundType sound, String name) {
        super(material);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel(tool, mineLevel);
        this.setCreativeTab(creativeTab);
        this.setSoundType(sound);
        this.setUnlocalizedName(MODID + "." + name);
        this.setRegistryName(name);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
}
