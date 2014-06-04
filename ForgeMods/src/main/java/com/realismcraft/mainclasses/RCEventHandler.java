package com.realismcraft.mainclasses;

import java.util.Random;

import scala.Console;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;


public class RCEventHandler {

	
	public static boolean getStickChance(){
		Random x = new Random();
		boolean chance = x.nextBoolean();
		return chance;
	}
	
	@SubscribeEvent
	public void onBlockHarvest(HarvestDropsEvent event) {
	
			if (event.block == Blocks.gold_ore) {
				event.drops.clear();
				event.drops.add(new ItemStack(Items.gold_nugget, 8));
	
			}	
			
			
			
			if (event.block == Blocks.leaves) {
				getStickChance();
				if(getStickChance()){
				event.drops.clear();
				event.drops.add(new ItemStack(Items.stick, 1));
				}
	
			}	
	}
	

	
	@SubscribeEvent
	public void BlockBreakTweeks(BreakSpeed event)
	{
		if (event.block == Blocks.log)  {
			try
			{
				String toolClass = event.block.getHarvestTool(0);
				if(event.block.getHarvestLevel(0) <= event.entityPlayer.inventory.getCurrentItem().getItem().getHarvestLevel(event.entityPlayer.inventory.getCurrentItem(), toolClass)){
					event.newSpeed = event.originalSpeed;
				}
				else
				{
					event.newSpeed = -1;
					Console.println("Didn't break block. Block Harvest Level: " + event.block.getHarvestLevel(0) + "   Tool Harvest Level: " + event.entityPlayer.inventory.getCurrentItem().getItem().getHarvestLevel(event.entityPlayer.inventory.getCurrentItem(), toolClass));
				}
			}
			catch(NullPointerException ex){
				event.newSpeed = -1;
			}
		}
	}
	
}