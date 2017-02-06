package com.spikespaz.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class EmeraldArmor extends ItemArmor
{
  public EmeraldArmor(ItemArmor.ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_)
  {
    super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
  }

  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
  {
    if ((stack.getItem() == ModItems.EmeraldHelmet) || (stack.getItem() == ModItems.EmeraldChestplate) || (stack.getItem() == ModItems.EmeraldBoots))
      return "essentialadditions:textures/armor/emerald_layer_1.png";
    if ((stack.getItem() == ModItems.EmeraldLeggings) || (stack.getItem() == ModItems.EmeraldBoots)) {
      return "essentialadditions:textures/armor/emerald_layer_2.png";
    }
    return null;
  }
}


/* Location:              C:\Users\spike\Desktop\EssentialAdditions_1.2.8-1.7.10-deobf.jar!\com\spikespaz\items\EmeraldArmor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */