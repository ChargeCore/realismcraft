package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemSpade;

public class BronzeShovel extends ItemSpade {

	public BronzeShovel(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		
		
		setTextureName(RealismCraftMain.MODID + ":" + "bronzeShovel");
		setUnlocalizedName("bronzeShovel");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}

}
