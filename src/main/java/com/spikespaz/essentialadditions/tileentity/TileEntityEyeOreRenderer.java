package com.spikespaz.essentialadditions.tileentity;

import com.spikespaz.essentialadditions.proxy.ClientProxy;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class TileEntityEyeOreRenderer extends TileEntitySpecialRenderer<TileEntityEyeOre> {
    @Override
    public void renderTileEntityAt(TileEntityEyeOre te, double x, double y, double z, float partialTicks, int destroyStage) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5F, y + 0.5F, z + 0.5F);

        if (te.rotateTo != null) {
            GlStateManager.rotate(80, te.rotateTo[0], te.rotateTo[1], te.rotateTo[2]);
        } else {
            GlStateManager.rotate(80, 0, 0, 0);
        }

        GlStateManager.enableCull();

        this.bindTexture(ClientProxy.EYE_BALL_TEXTURE);
        ClientProxy.EYE_BALL_MODEL.render(null, 0, 0, 0, 0, 0, 0.0625F);

        GlStateManager.popMatrix();
    }
}
