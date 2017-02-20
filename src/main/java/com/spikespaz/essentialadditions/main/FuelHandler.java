package com.spikespaz.essentialadditions.main;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack itemStack) {
        Block blockFuel = Block.getBlockFromItem(itemStack.getItem());
        // There are 20TPS in Minecraft. (S*20=T)
        if(blockFuel == ModBlocks.CHARCOAL_BLOCK) {
            return 16000;
        }
        // Don't change this zero.
        return 0;
    }
}
