package com.spikespaz.essentialadditions.render;

import com.spikespaz.essentialadditions.EssentialAdditions;
import com.spikespaz.essentialadditions.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRender {

    public static void registerItemRender() {
/*
        reg(ModItems.emerald_helmet);
        reg(ModItems.emerald_chestplate);
        reg(ModItems.emerald_leggings);
        reg(ModItems.emerald_boots);

        reg(ModItems.obsidian_helmet);
        reg(ModItems.obsidian_chestplate);
        reg(ModItems.obsidian_leggings);
        reg(ModItems.obsidian_boots);

        reg(ModItems.ruby_helmet);
        reg(ModItems.ruby_chestplate);
        reg(ModItems.ruby_leggings);
        reg(ModItems.ruby_boots);
*/
        reg(ModItems.emerald_sword);
        reg(ModItems.emerald_pickaxe);
        reg(ModItems.emerald_hoe);
        reg(ModItems.emerald_axe);
        reg(ModItems.emerald_shovel);

        reg(ModItems.obsidian_sword);
        reg(ModItems.obsidian_pickaxe);
        reg(ModItems.obsidian_hoe);
        reg(ModItems.obsidian_axe);
        reg(ModItems.obsidian_shovel);

        reg(ModItems.ruby_sword);
        reg(ModItems.ruby_pickaxe);
        reg(ModItems.ruby_hoe);
        reg(ModItems.ruby_axe);
        reg(ModItems.ruby_shovel);

        reg(ModItems.obsidian_shard);
        reg(ModItems.sulfur);
        reg(ModItems.charcoal_dust);

        reg(ModItems.ruby);
        reg(ModItems.iron_plating);
        reg(ModItems.gold_plating);
        reg(ModItems.chain_link);
        //JUST REGISTER EVERY ITEM.


    }

    private static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(EssentialAdditions.MODID+ ":" +item.getUnlocalizedName().substring(5), "inventory"));
    }



}
