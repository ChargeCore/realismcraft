package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemPickaxe;

public class ZincPickaxe extends ItemPickaxe{

	public ZincPickaxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		
		setTextureName(RealismCraftMain.MODID + ":" + "zincPickaxe");
		setUnlocalizedName("zincPickaxe");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}
}
