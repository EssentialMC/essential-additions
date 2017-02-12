package com.spikespaz.essentialadditions.world;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class GenerateSmallVein extends WorldGenerator {

    private Block block;
    private Block target;

    //init of worldGen by constructor chaining.
    GenerateSmallVein(Block block, int blockVeinSize, Block target) {
        this.block = block;
        this.target = target;
    }

    private GenerateSmallVein(Block block, Block target) {
        this(block, 0, target);
    }

    public GenerateSmallVein(Block block) {
        this(block, Blocks.stone);
    }


    // This is to check if the block at X, Y, Z is replaceable or not and place the block.
    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {//AGAIN NO IDEA WHAT A PREDICATE IS.
        if (worldIn.getBlockState(position).getBlock().isReplaceableOreGen(worldIn, position, this.target)) {
            worldIn.setBlockState(position,this.block.getDefaultState());
        }


        return true;
    }
}
