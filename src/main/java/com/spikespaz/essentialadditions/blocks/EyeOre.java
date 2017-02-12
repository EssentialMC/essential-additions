package com.spikespaz.essentialadditions.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;

public class EyeOre extends BaseBlock {
    // Separate block class for eye_ore so we can make it drop two items easier.
    EyeOre(Material material, String unlocalizedName, Float hardness,
           Float resistance, String tool, Integer mineLevel, CreativeTabs creativeTab) {
        super(material, unlocalizedName, hardness, resistance, tool, mineLevel, creativeTab);
    }

    // If entity that is an instance of EnderDragon, disable destroy. Else allow.
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
        return !(entity instanceof EntityDragon);
    }

    // Return a list of items that the ore will drop.
    @Override
    public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>();
        arrayList.add(new ItemStack(Items.ender_pearl));
        arrayList.add(new ItemStack(Items.blaze_powder));
        return arrayList;
    }

    // On block destroy, drop the items.
    @Override
    public void onBlockDestroyedByPlayer(World world, BlockPos pos, IBlockState state) {
        if (!world.isRemote) {
            dropItems(world, pos, state);
        }
    }

    // Added some doubles to make the drops look natural.
    private void dropItems(World world, BlockPos pos, IBlockState state) {
        for (int i = 0; i < this.getDrops(world, pos, state, 0).size(); i++) {
            float f = 0.5F;
            double d0 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            double d1 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            double d2 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;

            BlockPos fuzzy_pos = pos.add(d0, d1, d2);
            spawnAsEntity(world, fuzzy_pos, this.getDrops(world, pos, state, 0).get(i));
        }
    }
}
