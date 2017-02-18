package com.spikespaz.essentialadditions.main;

import net.minecraft.block.BlockMobSpawner;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static net.minecraft.block.Block.spawnAsEntity;

public class EventHandler {
    @SubscribeEvent
    public void BreakEvent(BlockEvent.BreakEvent event) {
        // Get tool used to break the block.
        Item toolUsed = event.getPlayer().getCurrentEquippedItem().getItem();
        // Drop itself when a mob spawner is broken.
        if (event.state.getBlock() instanceof BlockMobSpawner && !event.world.isRemote && toolUsed.getHarvestLevel(new ItemStack(toolUsed), "pickaxe") >= 2) {
            ItemStack drop = new ItemStack(Item.getItemFromBlock(event.state.getBlock()));
            spawnAsEntity(event.world, event.pos, drop);
        }
    }
}
