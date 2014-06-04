package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemPickaxe;

public class TinPickaxe extends ItemPickaxe{

	public TinPickaxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		setTextureName(RealismCraftMain.MODID + ":" + "tinPickaxe");
		setUnlocalizedName("tinPickaxe");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}

}
