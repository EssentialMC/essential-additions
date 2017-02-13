package com.spikespaz.essentialadditions.proxy;


import com.spikespaz.essentialadditions.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.spikespaz.essentialadditions.main.EssentialAdditions.MODID;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
       RegisterModObjectsisterItemsAndBlocks();
    }


    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

    
    
    private void RegisterModObjectsisterItemsAndBlocks(){
 /*       RegisterModObjects(ModItems.emerald_helmet);
        RegisterModObjects(ModItems.emerald_chestplate);
        RegisterModObjects(ModItems.emerald_leggings);
        RegisterModObjects(ModItems.emerald_boots);
        RegisterModObjects(ModItems.obsidian_helmet);
        RegisterModObjects(ModItems.obsidian_chestplate);
        RegisterModObjects(ModItems.obsidian_leggings);
        RegisterModObjects(ModItems.obsidian_boots);
        RegisterModObjects(ModItems.ruby_helmet);
        RegisterModObjects(ModItems.ruby_chestplate);
        RegisterModObjects(ModItems.ruby_leggings);
        RegisterModObjects(ModItems.ruby_boots);
*/
        RegisterModObjects(ModItems.emerald_sword);
        RegisterModObjects(ModItems.emerald_pickaxe);
        RegisterModObjects(ModItems.emerald_hoe);
        RegisterModObjects(ModItems.emerald_axe);
        RegisterModObjects(ModItems.emerald_shovel);

        RegisterModObjects(ModItems.obsidian_sword);
        RegisterModObjects(ModItems.obsidian_pickaxe);
        RegisterModObjects(ModItems.obsidian_hoe);
        RegisterModObjects(ModItems.obsidian_axe);
        RegisterModObjects(ModItems.obsidian_shovel);

        RegisterModObjects(ModItems.ruby_sword);
        RegisterModObjects(ModItems.ruby_pickaxe);
        RegisterModObjects(ModItems.ruby_hoe);
        RegisterModObjects(ModItems.ruby_axe);
        RegisterModObjects(ModItems.ruby_shovel);

        RegisterModObjects(ModItems.obsidian_shard);
        RegisterModObjects(ModItems.sulfur);
        RegisterModObjects(ModItems.charcoal_dust);

        RegisterModObjects(ModItems.ruby);
        RegisterModObjects(ModItems.iron_plating);
        RegisterModObjects(ModItems.gold_plating);
        RegisterModObjects(ModItems.chain_link);
    }
    
    
    
    
    public void RegisterModObjects(Object object) {

        if (object instanceof Item) {
            Item item = (Item) object;
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
        } else if (object instanceof Block) {
            Block block=(Block) object;
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
        }
    }
}
