package com.spikespaz.essentialadditions.items;

import net.minecraft.item.ItemArmor;

public class RubyArmor extends ItemArmor {
    RubyArmor(ItemArmor.ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
    }
/*
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if ((stack.getItem() == ModItems.emerald_helmet) || (stack.getItem() == ModItems.emerald_chestplate) || (stack.getItem() == ModItems.emerald_boots))
            return EssentialAdditions.MODID + ":textures/armor/" + getClass().getSimpleName() + "_1.png";
        if ((stack.getItem() == ModItems.emerald_leggings) || (stack.getItem() == ModItems.emerald_boots)) {
            return EssentialAdditions.MODID + ":textures/armor/" + getClass().getSimpleName() + "_2.png";
        }
        return null;
    }*/
}

