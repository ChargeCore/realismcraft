package com.realismcraft.mainclasses;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
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

	//@SubscribeEvent
//	public void onBlockBreak(BreakSpeed event){
		//if (event.block == Blocks.log)  {
		//	try
			//{
				//String axe = "axe";
				//if(event.entityPlayer.inventory.getCurrentItem().getItem()
						//.getHarvestLevel(event.entityPlayer.inventory.getCurrentItem(), axe) 
						//>= event.entityPlayer.inventory.getCurrentItem().getItem().getHarvestLevel(new ItemStack(null), axe))
				//{
					//event.newSpeed = event.originalSpeed;
			//	}
				//else
				//{
				//	event.newSpeed = -1;
				//}
			//}
			//catch(NullPointerException ex){
				//event.newSpeed = -1;
			//}
		//}
		
	//}

}
	

	

