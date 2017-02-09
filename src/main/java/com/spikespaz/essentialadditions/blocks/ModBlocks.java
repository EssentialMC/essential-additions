package com.spikespaz.essentialadditions.blocks;

import com.spikespaz.essentialadditions.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class ModBlocks {
    public static Block SulfurBlock;
    public static Block RubyBlock;
    public static Block RubyOre;

    public static void mainRegistry() {
        initializeBlock();
        registerItem();
    }

    private static void initializeBlock() {
        SulfurBlock = new BaseBlock(Material.sand, "SulfurBlock", 0.4F, 3F, "pickaxe", 0, CreativeTabs.tabBlock) {
            public Item getItemDropped(int par1, Random random, int par2) {
                return ModItems.Sulfur;
            }

            public int quantityDropped(Random par1Random) {
                return 4;
            }
        };

        RubyBlock = new BaseBlock(Material.rock, "RubyBlock", 5.0F, 10.0F, "pickaxe", 1, CreativeTabs.tabBlock);
        RubyOre = new BaseBlock(Material.rock, "RubyOre", 3.0F, 5.0F, "pickaxe", 3, CreativeTabs.tabBlock) {
            public Item getItemDropped(int par1, Random random, int par2) {
                return ModItems.Ruby;
            }
        };
    }

    private static void registerItem() {
        GameRegistry.registerBlock(SulfurBlock, SulfurBlock.getUnlocalizedName());

        GameRegistry.registerBlock(RubyOre, RubyOre.getUnlocalizedName());
        GameRegistry.registerBlock(RubyBlock, RubyBlock.getUnlocalizedName());
    }
}
