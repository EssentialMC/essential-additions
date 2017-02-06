package com.spikespaz.essentialadditions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RubyBlock
        extends Block {
    protected RubyBlock(Material ruby) {
        super(ruby);
        setHardness(5.0F);
        setResistance(10.0F);
        setHarvestLevel("picaxe", 1);
    }
}
