package com.spikespaz.essentialadditions.blocks;

import com.spikespaz.essentialadditions.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class ModBlocks {
    public static Block SulfurBlock;

    public static Block EyeOre;

    public static Block RubyBlock;
    public static Block RubyOre;

    public static void mainRegistry() {
        initializeBlock();
        registerItem();
    }

    private static void initializeBlock() {
        SulfurBlock = new BaseBlock(Material.sand, "SulfurBlock", 0.5F, 0F, "pickaxe", 0, CreativeTabs.tabBlock) {
            public Item getItemDropped(int par1, Random random, int par2) {
                return ModItems.Sulfur;
            }

            public int quantityDropped(Random par1Random) {
                return 4;
            }
        }.setStepSound(Block.soundTypeSand);

        EyeOre = new BaseBlock(Material.rock, "EyeOre", 3.0F, 5.0F, "pickaxe", 3, CreativeTabs.tabBlock) {
            public Item getItemDropped(int par1, Random random, int par2) {
                return Items.ender_pearl;                                  // This should eventually drop "Items.ender_pearl" and "Items.blaze_powder"
            }

            public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
                return !(entity instanceof EntityDragon) || this != EyeOre;
            }
        };

        RubyBlock = new BaseBlock(Material.rock, "RubyBlock", 5.0F, 10.0F, "pickaxe", 1, CreativeTabs.tabBlock).setStepSound(Block.soundTypeMetal);
        RubyOre = new BaseBlock(Material.rock, "RubyOre", 3.0F, 5.0F, "pickaxe", 3, CreativeTabs.tabBlock) {
            public Item getItemDropped(int par1, Random random, int par2) {
                return ModItems.Ruby;
            }
        };
    }

    private static void registerItem() {
        GameRegistry.registerBlock(SulfurBlock, SulfurBlock.getUnlocalizedName());

        GameRegistry.registerBlock(EyeOre, EyeOre.getUnlocalizedName());

        GameRegistry.registerBlock(RubyOre, RubyOre.getUnlocalizedName());
        GameRegistry.registerBlock(RubyBlock, RubyBlock.getUnlocalizedName());
    }
}
