package com.realismcraft.tools;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.ItemPickaxe;

public class AluminiumPickaxe extends ItemPickaxe{

	public AluminiumPickaxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		
		setTextureName(RealismCraftMain.MODID + ":" + "aluminiumPickaxe");
		setUnlocalizedName("aluminiumPickaxe");
		setCreativeTab(RealismCraftMain.CreativeTabItems);
	}
}
