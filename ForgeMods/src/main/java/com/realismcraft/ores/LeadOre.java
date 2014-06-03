package com.realismcraft.ores;

	import java.util.Random;

	import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.realismcraft.mainclasses.RealismCraftMain;

	public class LeadOre extends Block {

		public LeadOre(){
			super(Material.rock);
			setBlockName("leadOre");
			setBlockTextureName(RealismCraftMain.MODID + ":" + "leadOre");
			setCreativeTab(RealismCraftMain.CreativeTabBlocks);
			this.setStepSound(soundTypeStone);
			setHardness(3.0F);
			setResistance(5.0F);
			this.setHarvestLevel("pickaxe", 2);
		
		}

		public Item getItemDropped(int metadata, Random rand, int fortune){
			return RealismCraftMain.leadIngot;
			
		}

	}
