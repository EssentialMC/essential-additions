/**
 * 
 */
package com.spikespaz.essentialadditions.items;

import java.text.MessageFormat;

import com.spikespaz.essentialadditions.EssentialAdditions;

import net.minecraft.item.ItemPickaxe;

/**
 * @author Perry Berman
 *
 */
public class BasePickaxe extends ItemPickaxe {

	public BasePickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(MessageFormat.format("{0}:{1}", new Object[] { EssentialAdditions.MODID, unlocalizedName }));
	}
}
