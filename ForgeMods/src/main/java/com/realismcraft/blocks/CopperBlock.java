package com.realismcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.realismcraft.mainclasses.RealismCraftMain;

public class CopperBlock extends Block{
	public CopperBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		setCreativeTab(RealismCraftMain.CreativeTabBlocks);
		setHardness(5F);
		setResistance(7.0F);
		setBlockName("copperBlock");
		setBlockTextureName(RealismCraftMain.MODID + ":" + "copperBlock");
	}
}
