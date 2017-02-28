package com.spikespaz.essentialadditions.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.MathHelper;

public class TileEntityEyeOre extends TileEntity implements ITickable {
    public int tickCount;
    public float tRot;
    public float eyeRotation;
    public float eyeRotationPrev;

    @Override
    public void update() {
        EntityPlayer nearestPlayer = this.getWorld().getClosestPlayer(
                this.pos.getX() + 0.5F, this.pos.getY() + 0.5F, this.pos.getZ() + 0.5F, 5.0F, false);
        if (nearestPlayer != null) {
            double d0 = nearestPlayer.posX - this.pos.getX() + 0.5F;
            double d1 = nearestPlayer.posY - this.pos.getY() + 0.5F;
            double d2 = nearestPlayer.posZ - this.pos.getZ() + 0.5F;

            this.tRot = (float) MathHelper.atan2(d1, d0);
        } else {
            this.tRot += 0.02F;
        }

        while (this.eyeRotation >= Math.PI) {
            this.eyeRotation -= Math.PI * 2F;
        }

        while (this.eyeRotation < -Math.PI) {
            this.eyeRotation += Math.PI * 2F;
        }

        while (this.tRot >= Math.PI) {
            this.tRot -= Math.PI * 2F;
        }

        while (this.tRot < -Math.PI) {
            this.tRot += Math.PI * 2F;
        }

        float f2;

        for (f2 = this.tRot - this.eyeRotation; f2 >= Math.PI; f2 -= Math.PI * 2F) {}

        while (f2 < -Math.PI) {
            f2 += Math.PI * 2F;
        }

        this.eyeRotation += f2 * 0.4F;
        ++ this.tickCount;
    }
}
