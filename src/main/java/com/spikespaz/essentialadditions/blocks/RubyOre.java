package com.spikespaz.essentialadditions.blocks;

import com.spikespaz.essentialadditions.items.ModItems;
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
