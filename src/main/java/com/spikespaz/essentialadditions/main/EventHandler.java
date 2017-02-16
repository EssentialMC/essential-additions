package com.spikespaz.essentialadditions.main;

import net.minecraft.block.BlockMobSpawner;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.spikespaz.essentialadditions.main.EssentialAdditions.generateFuzzyPos;
import static net.minecraft.block.Block.spawnAsEntity;

public class EventHandler {
    @SubscribeEvent
    public void BreakEvent(BlockEvent.BreakEvent event) {
        // Drop itself when a mob spawner is broken.
        if (event.state.getBlock() instanceof BlockMobSpawner && !event.world.isRemote) {
            spawnAsEntity(event.world, generateFuzzyPos(event.pos, event.world), new ItemStack(Item.getItemFromBlock(event.state.getBlock())));
        }
    }
}
