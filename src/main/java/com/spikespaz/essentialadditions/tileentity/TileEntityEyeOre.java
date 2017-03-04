package com.spikespaz.essentialadditions.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

import static com.spikespaz.essentialadditions.proxy.ClientProxy.UNIVERSAL_RANDOM;
import static java.lang.Math.abs;
import static java.lang.Math.atan2;
import static java.lang.Math.hypot;

public class TileEntityEyeOre extends TileEntity implements ITickable {
    private int delayedTickCount;
    double idleRotation = 0F,
            rotationX, rotationY,
            smoothFloat;
    EntityPlayer player;
    private boolean reversed;
    private float lastChanged, rotationSpeed;

    @Override
    public void update() {
        player = this.getWorld().getClosestPlayer(
                this.pos.getX() + 0.5F, this.pos.getY() + 0.5F, this.pos.getZ() + 0.5F, 10.0F, false);
        if (player != null) {
            // X rotation is vertical.
            // Y rotation is horizontal.

            double offsetX = player.posX - this.pos.getX() - 0.5D;
            double offsetY = player.posY - this.pos.getY() + player.eyeHeight - 0.5D;
            double offsetZ = player.posZ - this.pos.getZ() - 0.5D;

            double distance = hypot(offsetX, offsetZ);

            rotationX = atan2(offsetY, distance) * (180D / Math.PI);
            rotationY = atan2(offsetX, offsetZ) * (180D / Math.PI) - 180D;


        }

        // Calculate how to translate for the bobbing effect.
        smoothFloat = abs((delayedTickCount - 50) / 400D) - 0.0625D;

        // Counts for 5 seconds for smoother and slower animations.
        if (delayedTickCount == 100) {
            delayedTickCount = 0;
        } else {
            ++delayedTickCount;
        }

        // Randomly reverse the direction as long as it hasn't already been changed within 1.5 seconds ago.
        if (UNIVERSAL_RANDOM.nextInt(50) == 0 & abs(delayedTickCount - lastChanged) > 30) {
            reversed = !reversed;
            lastChanged = delayedTickCount;
            rotationSpeed = 3.6F + UNIVERSAL_RANDOM.nextFloat() * 5.4F;
        }

        if (reversed) {
            idleRotation += rotationSpeed;
        } else {
            idleRotation -= rotationSpeed;
        }
    }
}
