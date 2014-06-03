package com.realismcraft.mainclasses;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBlocks extends CreativeTabs{

	public CreativeTabBlocks(int par1, String par25tr) {
		super(par1, par25tr);
		
	}

	@Override
	public Item getTabIconItem() {
		
		return RealismCraftMain.tinIngot;
	}

}
