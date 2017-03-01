package com.spikespaz.essentialadditions.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

import static com.spikespaz.essentialadditions.proxy.ClientProxy.UNIVERSAL_RANDOM;
import static java.lang.Math.abs;

public class TileEntityEyeOre extends TileEntity implements ITickable {
    static float[] rotateTo;
    int delayedTickCount;
    private boolean reversed;
    private float lastChanged;
    Float idleRotation = 0F;
    EntityPlayer nearestPlayer;

    @Override
    public void update() {
        nearestPlayer = this.getWorld().getClosestPlayer(
                this.pos.getX() + 0.5F, this.pos.getY() + 0.5F, this.pos.getZ() + 0.5F, 5.0F, false);
        if (nearestPlayer != null) {
            double offsetX = nearestPlayer.posX - this.pos.getX() + 0.5F;
            double offsetY = nearestPlayer.posY - this.pos.getY() + 0.5F;
            double offsetZ = nearestPlayer.posZ - this.pos.getZ() + 0.5F;

            rotateTo = new float[] {(float) offsetX, (float) offsetY, (float) offsetZ};
        } else {
            rotateTo = new float[] {0, 0, 0};
        }

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
        }

        if (reversed) {
            idleRotation += 3.6F;
        } else {
            idleRotation -= 3.6F;
        }
    }
}
