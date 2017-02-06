package com.spikespaz.world;

import com.spikespaz.blocks.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;


public class ModOres
  implements IWorldGenerator
{
  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
  {
    switch (world.provider.dimensionId) {
    case -1:
      generateNether(random, chunkX * 16, chunkZ * 16, world);
      break;
    case 0:
      generateOverworld(random, chunkX * 16, chunkZ * 16, world);
      break;
    case 1:
      generateEnd(random, chunkX * 16, chunkZ * 16, world);
    }

  }

  private void addOre(Block block, Block blockspawn, Random random, World world, int posX, int posZ, int minY, int maxY, int veinSize, int spawnChance)
  {
    for (int chunkX = 0; chunkX < spawnChance; chunkX++)
    {
      int xPos = posX + random.nextInt(16);
      int yPos = minY + random.nextInt(maxY - minY);
      int zPos = posZ + random.nextInt(16);

      new WorldGenMinable(block, veinSize, blockspawn).generate(world, random, xPos, yPos, zPos);
    }
  }

  private void generateNether(Random random, int chunkX, int chunkZ, World world)
  {
    addOre(ModBlocks.SulfurBlock, Blocks.netherrack, random, world, chunkX, chunkZ, 5, 120, 8, 25);
  }

  private void generateOverworld(Random random, int chunkX, int chunkZ, World world)
  {
    addOre(ModBlocks.RubyOre, Blocks.stone, random, world, chunkX, chunkZ, 5, 50, 2, 1);
  }

  private void generateEnd(Random random, int chunkX, int chunkZ, World world) {}
}


/* Location:              C:\Users\spike\Desktop\EssentialAdditions_1.2.8-1.7.10-deobf.jar!\com\spikespaz\world\ModOres.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */