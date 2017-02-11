package com.spikespaz.essentialadditions.blocks;

import com.spikespaz.essentialadditions.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class ModBlocks {
    // Static declarations of all blocks and their properties.
    // Custom Ores
    public static Block SulfurBlock = new BaseBlock(Material.sand, "SulfurBlock", 0.5F, 0F, "pickaxe", 0, CreativeTabs.tabBlock) {
        public Item getItemDropped(int par1, Random random, int par2) {
            return ModItems.Sulfur;
        }

        public int quantityDropped(Random par1Random) {
            return 4;
        }
    }.setStepSound(Block.soundTypeSand);

    public static Block EyeOre = new EyeOre(Material.rock, "EyeOre", 3.0F, 5.0F, "pickaxe", 3, CreativeTabs.tabBlock);
    // Ruby Blocks
    public static Block RubyBlock = new BaseBlock(Material.rock, "RubyBlock", 5.0F, 10.0F, "pickaxe", 1, CreativeTabs.tabBlock).setStepSound(Block.soundTypeMetal);
    public static Block RubyOre = new BaseBlock(Material.rock, "RubyOre", 3.0F, 5.0F, "pickaxe", 3, CreativeTabs.tabBlock) {
        public Item getItemDropped(int par1, Random random, int par2) {
            return ModItems.Ruby;
        }

        public int quantityDropped(Random par1Random) {
            return 2;
        }
    }.setStepSound(Block.soundTypePiston);
    // Other
    public static Block CharcoalBlock = new BaseBlock(Material.rock, "CharcoalBlock", 5.0F, 10.0F, "pickaxe", 2, CreativeTabs.tabBlock).setStepSound(Block.soundTypePiston);

    // Register all blocks and their unlocalized names.
    public static void registerBlocks() {
        // Custom Ores
        GameRegistry.registerBlock(SulfurBlock, SulfurBlock.getUnlocalizedName());

        GameRegistry.registerBlock(EyeOre, EyeOre.getUnlocalizedName());
        // Ruby Blocks
        GameRegistry.registerBlock(RubyOre, RubyOre.getUnlocalizedName());
        GameRegistry.registerBlock(RubyBlock, RubyBlock.getUnlocalizedName());
        // Other
        GameRegistry.registerBlock(CharcoalBlock, CharcoalBlock.getUnlocalizedName());
    }
}
