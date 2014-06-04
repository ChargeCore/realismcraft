package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemHoe;



public class BronzeHoe extends ItemHoe {

	public BronzeHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		
		setTextureName(RealismCraftMain.MODID + ":" + "bronzeHoe");
		setUnlocalizedName("bronzeHoe");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}

}
