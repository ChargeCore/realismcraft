package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemAxe;

public class TinAxe extends ItemAxe{

	public TinAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		setTextureName(RealismCraftMain.MODID + ":" + "tinAxe");
		setUnlocalizedName("tinAxe");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}

}
