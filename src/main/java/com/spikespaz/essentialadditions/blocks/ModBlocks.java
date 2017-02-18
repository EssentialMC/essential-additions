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
    // Custom Ores
    public static Block sulfur_block = new BaseBlock(Material.ROCK, "sulfur_block",
            0.5F, 0F, "pickaxe", 0, CreativeTabs.BUILDING_BLOCKS, SoundType.SAND) {
        public Item getItemDropped(int par1, Random random, int par2) {
            return ModItems.sulfur;
        }

        public int quantityDropped(Random par1Random) {
            return 4;
        }
    };

    public static Block eye_ore = new EyeOre();
    // Ruby Blocks
    public static Block ruby_block = new BaseBlock(Material.ROCK, "ruby_block",
            5.0F, 10.0F, "pickaxe", 1, CreativeTabs.BUILDING_BLOCKS, SoundType.METAL);
    public static Block ruby_ore = new BaseBlock(Material.ROCK, "ruby_ore",
            3.0F, 5.0F, "pickaxe", 3, CreativeTabs.BUILDING_BLOCKS, SoundType.STONE) {
        public Item getItemDropped(int par1, Random random, int par2) {
            return ModItems.ruby;
        }

        public int quantityDropped(Random par1Random) {
            return 2;
        }
    };
    // Other
    public static Block charcoal_block = new BaseBlock(Material.ROCK, "charcoal_block",
            5.0F, 10.0F, "pickaxe", 2, CreativeTabs.BUILDING_BLOCKS, SoundType.STONE);
}
