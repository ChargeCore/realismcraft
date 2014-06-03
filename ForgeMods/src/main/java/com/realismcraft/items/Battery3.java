package com.realismcraft.items;

import com.realismcraft.ElectricityAPI.Battery;
import com.realismcraft.registryhelper.RegistryHelper;

public class Battery3 {

	public static void generateBattery(){
		com.realismcraft.ElectricityAPI.Battery Battery3 = new Battery(3, "Battery3", "battery3");
		RegistryHelper.registerItem(Battery3);
	}
}
