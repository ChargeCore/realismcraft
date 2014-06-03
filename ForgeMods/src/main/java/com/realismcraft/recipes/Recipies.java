package com.realismcraft.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.realismcraft.mainclasses.RealismCraftMain;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipies {

	public static void loadRecipies(){
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.farmland, 1), Blocks.dirt, Items.stone_hoe);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.command_block), "X X", " Y ", "X X", 'X', Blocks.noteblock, 'Y', Items.redstone);
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_helmet), "XXX", "X X", 'X', RealismCraftMain.chainIngot);
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_chestplate), "X X", "XXX", "XXX", 'X', RealismCraftMain.chainIngot);
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_leggings), "XXX", "X X", "X X", 'X',RealismCraftMain.chainIngot);
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_boots), "   ", "X X", "X X", 'X', RealismCraftMain.chainIngot);
		GameRegistry.addShapedRecipe(new ItemStack(RealismCraftMain.chainIngot), "X X", " X ", "X X", 'X', Items.iron_ingot);
		GameRegistry.addShapedRecipe(new ItemStack(RealismCraftMain.BatteryEmpty), " X ", "XYX", "XYX", 'X', RealismCraftMain.tinIngot, 'Y', Items.redstone);
	}
}
