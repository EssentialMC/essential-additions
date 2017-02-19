package com.spikespaz.essentialadditions.world;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class GenerateSmallVein extends WorldGenerator {
    private IBlockState block;
    private Predicate<IBlockState> target;

    //init of worldGen by constructor chaining.
    GenerateSmallVein(IBlockState block, Predicate<IBlockState> replacement) {
        this.block = block;
        this.target = replacement;
    }

    @SuppressWarnings("unchecked")
    public GenerateSmallVein(IBlockState block) {
        this(block, BlockMatcher.forBlock(Blocks.STONE));
    }


    // This is to check if the block at X, Y, Z is replaceable or not and place the block.
    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {
//        if (world.getBlockState(pos).getBlock().isReplaceableOreGen(world.getBlockState(pos), world, pos, this.target))
        world.setBlockState(pos, this.block);
        System.out.println(pos);
        return true;
    }
}
