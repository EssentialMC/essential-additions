package com.spikespaz.essentialadditions.proxy;

import com.spikespaz.essentialadditions.main.ModRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.spikespaz.essentialadditions.main.EssentialAdditions.MODID;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        ModRegistry.renderItems();
        ModRegistry.renderBlocks();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    // Render all mod objects.
    public static void renderModObject(Object object) {
        if (object instanceof Item) {
            Item item = (Item) object;
//            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(MODID + ":" + item.getUnlocalizedName().substring(5)));
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
        } else if (object instanceof Block) {
            Block block = (Block) object;
//            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(MODID + ":" + block.getUnlocalizedName().substring(5)));
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
        }
    }
}
