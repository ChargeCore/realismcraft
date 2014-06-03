package com.realismcraft.mainclasses;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import com.realismcraft.ElectricityAPI.Battery;
import com.realismcraft.blocks.BlockAnvil;
import com.realismcraft.blocks.BronzeBlock;
import com.realismcraft.blocks.TileEntityAnvil;
import com.realismcraft.items.AluminiumIngot;
import com.realismcraft.items.BatteryEmpty;
import com.realismcraft.items.BronzeIngot;
import com.realismcraft.items.ChainIngot;
import com.realismcraft.items.ChainPlate;
import com.realismcraft.items.LeadIngot;
import com.realismcraft.items.MagnesiumIngot;
import com.realismcraft.items.TinIngot;
import com.realismcraft.items.ZincIngot;
import com.realismcraft.ores.LeadOre;
import com.realismcraft.ores.TinOre;
import com.realismcraft.proxy.ProxyCommon;
import com.realismcraft.recipes.Recipies;
import com.realismcraft.registryhelper.RegistryHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = RealismCraftMain.MODID, version = RealismCraftMain.VERSION)
public class RealismCraftMain
{
    public static final String MODID = "realismcraft";
    public static final String VERSION = "Alpha 1.0";
    
    public static CreativeTabs CreativeTabBlocks = new CreativeTabBlocks(CreativeTabs.getNextID(), "RealismCraftBlocks");
    public static CreativeTabs CreativeTabItems = new CreativeTabItems(CreativeTabs.getNextID(), "RealismCraftItems");
    
    
    
    
    //Blocks
    public static Block bronzeBlock;
    public static Block tinOre;
    public static Block leadOre;
    public static Block anvil;
    
    
    //Items
    public static Item chainIngot;
    public static Item chainPlate;
    public static Item tinIngot;
    public static Item BatteryEmpty;
    public static Item Battery1;
    public static Item Battery2;
    public static Item Battery3;
    public static Item aluminiumIngot;
    public static Item magnesiumIngot;
    public static Item leadIngot;
    public static Item bronzeIngot;
    public static Item zincIngot;
    
    @Instance(value = MODID)
    public static RealismCraftMain instance;
    
    @SidedProxy(clientSide = "com.snipez.proxy.ProxyClient", serverSide = "com.snipez.proxy.proxyCommon")
    public static ProxyCommon proxy;
	
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent){
    	//Anvil
    	//anvil = new BlockAnvil(Material.rock).setBlockName("anvil");
    	RegistryHelper.registerBlock(anvil);
    	
    	
    	//Chain Ingot
    	chainIngot = new ChainIngot().setTextureName(MODID + ":" + "chainIngot");
    	RegistryHelper.registerItem(chainIngot);
    	
    	//Chain Plate
    	chainPlate = new ChainPlate().setTextureName(MODID + ":" + "chainPlate");
    	RegistryHelper.registerItem(chainPlate);
    	
    	//Tin Ingot
    	tinIngot = new TinIngot().setTextureName(MODID + ":" + "tinIngot");
    	RegistryHelper.registerItem(tinIngot);
    	
    	//Battery Empty
    	BatteryEmpty = new BatteryEmpty().setTextureName(MODID + ":" + "batteryEmpty");
    	RegistryHelper.registerItem(BatteryEmpty);
    	
    	//Aluminium Ingot
    	aluminiumIngot = new AluminiumIngot().setTextureName(MODID + ":" + "aluminiumIngot");
    	RegistryHelper.registerItem(aluminiumIngot);
    	
    	//Magnesium Ingot
    	magnesiumIngot = new MagnesiumIngot().setTextureName(MODID + ":" + "magnesiumIngot");
    	RegistryHelper.registerItem(magnesiumIngot);
    	
    	//Bronze Ingot
    	bronzeIngot = new BronzeIngot().setTextureName(MODID + ":" + "bronzeIngot");
    	RegistryHelper.registerItem(bronzeIngot);
    	
    	//Lead Ingot
    	leadIngot = new LeadIngot().setTextureName(MODID + ":" + "leadIngot");
    	RegistryHelper.registerItem(leadIngot);
    
    	//Zinc Ingot
    	zincIngot = new ZincIngot().setTextureName(MODID + ":" + "zincIngot");
    	RegistryHelper.registerItem(zincIngot);
    	
    	
    	//BronzeBlock
    	bronzeBlock = new BronzeBlock(Material.rock).setBlockName("BronzeBlock");
    	RegistryHelper.registerBlock(bronzeBlock);
    	
    	
    	
    	//Tin Ore
    	tinOre = new TinOre().setBlockName("TinOre");
    	RegistryHelper.registerBlock(tinOre);
    	
    	//Lead Ore
    	leadOre = new LeadOre().setBlockName("LeadOre");
    	RegistryHelper.registerBlock(leadOre);
    	
    	
    	
    	
    	
    	Battery.generateBatteries();
    	
    	MinecraftForge.EVENT_BUS.register(new RCEventHandler());
    	
    }
    
    
    
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Recipies.loadRecipies();
    	
    	
    	GameRegistry.registerTileEntity(TileEntityAnvil.class, "anvil");
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event){
    	proxy.registerRenderers();
    }
}

