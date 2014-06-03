package com.realismcraft.items;

import net.minecraft.item.Item;

import com.realismcraft.mainclasses.RealismCraftMain;

public class BatteryEmpty extends Item{

	public BatteryEmpty(){
		super();
		setMaxStackSize(64);
		setCreativeTab(RealismCraftMain.CreativeTabItems);
		setUnlocalizedName("batteryEmpty");
		
		
	}
}