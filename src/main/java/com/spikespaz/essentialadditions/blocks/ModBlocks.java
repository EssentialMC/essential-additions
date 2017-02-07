package com.spikespaz.essentialadditions.blocks;

import com.spikespaz.essentialadditions.EssentialAdditions;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {
    public static Block SulfurBlock;
    public static Block RubyBlock;
    public static Block RubyOre;

    public static void mainRegistry() {
        initializeBlock();
        registerItem();
    }


    private static void initializeBlock() {
        SulfurBlock = new SulfurBlock(Material.ground).setBlockName("SulfurBlock").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(EssentialAdditions.MODID + ":SulfurBlock");

        RubyBlock = new RubyBlock(Material.ground).setBlockName("RubyBlock").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(EssentialAdditions.MODID + ":RubyBlock");
        RubyOre = new RubyOre(Material.ground).setBlockName("RubyOre").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(EssentialAdditions.MODID + ":RubyOre");
    }

    private static void registerItem() {
        GameRegistry.registerBlock(SulfurBlock, SulfurBlock.getUnlocalizedName());

        GameRegistry.registerBlock(RubyOre, RubyOre.getUnlocalizedName());
        GameRegistry.registerBlock(RubyBlock, RubyBlock.getUnlocalizedName());
    }
}
