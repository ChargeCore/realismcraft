package com.realismcraft.tools;

import net.minecraft.item.ItemSword;

import com.realismcraft.mainclasses.RealismCraftMain;

public class BronzeSword extends ItemSword {

	public BronzeSword(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		
		setTextureName(RealismCraftMain.MODID + ":" + "bronzeSword");
		setUnlocalizedName("bronzeSword");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
		
	}

	
}