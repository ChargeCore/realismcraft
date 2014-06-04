package com.realismcraft.tools;
import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemSpade;

public class TinShovel extends ItemSpade{

	public TinShovel(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		
		setTextureName(RealismCraftMain.MODID + ":" + "tinShovel");
		setUnlocalizedName("tinShovel");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}

}
