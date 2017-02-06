package com.spikespaz.essentialadditions.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {
    public static Block SulfurBlock;
    public static Block RubyBlock;
    public static Block RubyOre;

    public static void mainRegistry() {
        initializeBlock();
        registerItem();
    }


    public static void initializeBlock() {
        SulfurBlock = new SulfurBlock(net.minecraft.block.material.Material.ground).setBlockName("SulfurBlock").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName("essentialadditions:SulfurBlock");

        RubyBlock = new RubyBlock(net.minecraft.block.material.Material.ground).setBlockName("RubyBlock").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName("essentialadditions:RubyBlock");
        RubyOre = new RubyOre(net.minecraft.block.material.Material.ground).setBlockName("RubyOre").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName("essentialadditions:RubyOre");
    }

    public static void registerItem() {
        GameRegistry.registerBlock(SulfurBlock, SulfurBlock.getUnlocalizedName());

        GameRegistry.registerBlock(RubyOre, RubyOre.getUnlocalizedName());
        GameRegistry.registerBlock(RubyBlock, RubyBlock.getUnlocalizedName());
    }
}
