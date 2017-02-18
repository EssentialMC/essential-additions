package com.spikespaz.essentialadditions.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.ArrayList;

public class EyeOre extends BaseBlock {
    // Separate block class for eye_ore so we can make it drop two items easier.
    EyeOre() {
        super(Material.ROCK, "eye_ore", 3.0F, 5.0F, "pickaxe", 3, CreativeTabs.BUILDING_BLOCKS, SoundType.STONE);
    }

    // If entity that is an instance of EnderDragon, disable destroy. Else allow.
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
        return !(entity instanceof EntityDragon);
    }

    // Return a list of items that the ore will drop.
    @Override
    public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>();
        arrayList.add(new ItemStack(Items.ENDER_PEARL));
        arrayList.add(new ItemStack(Items.BLAZE_POWDER));
        return arrayList;
    }
}
