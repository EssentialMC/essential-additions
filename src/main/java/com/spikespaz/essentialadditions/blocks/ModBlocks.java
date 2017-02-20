package com.spikespaz.essentialadditions.blocks;

import com.spikespaz.essentialadditions.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class ModBlocks {
    // Static declarations of all blocks and their properties.
    // Here I use anonymous classes to customize the drops of some blocks.
    // While I'm told there's nothing wrong with this, it's generally frowned on because of code readability and organization.
    // It's perfectly readable if you se IntelliJ's collapse feature, and its even fine without that IMO.
    // Custom Ores
    public static Block SULFUR_BLOCK = new BaseBlock(Material.ROCK, 0.5F, 0F,
            "pickaxe", 0, CreativeTabs.BUILDING_BLOCKS, SoundType.SAND, "sulfur_block") {
        public Item getItemDropped(int par1, Random random, int par2) {
            return ModItems.SULFUR;
        }

        public int quantityDropped(Random par1Random) {
            return 4;
        }
    };

    public static Block EYE_ORE = new EyeOre();
    // Ruby Blocks
    public static Block RUBY_BLOCK = new BaseBlock(Material.ROCK, 5.0F, 10.0F,
            "pickaxe", 1, CreativeTabs.BUILDING_BLOCKS, SoundType.METAL, "ruby_block");
    public static Block RUBY_ORE = new BaseBlock(Material.ROCK, 3.0F, 5.0F,
            "pickaxe", 3, CreativeTabs.BUILDING_BLOCKS, SoundType.STONE, "ruby_ore") {
        public Item getItemDropped(int par1, Random random, int par2) {
            return ModItems.RUBY;
        }

        public int quantityDropped(Random par1Random) {
            return 2;
        }
    };
    // Other
    public static Block CHARCOAL_BLOCK = new BaseBlock(Material.ROCK, 5.0F, 10.0F,
            "pickaxe", 2, CreativeTabs.BUILDING_BLOCKS, SoundType.STONE, "charcoal_block");
}
