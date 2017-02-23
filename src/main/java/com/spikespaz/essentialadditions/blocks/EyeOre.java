package com.spikespaz.essentialadditions.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityEnchantmentTable;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Random;

import static com.spikespaz.essentialadditions.main.EssentialAdditions.MODID;

public class EyeOre extends BlockContainer {
    EyeOre(String name) {
        super(Material.ROCK);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setSoundType(SoundType.STONE);
        this.setUnlocalizedName(MODID + "." + name);
        this.setRegistryName(name);
        this.setLightLevel(1.5F);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityEnchantmentTable();
    }

    // If entity that is an instance of EnderDragon, disable destroy. Else allow.
    public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) {
        return !(entity instanceof EntityDragon);
    }

    // Return a list of items that the ore will drop.
    public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>();
        arrayList.add(new ItemStack(Items.ENDER_PEARL));
        arrayList.add(new ItemStack(Items.BLAZE_POWDER));
        return arrayList;
    }

    // Particle effects.
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        for (int i = 0; i < 20; ++i) {
                worldIn.spawnParticle(EnumParticleTypes.PORTAL,
                        pos.getX() + (worldIn.rand.nextDouble()),
                        pos.getY() + worldIn.rand.nextDouble(),
                        pos.getZ() + (worldIn.rand.nextDouble()),
                        (worldIn.rand.nextDouble() - 0.5D) * 2.0D, - worldIn.rand.nextDouble(),
                        (worldIn.rand.nextDouble() - 0.5D) * 2.0D);
        }
    }

    // Used to determine ambient occlusion and culling when rebuilding chunks for render.
    @SideOnly(Side.CLIENT)
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    // The type of render function called. MODEL for mixed tesr and static model, MODELBLOCK_ANIMATED for TESR-only,
    @SideOnly(Side.CLIENT)
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}