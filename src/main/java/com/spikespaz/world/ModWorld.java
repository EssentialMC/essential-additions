package com.spikespaz.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWorld
{
  public static void mainRegistry() {}

  public static void initializeWorldGen()
  {
    registerWorldGen(new ModOres(), 1);
  }

  public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability) {
    GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
  }
}


/* Location:              C:\Users\spike\Desktop\EssentialAdditions_1.2.8-1.7.10-deobf.jar!\com\spikespaz\world\ModWorld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */