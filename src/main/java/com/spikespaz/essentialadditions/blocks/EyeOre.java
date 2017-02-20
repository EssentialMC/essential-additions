package com.spikespaz.essentialadditions.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Random;

public class EyeOre extends BaseBlock {
    // Separate block class for eye_ore so we can make it drop two items easier.
    EyeOre() {
        super(Material.ROCK,3.0F, 5.0F,
                "pickaxe", 3, CreativeTabs.BUILDING_BLOCKS, SoundType.STONE, "eye_ore");
        this.setLightLevel(1.5F);
    }

    // If entity that is an instance of EnderDragon, disable destroy. Else allow.
    public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) {
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

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        for (int i = 0; i < 31; ++i) {
                worldIn.spawnParticle(EnumParticleTypes.PORTAL,
                        pos.getX() + (worldIn.rand.nextDouble()),
                        pos.getY() + worldIn.rand.nextDouble(),
                        pos.getZ() + (worldIn.rand.nextDouble()),
                        (worldIn.rand.nextDouble() - 0.5D) * 2.0D, - worldIn.rand.nextDouble(),
                        (worldIn.rand.nextDouble() - 0.5D) * 2.0D);
        }
    }
}