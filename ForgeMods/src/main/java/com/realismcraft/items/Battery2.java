package com.realismcraft.items;

import com.realismcraft.ElectricityAPI.Battery;
import com.realismcraft.registryhelper.RegistryHelper;

public class Battery2 {

	public static void generateBattery(){
		com.realismcraft.ElectricityAPI.Battery Battery2 = new Battery(2, "Battery2", "battery2");
		RegistryHelper.registerItem(Battery2);
	}
}
