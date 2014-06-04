package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemHoe;



public class ZincHoe extends ItemHoe {

	public ZincHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		
		setTextureName(RealismCraftMain.MODID + ":" + "zincHoe");
		setUnlocalizedName("zincHoe");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}

}
