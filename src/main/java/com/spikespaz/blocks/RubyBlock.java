package com.spikespaz.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RubyBlock
  extends Block
{
  protected RubyBlock(Material ruby)
  {
    super(ruby);
    setHardness(5.0F);
    setResistance(10.0F);
    setHarvestLevel("picaxe", 1);
  }
}


/* Location:              C:\Users\spike\Desktop\EssentialAdditions_1.2.8-1.7.10-deobf.jar!\com\spikespaz\blocks\RubyBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */