package com.spikespaz.essentialadditions.blocks;

import com.spikespaz.essentialadditions.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
    // ruby Blocks
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
    public static Block charcoal_block = new CharcoalBlock(Material.rock, "charcoal_block", 5.0F, 10.0F, "pickaxe", 2, CreativeTabs.tabBlock).setStepSound(Block.soundTypePiston);

    // Register all blocks and their unlocalized names.
    public static void registerBlocks() {
        // Custom Ores
        GameRegistry.registerBlock(sulfur_block, sulfur_block.getUnlocalizedName());

        GameRegistry.registerBlock(eye_ore, eye_ore.getUnlocalizedName());
        // ruby Blocks
       GameRegistry.registerBlock(ruby_ore, ruby_ore.getUnlocalizedName());
        GameRegistry.registerBlock(ruby_block, ruby_block.getUnlocalizedName());
        // Other
        GameRegistry.registerBlock(charcoal_block, charcoal_block.getUnlocalizedName());
    }
}
