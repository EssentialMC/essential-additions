package com.spikespaz.essentialadditions.tileentity;

import com.spikespaz.essentialadditions.proxy.ClientProxy;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class TileEntityEyeOreRenderer extends TileEntitySpecialRenderer<TileEntityEyeOre> {
    @Override
    public void renderTileEntityAt(TileEntityEyeOre te, double x, double y, double z, float partialTicks, int destroyStage) {
        GlStateManager.pushMatrix();
        // Makes the eye bob up and down slowly. Looks like it's floating.
        GlStateManager.translate(x + 0.5F, y + 0.5F + te.smoothFloat, z + 0.5F);

        // If the player exists watch them.
        if (te.player != null) {
            // Why does the order of this f****** matter?
            // FIVE F****** DAYS and this is all that I had to do to fix it.
            // What the actual f***! (._.)
            // From now on, put the horizontal (y) rotation AFTER vertical (x) rotation.
            // Apparently this is known as "Euler" rotation. The guy's name is pronounced "Oiler". Why?
            GlStateManager.rotate((float) te.rotationY, 0, 1, 0);
            GlStateManager.rotate((float) te.rotationX, 1, 0, 0);
        } else {
            // If there is no close enough player just scan the surrounding terrain.
            // Randomly reverses direction of rotation.
            GlStateManager.rotate((float) te.idleRotation, 0, 1, 0);
        }

        GlStateManager.enableCull();

        this.bindTexture(ClientProxy.EYE_BALL_TEXTURE);
        ClientProxy.EYE_BALL_MODEL.render(null, 0, 0, 0, 0, 0, 0.0625F);

        GlStateManager.popMatrix();
    }
}
