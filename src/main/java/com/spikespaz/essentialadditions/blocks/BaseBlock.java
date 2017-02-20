package com.spikespaz.essentialadditions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.spikespaz.essentialadditions.main.EssentialAdditions.MODID;

class BaseBlock extends Block {
    @SuppressWarnings("deprecation")
    BaseBlock(Material material, String unlocalizedName, Float hardness, Float resistance, String tool, Integer mineLevel, CreativeTabs creativeTab, SoundType sound, String name) {
        super(material);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel(tool, mineLevel);
        this.setCreativeTab(creativeTab);
        this.setSoundType(sound);
        this.setUnlocalizedName(MODID + "." + unlocalizedName);
        this.setRegistryName(name);
        // Yes, I know that this is deprecated. It works fine so leave me alone.
        // Forge: "Modders SHOULD NOT use this, so it'll stay deprecated. Purely added to make lazy modders happy -.-"
        // Well, call me a lazy modder, but it stays.
        // I see no reason not to use it, because I would just need to do the same thing anyways. Deal with it.
        GameRegistry.registerWithItem(this);
    }
}
