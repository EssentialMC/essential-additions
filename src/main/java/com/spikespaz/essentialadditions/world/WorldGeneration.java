package com.spikespaz.essentialadditions.world;

import com.google.common.base.Predicate;
import com.spikespaz.essentialadditions.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGeneration implements IWorldGenerator {
    // All OreGen for each block can be put into these three.
    // Nether Ores
    private void generateNether(World world, Random random, int x, int z, Predicate<IBlockState> replaceBlock) {
        generateOre(ModBlocks.sulfur_block, world, random, x, z, 8, 10, 60, 0, 256, replaceBlock);
    }
    // Overworld Ores
    private void generateOverworld(World world, Random random, int x, int z, Predicate<IBlockState> replaceBlock) {
        generateOre(ModBlocks.ruby_ore, world, random, x, z, 1, 2, 10, 4, 32, replaceBlock);
    }
    // End Ores
    private void generateEnd(World world, Random random, int x, int z, Predicate<IBlockState> replaceBlock) {
        generateOre(ModBlocks.eye_ore, world, random, x, z, 1, 1, 460, 0, 256, replaceBlock);
    }

    // The default blocks to replace based on the dimension can be changed.
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case -1:
                generateNether(world, random, chunkX, chunkZ, BlockMatcher.forBlock(Blocks.NETHER_BRICK));
                break;
            case 0:
                generateOverworld(world, random, chunkX, chunkZ, BlockMatcher.forBlock(Blocks.STONE));
                break;
            case 1:
                generateEnd(world, random, chunkX, chunkZ, BlockMatcher.forBlock(Blocks.END_STONE));
                break;
            default:
                break;
        }
    }

    // You probably don't need to touch this.
    private void generateOre(Block ore, World world, Random random, int chunkX, int chunkZ,
                             int minVeinSize, int maxVeinSize, int chance, int minY, int maxY,
                             Predicate<IBlockState> replaceBlock) {
        int veinSize = random.nextInt(maxVeinSize - minVeinSize + 1) + minVeinSize;
        int heightRange = maxY - minY;
        WorldGenerator gen;
        if (veinSize < 4) {
            gen = new GenerateSmallVein(ore.getDefaultState(), replaceBlock);
        } else {
            gen = new WorldGenMinable(ore.getDefaultState(), veinSize);

        }

        for (int i = 0; i < chance; i++) {
            int randomX = chunkX * 16 + random.nextInt(16);
            int randomY = random.nextInt(heightRange) + minY;
            int randomZ = chunkZ * 16 + random.nextInt(16);

            gen.generate(world, random, new BlockPos(randomX, randomY, randomZ));
//            System.out.println(randomX+" "+randomY+" "+randomZ);
        }
    }
}
