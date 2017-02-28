package com.spikespaz.essentialadditions.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityEyeOre extends TileEntity implements ITickable {
    @Override
    public void update() {
        EntityPlayer nearestPlayer = this.getWorld().getClosestPlayer(
                this.pos.getX() + 0.5F, this.pos.getY() + 0.5F, this.pos.getZ() + 0.5F, 5.0F, false);
        if (nearestPlayer != null) {
            double offsetX = nearestPlayer.posX - this.pos.getX() + 0.5F;
            double offsetY = nearestPlayer.posY - this.pos.getY() + 0.5F;
            double offsetZ = nearestPlayer.posZ - this.pos.getZ() + 0.5F;

        } else {
        }
    }
}
