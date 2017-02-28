package com.spikespaz.essentialadditions.tileentity;

import com.spikespaz.essentialadditions.proxy.ClientProxy;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

import static com.spikespaz.essentialadditions.proxy.ClientProxy.UNIVERSAL_RANDOM;
import static java.lang.Math.abs;

public class TileEntityEyeOreRenderer extends TileEntitySpecialRenderer<TileEntityEyeOre> {
    Float multiplier = 3.6F;

    @Override
    public void renderTileEntityAt(TileEntityEyeOre te, double x, double y, double z, float partialTicks, int destroyStage) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5F, y + 0.5F, z + 0.5F);

        if (te.nearestPlayer == null) {
            if (te.delayedTickCount == 100 && UNIVERSAL_RANDOM.nextBoolean()) {
                multiplier = -multiplier;
            }

            GlStateManager.rotate((multiplier * te.delayedTickCount), 0, 1, 0);

            double smoothFloat = abs((te.delayedTickCount - 50) / 400D) - 0.0625;
            GlStateManager.translate(0, smoothFloat, 0);
        } else {
        }

        GlStateManager.enableCull();

        this.bindTexture(ClientProxy.EYE_BALL_TEXTURE);
        ClientProxy.EYE_BALL_MODEL.render(null, 0, 0, 0, 0, 0, 0.0625F);

        GlStateManager.popMatrix();
    }
}
