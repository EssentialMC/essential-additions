package com.spikespaz.essentialadditions.blocks;

import com.spikespaz.essentialadditions.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class ModBlocks {
    // Static declarations of all blocks and their properties.
    // Custom Ores
    public static Block sulfur_block = new BaseBlock(Material.sand, "sulfur_block", 0.5F, 0F, "pickaxe", 0, CreativeTabs.tabBlock) {
        public Item getItemDropped(int par1, Random random, int par2) {
            return ModItems.sulfur;
        }

        public int quantityDropped(Random par1Random) {
            return 4;
        }
    }.setStepSound(Block.soundTypeSand);

    public static Block eye_ore = new EyeOre(Material.rock, "eye_ore", 3.0F, 5.0F, "pickaxe", 3, CreativeTabs.tabBlock);
    // Ruby Blocks
    public static Block ruby_block = new BaseBlock(Material.rock, "ruby_block", 5.0F, 10.0F, "pickaxe", 1, CreativeTabs.tabBlock).setStepSound(Block.soundTypeMetal);
    public static Block ruby_ore = new BaseBlock(Material.rock, "ruby_ore", 3.0F, 5.0F, "pickaxe", 3, CreativeTabs.tabBlock) {
        public Item getItemDropped(int par1, Random random, int par2) {
            return ModItems.ruby;
        }

        public int quantityDropped(Random par1Random) {
            return 2;
        }
    }.setStepSound(Block.soundTypePiston);
    // Other
    public static Block charcoal_block = new BaseBlock(Material.rock, "charcoal_block", 5.0F, 10.0F, "pickaxe", 2, CreativeTabs.tabBlock).setStepSound(Block.soundTypePiston);
}
