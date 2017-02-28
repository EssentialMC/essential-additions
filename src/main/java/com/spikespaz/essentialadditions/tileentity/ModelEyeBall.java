package com.spikespaz.essentialadditions.tileentity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEyeBall extends ModelBase {
    ModelRenderer eye;

    public ModelEyeBall() {
        textureWidth = 32;
        textureHeight = 16;

        eye = new ModelRenderer(this, 0, 0);
        eye.addBox(0F, 0F, 0F, 8, 8, 8);
        eye.setRotationPoint(-4F, -4F, -4F);
        eye.setTextureSize(32, 16);
        eye.mirror = true;
        setRotation(eye, 0F, 0F, 0F);
    }

    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        eye.render(scale);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
    }
}
