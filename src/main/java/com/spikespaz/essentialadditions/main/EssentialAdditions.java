package com.spikespaz.essentialadditions.main;

import com.spikespaz.essentialadditions.proxy.CommonProxy;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EssentialAdditions.MODID, name = EssentialAdditions.NAME, version = EssentialAdditions.VERSION)
public class EssentialAdditions {
    public static final String MODID = "essentialadditions";
    static final String NAME = "Essential Additions";
    static final String VERSION = "1.4.1";
    private static final String CLIENTSIDE = "com.spikespaz.essentialadditions.proxy.ClientProxy";
  //  private static final String SERVERSIDE = "com.spikespaz.essentialadditions.proxy.ServerProxy";

    @SidedProxy(clientSide=CLIENTSIDE)
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

    // Simple function used to get a "fuzzy" position from a given BlockPos.
    public static BlockPos generateFuzzyPos(BlockPos initialPos, World world) {
        float f = 0.5F;

        double d0 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        double d1 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
        double d2 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;

        return initialPos.add(d0, d1, d2);
    }
}
