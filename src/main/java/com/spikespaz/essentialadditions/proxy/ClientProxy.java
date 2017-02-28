package com.spikespaz.essentialadditions.proxy;

import com.spikespaz.essentialadditions.main.ModRegistry;
import com.spikespaz.essentialadditions.tileentity.ModelEyeBall;
import com.spikespaz.essentialadditions.tileentity.TileEntityEyeOre;
import com.spikespaz.essentialadditions.tileentity.TileEntityEyeOreRenderer;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.spikespaz.essentialadditions.main.EssentialAdditions.MODID;

public class ClientProxy extends CommonProxy {
    public static final ResourceLocation EYE_BALL_TEXTURE = new ResourceLocation(MODID, "textures/tileentities/eye_ball.png");
    public static final ModelEyeBall EYE_BALL_MODEL = new ModelEyeBall();

    // Generic function to render every object in the mod, easier than separate.
    public static void renderModObject(Object object) {
        if (object instanceof Item) {
            Item item = (Item) object;
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        } else if (object instanceof Block) {
            Block block = (Block) object;
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
        }
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        ModRegistry.renderItems();
        ModRegistry.renderBlocks();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEyeOre.class, new TileEntityEyeOreRenderer());
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
