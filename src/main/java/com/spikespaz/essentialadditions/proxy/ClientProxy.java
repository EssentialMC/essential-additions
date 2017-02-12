package com.spikespaz.essentialadditions.proxy;


import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.spikespaz.essentialadditions.main.EssentialAdditions.MODID;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

    // Override from CommonProxy to render stuff.
    @Override
    public void RegisterModObject(Object object) {
        super.RegisterModObject(object);

        if (object instanceof Item) {
            Item item = (Item) object;
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                    new ModelResourceLocation(MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
        } else if (object instanceof Block) {
            Block block = (Block) object;
            GameRegistry.registerBlock(block, block.getUnlocalizedName());
        }
    }
}
