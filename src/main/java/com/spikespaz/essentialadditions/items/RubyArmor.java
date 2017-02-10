package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RubyArmor extends ItemArmor {
    RubyArmor(ItemArmor.ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if ((stack.getItem() == ModItems.RubyHelmet) || (stack.getItem() == ModItems.RubyChestplate) || (stack.getItem() == ModItems.RubyBoots))
            return EssentialAdditions.MODID + ":textures/armor/ruby_layer_1.png";
        if ((stack.getItem() == ModItems.RubyLeggings) || (stack.getItem() == ModItems.RubyBoots)) {
            return EssentialAdditions.MODID + ":textures/armor/ruby_layer_2.png";
        }
        return null;
    }
}
