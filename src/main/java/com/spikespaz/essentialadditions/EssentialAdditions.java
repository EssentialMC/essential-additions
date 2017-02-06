package com.spikespaz.essentialadditions;

import com.spikespaz.essentialadditions.Main.CraftingRecipes;
import com.spikespaz.essentialadditions.Main.ServerProxy;
import com.spikespaz.essentialadditions.blocks.ModBlocks;
import com.spikespaz.essentialadditions.items.ModItems;
import com.spikespaz.essentialadditions.lib.ReferenceStrings;
import com.spikespaz.essentialadditions.world.ModWorld;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = ReferenceStrings.MODID, name = ReferenceStrings.NAME, version = ReferenceStrings.VERSION)
public class EssentialAdditions {
    @SidedProxy(clientSide = ReferenceStrings.CLIENTSIDE, serverSide = ReferenceStrings.SERVERSIDE)
    public static ServerProxy proxy;

    @Mod.EventHandler
    public static void PreLoad(FMLPreInitializationEvent PreEvent) {
        ModBlocks.mainRegistry();
        ModItems.mainRegistry();
        ModWorld.mainRegistry();
        CraftingRecipes.mainRegistry();
        proxy.registerRenderInfo();
    }

    @Mod.EventHandler
    public static void load(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public static void PostLoad(FMLPostInitializationEvent PostEvent) {
    }
}
