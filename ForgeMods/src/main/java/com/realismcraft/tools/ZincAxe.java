package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemAxe;

public class ZincAxe extends ItemAxe {

	public ZincAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		
		setTextureName(RealismCraftMain.MODID + ":" + "zincAxe");
		setUnlocalizedName("zincAxe");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
		
	}

	
}
