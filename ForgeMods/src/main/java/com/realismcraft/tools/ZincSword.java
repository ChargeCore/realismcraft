package com.realismcraft.tools;

import net.minecraft.item.ItemSword;

import com.realismcraft.mainclasses.RealismCraftMain;

public class ZincSword extends ItemSword {

	public ZincSword(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		
		setTextureName(RealismCraftMain.MODID + ":" + "zincSword");
		setUnlocalizedName("zincSword");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
		
	}

	
}