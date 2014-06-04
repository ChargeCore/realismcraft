package com.realismcraft.tools;

import net.minecraft.item.ItemHoe;

import com.realismcraft.mainclasses.RealismCraftMain;

public class TinHoe extends ItemHoe{
	public TinHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		setTextureName(RealismCraftMain.MODID + ":" + "tinHoe");
		setUnlocalizedName("tinHoe");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}
}
