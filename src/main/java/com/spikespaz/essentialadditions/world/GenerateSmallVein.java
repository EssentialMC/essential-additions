package com.spikespaz.essentialadditions.world;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class GenerateSmallVein extends WorldGenerator {

    private IBlockState block;
    private Predicate<IBlockState> target;

    //init of worldGen by constructor chaining.
    GenerateSmallVein(IBlockState block, Predicate<IBlockState> target) {
        this.block = block;
        this.target = target;
    }

    @SuppressWarnings("unchecked")
    public GenerateSmallVein(IBlockState block) {
        this(block, BlockHelper.forBlock(Blocks.stone));
    }


    // This is to check if the block at X, Y, Z is replaceable or not and place the block.
    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {
        if (world.getBlockState(pos).getBlock().isReplaceableOreGen(world, pos, this.target))
            world.setBlockState(pos, this.block);
        return true;
    }
}
