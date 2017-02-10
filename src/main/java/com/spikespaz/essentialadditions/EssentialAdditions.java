package com.spikespaz.essentialadditions;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import com.spikespaz.essentialadditions.items.ModItems;
import com.spikespaz.essentialadditions.proxy.CommonProxy;
import com.spikespaz.essentialadditions.world.WorldGeneration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = EssentialAdditions.MODID, name = EssentialAdditions.NAME, version = EssentialAdditions.VERSION)
public class EssentialAdditions {
    public static final String MODID = "essentialadditions";
    static final String NAME = "Essential Additions";
    static final String VERSION = "1.3.2";
    private static final String CLIENTSIDE = "com.spikespaz.essentialadditions.proxy.ClientProxy";
    private static final String SERVERSIDE = "com.spikespaz.essentialadditions.proxy.CommonProxy";

    @SidedProxy(clientSide = EssentialAdditions.CLIENTSIDE, serverSide = EssentialAdditions.SERVERSIDE)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreLoad(FMLPreInitializationEvent PreEvent) {
        ModBlocks.mainRegistry();
        ModItems.mainRegistry();
        GameRegistry.registerWorldGenerator(new WorldGeneration(), 10);
        CraftingRecipes.mainRegistry();
        proxy.registerRenderInfo();
    }
}
