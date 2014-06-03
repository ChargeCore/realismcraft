package com.realismcraft.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockAnvil extends Container{

	public TileEntityAnvil anvil;
	
	public BlockAnvil(InventoryPlayer player, TileEntityAnvil anvil) {
		this.anvil = anvil;
		
		for(int i = 0; i<9; i++){
			this.addSlotToContainer(new Slot(player, i, 8+i*18, 162));
		}
		
		for(int i = 0; i<3; i++){
			for(int j = 0; j<9; j++){
				this.addSlotToContainer(new Slot(player, 9+ j+i*9, 8+j*18, 105+i*18));
			}
		}
	}

	public TileEntity createNewTileEntity(World var1, int var2){
		return new TileEntityAnvil();
	}
	
	public boolean canInteractWith(EntityPlayer arg0) {
		
		return true;
	}

}
