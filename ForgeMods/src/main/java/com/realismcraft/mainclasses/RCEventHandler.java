package com.realismcraft.mainclasses;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;


public class RCEventHandler {

	@SubscribeEvent
	public void onBlockHarvest(HarvestDropsEvent event) {
	
			if (event.block == Blocks.gold_ore) {
				event.drops.clear();
				event.drops.add(new ItemStack(Items.gold_nugget, 8));
	
		}
	}
}
	

	
	//@SubscribeEvent
	//public void onBreakSpeed(BreakSpeed event){
		//event.newSpeed = -1;
	
	
//}

