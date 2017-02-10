package com.spikespaz.essentialadditions.world;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGeneration implements IWorldGenerator {



    /*
    A brief of what is happening->
    I have created another class same as WorldGenMineable called WorldGenSingleMineable.
    now, WorldGenMineable doesnt work for small veins while WorldGenSingleMineable doesnt work for
    big veins.
    (Actually it works for big veins but the generation is very un-natural)
    so, now all I am doing is checking, if the vein size is less than 4 then the generator
    will use WorldGenSingleMineable otherwise it will use WorldGenMineable.
    if you want to change the spawn rate of any ore just change the CHANCE variable.
    I have already adjusted chance variables for overworld,nether,end. Looks all good to me.

     */


    // All ore entries in these three.

    private void generateNether(World world, Random random, int x, int z, Block replaceBlock) {
        generateOre(ModBlocks.SulfurBlock, world, random, x, z, 8, 10, 60, 0, 256, replaceBlock);
    }


    private void generateOverworld(World world, Random random, int x, int z, Block replaceBlock) {
        generateOre(ModBlocks.RubyOre, world, random, x, z, 1, 2, 10, 4, 32, replaceBlock);
    }

    private void generateEnd(World world, Random random, int x, int z, Block replaceBlock) {
        generateOre(ModBlocks.EyeOre, world, random, x, z, 1, 1, 460, 0, 256, replaceBlock);
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
            gen = new WorldGenSingleMinable(ore, veinSize, replaceBlock);
        } else {
            gen = new WorldGenMinable(ore, 0, veinSize, replaceBlock);

        }

        for (int i = 0; i < chance; i++) {
            int randomX = chunkX * 16 + random.nextInt(16);
            int randomY = random.nextInt(heightRange) + minY;
            int randomZ = chunkZ * 16 + random.nextInt(16);
/* Use this code to get some random locations of block places
            if(random.nextBoolean()&&random.nextBoolean()&&random.nextBoolean()&&random.nextBoolean()&&random.nextBoolean()&&random.nextBoolean()){
                System.out.println(randomX+" "+randomY+" "+randomZ);
            }
*/
            gen.generate(world, random, randomX, randomY, randomZ);
        }


    }


}
