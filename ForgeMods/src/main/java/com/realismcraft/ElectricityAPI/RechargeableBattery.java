package com.realismcraft.ElectricityAPI;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.item.Item;

public class RechargeableBattery extends Item{

	public RechargeableBattery(int Number, String iconName, String unlocalName){
		ElectricityHandler.getRechargeableMaxCapac(Number);
		setTextureName(RealismCraftMain.MODID + ":" + iconName);
		setMaxStackSize(64);
		setCreativeTab(RealismCraftMain.CreativeTabItems);
		setUnlocalizedName(unlocalName);
	}
}
