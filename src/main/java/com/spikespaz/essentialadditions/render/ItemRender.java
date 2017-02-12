package com.spikespaz.essentialadditions.render;

import com.spikespaz.essentialadditions.EssentialAdditions;
import com.spikespaz.essentialadditions.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRender {

    public static void registerItemRender() {

        reg(ModItems.emerald_axe);
        reg(ModItems.emerald_boots);

        //JUST REGISTER EVERY ITEM.


    }

    private static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(EssentialAdditions.MODID+ ":" +item.getUnlocalizedName().substring(5), "inventory"));
    }



}
