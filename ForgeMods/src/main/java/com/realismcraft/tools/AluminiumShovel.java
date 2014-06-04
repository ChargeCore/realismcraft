package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemSpade;

public class AluminiumShovel extends ItemSpade {

	public AluminiumShovel(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		
		
		setTextureName(RealismCraftMain.MODID + ":" + "aluminiumShovel");
		setUnlocalizedName("aluminiumShovel");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}

}
