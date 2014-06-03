package com.realismcraft.mainclasses;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabItems extends CreativeTabs{

	public CreativeTabItems(int par1, String par25tr) {
		super(par1, par25tr);
		
	}

	@Override
	public Item getTabIconItem() {
		
		return RealismCraftMain.BatteryEmpty;
	}

}
