package com.spikespaz.blocks;

import com.spikespaz.items.ModItems;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;


public class RubyOre
  extends Block
{
  protected RubyOre(Material ruby)
  {
    super(ruby);
    setHardness(3.0F);
    setResistance(5.0F);
    setHarvestLevel("picaxe", 3);
  }


  public Item getItemDropped(int par1, Random random, int par2)
  {
    return ModItems.Ruby;
  }
}


/* Location:              C:\Users\spike\Desktop\EssentialAdditions_1.2.8-1.7.10-deobf.jar!\com\spikespaz\blocks\RubyOre.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */