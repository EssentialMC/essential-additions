package com.spikespaz.essentialadditions.world;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import net.minecraft.block.Block;
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
    private void generateNether(World world, Random random, int x, int z, Block replaceBlock) {
        generateOre(ModBlocks.sulfur_block, world, random, x, z, 8, 10, 60, 0, 256, replaceBlock);
    }
    // Overworld Ores
    private void generateOverworld(World world, Random random, int x, int z, Block replaceBlock) {
        generateOre(ModBlocks.ruby_ore, world, random, x, z, 1, 2, 10, 4, 32, replaceBlock);
    }
    // End Ores
    private void generateEnd(World world, Random random, int x, int z, Block replaceBlock) {
        generateOre(ModBlocks.eye_ore, world, random, x, z, 1, 1, 460, 0, 256, replaceBlock);
    }

    // The default blocks to replace based on the dimension can be changed.
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case -1:
                generateNether(world, random, chunkX, chunkZ, Blocks.netherrack);
                break;
            case 0:
                generateOverworld(world, random, chunkX, chunkZ, Blocks.stone);
                break;
            case 1:
                generateEnd(world, random, chunkX, chunkZ, Blocks.end_stone);
                break;
            default:
                break;
        }
    }

    // You probably don't need to touch this.
    private void generateOre(Block ore, World world, Random random, int chunkX, int chunkZ,
                             int minVeinSize, int maxVeinSize, int chance, int minY, int maxY,
                             Block replaceBlock) {
        int veinSize = random.nextInt(maxVeinSize - minVeinSize + 1) + minVeinSize;
        int heightRange = maxY - minY;
        WorldGenerator gen;
        if (veinSize < 4) {
            gen = new GenerateSmallVein(ore, veinSize, replaceBlock);
        } else {//I NEED A PREDICATE FOR 3RD ARGUMENT. WAT IS A PREDICATE?! NEVER HEARD OF IT.
            gen = new WorldGenMinable(ore.getDefaultState(), veinSize, replaceBlock.getDefaultState());

        }

        for (int i = 0; i < chance; i++) {
            int randomX = chunkX * 16 + random.nextInt(16);
            int randomY = random.nextInt(heightRange) + minY;
            int randomZ = chunkZ * 16 + random.nextInt(16);

            gen.generate(world, random, new BlockPos(randomX,randomY,randomZ));
        }
    }
}
