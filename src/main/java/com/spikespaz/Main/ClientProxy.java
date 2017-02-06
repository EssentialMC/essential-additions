package com.spikespaz.Main;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy
{
  public void registerRenderInfo() {}

  public int addArmor(String armor)
  {
    return RenderingRegistry.addNewArmourRendererPrefix(armor);
  }
}
