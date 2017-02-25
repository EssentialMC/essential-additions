package com.spikespaz.essentialadditions.main;

import com.spikespaz.essentialadditions.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EssentialAdditions.MODID, name = EssentialAdditions.NAME, version = EssentialAdditions.VERSION)
public class EssentialAdditions {
    public static final String MODID = "essentialadditions";
    static final String NAME = "Essential Additions";
    static final String VERSION = "1.5.3";
    private static final String CLIENTSIDE = "com.spikespaz.essentialadditions.proxy.ClientProxy";
    private static final String SERVERSIDE = "com.spikespaz.essentialadditions.proxy.CommonProxy";

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
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
     }
}
