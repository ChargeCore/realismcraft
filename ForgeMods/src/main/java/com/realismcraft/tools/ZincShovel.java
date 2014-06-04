package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemSpade;

public class ZincShovel extends ItemSpade {

	public ZincShovel(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		
		
		setTextureName(RealismCraftMain.MODID + ":" + "zincShovel");
		setUnlocalizedName("zincShovel");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}

}
