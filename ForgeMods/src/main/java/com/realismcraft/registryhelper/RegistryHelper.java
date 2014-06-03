package com.realismcraft.registryhelper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.realismcraft.mainclasses.RealismCraftMain;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegistryHelper {

	public static void registerItem(Item item){
		GameRegistry.registerItem(item, RealismCraftMain.MODID + "_" + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerBlock(Block block){
		GameRegistry.registerBlock(block, RealismCraftMain.MODID + "_" + block.getUnlocalizedName().substring(5));
	}
}
