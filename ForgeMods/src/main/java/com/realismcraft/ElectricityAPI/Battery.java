package com.realismcraft.ElectricityAPI;


import net.minecraft.item.Item;

import com.realismcraft.items.Battery1;
import com.realismcraft.items.Battery2;
import com.realismcraft.items.Battery3;
import com.realismcraft.mainclasses.RealismCraftMain;





public class Battery extends Item{

	
	
	public Battery(int Number, String unlocalName, String iconName){
		
		ElectricityHandler.getNormalMaxCapac(Number);
		setTextureName(RealismCraftMain.MODID + ":" + iconName);
		setMaxStackSize(64);
		setCreativeTab(RealismCraftMain.CreativeTabItems);
		setUnlocalizedName(unlocalName);
	
	}
	
	
	
	
	public static void generateBatteries(){
		
		Battery1.generateBattery();
		Battery2.generateBattery();
		Battery3.generateBattery();
	}
	
}
