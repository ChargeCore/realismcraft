package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemAxe;

public class AluminiumAxe extends ItemAxe {

	public AluminiumAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		
		setTextureName(RealismCraftMain.MODID + ":" + "aluminiumAxe");
		setUnlocalizedName("aluminiumAxe");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
		
	}

	
}
