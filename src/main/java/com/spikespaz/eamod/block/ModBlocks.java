package com.spikespaz.eamod.block;

import com.spikespaz.eamod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

import static com.spikespaz.eamod.proxy.ClientProxy.UNIVERSAL_RANDOM;

public class ModBlocks {
    // Static declarations of all block and their properties.
    // Here I use anonymous classes to customize the drops of some block.
    // While I'm told there's nothing wrong with this, it's generally frowned on because of code readability and organization.
    // It's perfectly readable if you use IntelliJ's collapse feature, and its even fine without that IMO.
    // Custom Ores
    public static Block SULFUR_BLOCK = new BlockBase(Material.ROCK, 0.5F, 0F,
            "pickaxe", 0, CreativeTabs.BUILDING_BLOCKS, SoundType.SAND, "sulfur_block") {
        public Item getItemDropped(IBlockState state, Random rand, int fortune) {
            return ModItems.SULFUR;
        }

        public int quantityDropped(Random par1Random) {
            return 3;
        }
    };

    public static Block EYE_ORE = new BlockEyeOre("eye_ore");
    // Ruby Blocks
    public static Block RUBY_BLOCK = new BlockBase(Material.ROCK, 5.0F, 10.0F,
            "pickaxe", 1, CreativeTabs.BUILDING_BLOCKS, SoundType.METAL, "ruby_block");
    public static Block RUBY_ORE = new BlockBase(Material.ROCK, 3.0F, 5.0F,
            "pickaxe", 3, CreativeTabs.BUILDING_BLOCKS, SoundType.STONE, "ruby_ore") {
        public Item getItemDropped(IBlockState state, Random rand, int fortune) {
            return ModItems.RUBY;
        }

        public int quantityDropped(Random par1Random) {
            return 1;
        }
    };
    // Other
    public static Block CHARCOAL_BLOCK = new BlockBase(Material.ROCK, 5.0F, 10.0F,
            "pickaxe", 2, CreativeTabs.BUILDING_BLOCKS, SoundType.STONE, "charcoal_block");

    public static Block FOREST_MULCH = new BlockBase(Material.GRASS, 1.0F, 0.5F,
            "shovel", 0, CreativeTabs.DECORATIONS, SoundType.PLANT, "forest_mulch") {
        @Override
        public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
            return new AxisAlignedBB(0, 0, 0, 1, 0, 1);
        }

        public boolean isFullyOpaque(IBlockState state) {
            return false;
        }

        public boolean isOpaqueCube(IBlockState state) {
            return false;
        }

        public boolean isFullCube(IBlockState state) {
            return false;
        }

        public boolean canPlaceBlockAt(World world, BlockPos pos) {
            Block block = world.getBlockState(pos.down()).getBlock();

            return block == Blocks.GRASS || block == Blocks.DIRT;

        }

        public Item getItemDropped(IBlockState state, Random rand, int fortune) {
            return Items.STICK;
        }

        public int quantityDropped(Random random) {
            return UNIVERSAL_RANDOM.nextInt(2);
        }

        public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
            return true;
        }
    };


}
