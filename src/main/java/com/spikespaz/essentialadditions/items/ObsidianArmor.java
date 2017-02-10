package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ObsidianArmor extends ItemArmor {
    ObsidianArmor(ItemArmor.ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if ((stack.getItem() == ModItems.EmeraldHelmet) || (stack.getItem() == ModItems.EmeraldChestplate) || (stack.getItem() == ModItems.EmeraldBoots))
            return EssentialAdditions.MODID + ":textures/armor/" + getClass().getSimpleName() + "_1.png";
        if ((stack.getItem() == ModItems.EmeraldLeggings) || (stack.getItem() == ModItems.EmeraldBoots)) {
            return EssentialAdditions.MODID + ":textures/armor/" + getClass().getSimpleName() + "_2.png";
        }
        return null;
    }
}
