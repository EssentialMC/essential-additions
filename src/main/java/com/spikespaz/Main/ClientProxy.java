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


/* Location:              C:\Users\spike\Desktop\EssentialAdditions_1.2.8-1.7.10-deobf.jar!\com\spikespaz\Main\ClientProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */