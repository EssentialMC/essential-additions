package com.spikespaz.essentialadditions;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {


    @Override
    public int getBurnTime(ItemStack itemStack) {

        Block blockFuel = Block.getBlockFromItem(itemStack.getItem());

        if(blockFuel== ModBlocks.CharcoalBlock){
            return 16000;//there are 20 ticks/sec in minecraft world. Coal block burns for 13min 20sec
            //so 13*60+20=800sec. 800*20=16K. (in minecraft ticks)
        }

        /*
        This handler runs in background of game. Whenever someone tries to use anything as a fuel
        this function will be called. So I am checking if that block is CharcoalBlock, if it is,
        then return the burn time which is same as Coal Block. else return 0; dont change that 0.
        As changing it will cause every item in minecraft burn XD.
         */

        return 0;
    }



}
