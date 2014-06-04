package com.realismcraft.tools;

import net.minecraft.item.ItemSword;

import com.realismcraft.mainclasses.RealismCraftMain;

public class AluminiumSword extends ItemSword {

	public AluminiumSword(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		
		setTextureName(RealismCraftMain.MODID + ":" + "aluminiumSword");
		setUnlocalizedName("aluminiumSword");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
		
	}

	
}