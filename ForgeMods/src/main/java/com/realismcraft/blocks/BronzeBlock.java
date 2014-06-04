package com.realismcraft.blocks;

import com.realismcraft.mainclasses.RealismCraftMain;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BronzeBlock extends Block{

	public BronzeBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		setCreativeTab(RealismCraftMain.CreativeTabBlocks);
		setHardness(5F);
		setResistance(7.0F);

		setBlockName("bronzeBlock");

		setBlockTextureName(RealismCraftMain.MODID + ":" + "bronzeBlock");
	}

}
