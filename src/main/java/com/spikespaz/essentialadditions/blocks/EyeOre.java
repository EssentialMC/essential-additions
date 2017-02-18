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
        arrayList.add(new ItemStack(Items.ENDER_PEARL));
        arrayList.add(new ItemStack(Items.BLAZE_POWDER));
        return arrayList;
    }
}
