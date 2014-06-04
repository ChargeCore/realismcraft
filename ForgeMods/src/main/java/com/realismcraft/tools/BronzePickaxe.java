package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemPickaxe;

public class BronzePickaxe extends ItemPickaxe{

	public BronzePickaxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		
		setTextureName(RealismCraftMain.MODID + ":" + "bronzePickaxe");
		setUnlocalizedName("bronzePickaxe");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}
}
