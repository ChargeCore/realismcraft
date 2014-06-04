package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemSword;

public class TinSword extends ItemSword{

	public TinSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		setTextureName(RealismCraftMain.MODID + ":" + "tinSword");
		setUnlocalizedName("tinSword");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}

}
