package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemHoe;

public class AluminiumHoe extends ItemHoe{

	public AluminiumHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		
		setTextureName(RealismCraftMain.MODID + ":" + "aluminiumHoe");
		setUnlocalizedName("aluminiumHoe");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}

}
