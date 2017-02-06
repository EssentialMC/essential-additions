package com.spikespaz.essentialadditions.Main;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import com.spikespaz.essentialadditions.world.ModWorld;
import com.spikespaz.essentialadditions.items.ModItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid="essentialadditions", name="Essential Additions", version="1.2.8")
public class MainRegistry
{
  @SidedProxy(clientSide="com.spikespaz.essentialadditions.Main.ClientProxy", serverSide="com.spikespaz.essentialadditions.Main.ServerProxy")
  public static ServerProxy proxy;

  @Mod.EventHandler
  public static void PreLoad(FMLPreInitializationEvent PreEvent)
  {
    ModBlocks.mainRegistry();
    ModItems.mainRegistry();
    ModWorld.mainRegistry();
    CraftingRecipes.mainRegistry();
    proxy.registerRenderInfo();
  }

  @Mod.EventHandler
  public static void load(FMLInitializationEvent event) {}

  @Mod.EventHandler
  public static void PostLoad(FMLPostInitializationEvent PostEvent) {}
}
