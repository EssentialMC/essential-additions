package com.spikespaz.eamod.main;

import com.spikespaz.eamod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EssentialAdditions.MODID, name = EssentialAdditions.NAME, version = EssentialAdditions.VERSION)
public class EssentialAdditions {
    public static final String MODID = "eamod";
    static final String NAME = "Essential Additions";
    static final String VERSION = "1.7.0";
    private static final String CLIENTSIDE = "com.spikespaz.eamod.proxy.ClientProxy";
    private static final String SERVERSIDE = "com.spikespaz.eamod.proxy.CommonProxy";

    @SidedProxy(clientSide = CLIENTSIDE, serverSide = SERVERSIDE)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
