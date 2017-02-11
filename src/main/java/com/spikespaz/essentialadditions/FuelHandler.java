package com.spikespaz.essentialadditions;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack itemStack) {
        Block blockFuel = Block.getBlockFromItem(itemStack.getItem());
        // There are 20TPS in Minecraft. (S*20=T)
        if(blockFuel == ModBlocks.CharcoalBlock) {
            return 16000;
        }
        // Don't change this zero.
        return 0;
    }
}
