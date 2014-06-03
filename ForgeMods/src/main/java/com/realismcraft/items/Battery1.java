package com.realismcraft.items;

import com.realismcraft.ElectricityAPI.Battery;
import com.realismcraft.registryhelper.RegistryHelper;

public class Battery1{

	

	public static void generateBattery(){
		com.realismcraft.ElectricityAPI.Battery Battery1 = new Battery(1, "Battery1", "battery1");
		RegistryHelper.registerItem(Battery1);
	}
	
	}



