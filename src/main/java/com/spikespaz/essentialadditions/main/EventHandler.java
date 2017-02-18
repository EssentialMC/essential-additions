package com.spikespaz.essentialadditions.main;

public class EventHandler {
//    @SubscribeEvent
//    public void BreakEvent(BlockEvent.BreakEvent event) {
//        // Get tool used to break the block.
//        ItemStack toolUsed = event.getPlayer().getCurrentEquippedItem();
//        // Drop itself when a mob spawner is broken.
//        if (event.state.getBlock() instanceof BlockMobSpawner && !event.world.isRemote && toolUsed.getItem().getHarvestLevel(toolUsed, "pickaxe") >= 2) {
//            TileEntity tile = event.world.getTileEntity(event.pos);
//            ItemStack drop = new ItemStack(Item.getItemFromBlock(event.state.getBlock()));
//            drop.setTagCompound(tile.getTileData());
//            spawnAsEntity(event.world, event.pos, drop);
//        }
//    }
}
