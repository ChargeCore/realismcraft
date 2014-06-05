package com.realismcraft.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import com.realismcraft.mainclasses.*;

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
		GameRegistry.addShapedRecipe(new ItemStack(RealismCraftMain.aluminiumBlock), "XXX", "XXX", "XXX", 'X', RealismCraftMain.aluminiumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(RealismCraftMain.bronzeBlock), "XXX", "XXX", "XXX", 'X', RealismCraftMain.bronzeIngot);
		GameRegistry.addShapedRecipe(new ItemStack(RealismCraftMain.copperBlock), "XXX", "XXX", "XXX", 'X', RealismCraftMain.copperIngot);
		GameRegistry.addShapedRecipe(new ItemStack(RealismCraftMain.chromeBlock), "XXX", "XXX", "XXX", 'X', RealismCraftMain.chromeIngot);
		GameRegistry.addShapedRecipe(new ItemStack(RealismCraftMain.leadBlock), "XXX", "XXX", "XXX", 'X', RealismCraftMain.leadIngot);
		GameRegistry.addShapedRecipe(new ItemStack(RealismCraftMain.magnesiumBlock), "XXX", "XXX", "XXX", 'X', RealismCraftMain.magnesiumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(RealismCraftMain.tinBlock), "XXX", "XXX", "XXX", 'X', RealismCraftMain.tinIngot);
		GameRegistry.addShapedRecipe(new ItemStack(RealismCraftMain.zincBlock), "XXX", "XXX", "XXX", 'X', RealismCraftMain.zincIngot);
		GameRegistry.addShapelessRecipe(new ItemStack(RealismCraftMain.aluminiumIngot, 9), RealismCraftMain.aluminiumBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(RealismCraftMain.bronzeIngot, 9), RealismCraftMain.bronzeBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(RealismCraftMain.copperIngot, 9), RealismCraftMain.copperBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(RealismCraftMain.chromeIngot, 9), RealismCraftMain.chromeBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(RealismCraftMain.leadIngot, 9), RealismCraftMain.leadBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(RealismCraftMain.magnesiumIngot, 9), RealismCraftMain.magnesiumBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(RealismCraftMain.tinIngot, 9), RealismCraftMain.tinBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(RealismCraftMain.zincIngot, 9), RealismCraftMain.zincBlock);
	}
}
