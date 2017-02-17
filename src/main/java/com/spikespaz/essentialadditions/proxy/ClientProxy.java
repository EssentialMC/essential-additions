package com.spikespaz.essentialadditions.proxy;


import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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

//    // Render all mod objects.
//    public void registerModObject(Object object) {
//        if (object instanceof Item) {
//            Item item = (Item) object;
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
//        } else if (object instanceof Block) {
//            Block block = (Block) object;
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
//        }
//    }
}
