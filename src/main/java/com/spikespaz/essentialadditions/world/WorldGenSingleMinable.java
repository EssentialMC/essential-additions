package com.spikespaz.essentialadditions.world;

/*
I AM MAKING THIS CLASS WITHOUT ANY IDE SO.... XD YOU WILL HAVE TO FIX SOME THINGS
*/

public class WorldGenSingleMinable extends WorldGenerator {

 private Block block;
    private int blockmeta;
    private Block target;

//init of worldGen by constructor chaining.
    public WorldGenSingleMinable(Block block, int meta, Block target) {
        this.block = block;
        this.blockmeta = meta;
        this.target = target;
    }

    public WorldGenSingleMinable(Block block, Block target) {
        this(block, 0, target);
    }

    public WorldGenSingleMinable(Block block) {
        this(block, Blocks.stone);
    }


//This is to check if the block at xyz is replaceable or not
    @Override
    public boolean generate(World world, Random random, int x, int y, int z) {
    if (world.getBlock(x, y, z).isReplaceableOreGen(world, x, y, z, this.target))
        world.setBlock(x, y, z, this.block, this.blockmeta, 2);
    return true;
    }





}
