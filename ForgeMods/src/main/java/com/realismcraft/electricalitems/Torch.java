package com.realismcraft.electricalitems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Torch extends Item{

	public Torch(){
		this.setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("torch");
		
	}
}
