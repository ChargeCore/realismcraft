package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemAxe;

public class BronzeAxe extends ItemAxe {

	public BronzeAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		
		setTextureName(RealismCraftMain.MODID + ":" + "bronzeAxe");
		setUnlocalizedName("bronzeAxe");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
		
	}

	
}
