package com.realismcraft.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.realismcraft.mainclasses.RealismCraftMain;

public class TinOre extends Block {

	public TinOre(){
		super(Material.rock);
		setBlockName("tinOre");
		setBlockTextureName(RealismCraftMain.MODID + ":" + "tinOre");
		setCreativeTab(RealismCraftMain.CreativeTabBlocks);
		this.setStepSound(soundTypeStone);
		setHardness(3.0F);
		setResistance(5.0F);
		this.setHarvestLevel("pickaxe", 2);
	
	}

	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return RealismCraftMain.tinIngot;
		
	}

}
