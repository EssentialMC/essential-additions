package com.spikespaz.essentialadditions.world;

import com.google.common.base.Predicate;
import com.spikespaz.essentialadditions.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
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
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimensionId()) {
            case -1:
                generateNether(world, random, chunkX, chunkZ, BlockHelper.forBlock(Blocks.nether_brick));
                break;
            case 0:
                generateOverworld(world, random, chunkX, chunkZ, BlockHelper.forBlock(Blocks.stone));
                break;
            case 1:
                generateEnd(world, random, chunkX, chunkZ, BlockHelper.forBlock(Blocks.end_stone));
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

            gen.generate(world, random, new BlockPos(randomX,randomY,randomZ));
        }
    }
}
