package com.spikespaz.essentialadditions.world;

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
