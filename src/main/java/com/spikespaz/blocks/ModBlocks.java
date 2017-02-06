package com.spikespaz.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks
{
  public static Block SulfurBlock;
  public static Block RubyBlock;
  public static Block RubyOre;

  public static void mainRegistry()
  {
    initializeBlock();
    registerItem();
  }




  public static void initializeBlock()
  {
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


/* Location:              C:\Users\spike\Desktop\EssentialAdditions_1.2.8-1.7.10-deobf.jar!\com\spikespaz\blocks\ModBlocks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */