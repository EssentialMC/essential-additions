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
        if ((stack.getItem() == ModItems.ObsidianHelmet) || (stack.getItem() == ModItems.ObsidianChestplate) || (stack.getItem() == ModItems.ObsidianBoots))
            return EssentialAdditions.MODID + ":textures/armor/obsidian_layer_1.png";
        if ((stack.getItem() == ModItems.ObsidianLeggings) || (stack.getItem() == ModItems.ObsidianBoots)) {
            return EssentialAdditions.MODID + ":textures/armor/obsidian_layer_2.png";
        }
        return null;
    }
}
