package com.spikespaz.essentialadditions.blocks;

import com.spikespaz.essentialadditions.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;


public class SulfurBlock
        extends Block {
    protected SulfurBlock(Material sulfur) {
        super(sulfur);
        setHardness(0.4F);
        setResistance(3.0F);
        setHarvestLevel("picaxe", 0);
    }


    public Item getItemDropped(int par1, Random random, int par2) {
        return ModItems.Sulfur;
    }

    public int quantityDropped(Random par1Random) {
        return 4;
    }
}
