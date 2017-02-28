package com.spikespaz.essentialadditions.tileentity;

import com.spikespaz.essentialadditions.proxy.ClientProxy;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.math.MathHelper;

public class TileEntityEyeOreRenderer extends TileEntitySpecialRenderer<TileEntityEyeOre> {
    private final ModelEyeBall modelEye = new ModelEyeBall();

    @Override
    public void renderTileEntityAt(TileEntityEyeOre te, double x, double y, double z, float partialTicks, int destroyStage) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5F, y + 0.5F, z + 0.5F);

        this.bindTexture(ClientProxy.EYE_BALL_TEXTURE);

        float f = te.tickCount + partialTicks;
        GlStateManager.translate(0.0F, 0.1F + MathHelper.sin(f * 0.1F) * 0.01F, 0.0F);
        float f1;

        for (f1 = te.eyeRotation - te.eyeRotationPrev; f1 >= Math.PI; f1 -= Math.PI * 2F) {}

        while (f1 < -Math.PI) {
            f1 += Math.PI * 2F;
        }

        float f2 = te.eyeRotationPrev + f1 * partialTicks;

        GlStateManager.rotate((float) (-f2 * (180F / Math.PI)), 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(80.0F, 0.0F, 0.0F, 1.0F);

        GlStateManager.enableCull();
        this.modelEye.render(null, f, 0, 0, 0, 0.0F, 0.0625F);

        GlStateManager.popMatrix();
    }
}
