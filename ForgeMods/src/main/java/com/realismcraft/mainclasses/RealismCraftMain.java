package com.realismcraft.mainclasses;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import com.realismcraft.ElectricityAPI.Battery;
import com.realismcraft.items.*;
import com.realismcraft.blocks.*;
import com.realismcraft.ores.*;
import com.realismcraft.recipes.*;
import com.realismcraft.tools.*;
import com.realismcraft.proxy.ProxyCommon;
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
    
    
    //Tools
    
    //Aluminium Tools
    public static Item aluminiumAxe;
    public static Item aluminiumPickaxe;
    public static Item aluminiumHoe;
    public static Item aluminiumSword;
    public static Item aluminiumShovel;
    
    //Bronze Tools
    public static Item bronzeAxe;
    public static Item bronzePickaxe;
    public static Item bronzeHoe;
    public static Item bronzeSword;
    public static Item bronzeShovel;
    
    //StainlessSteel Tools
    public static Item stainlessSteelAxe;
    public static Item stainlessSteelPickaxe;
    public static Item stainlessSteelHoe;
    public static Item stainlessSteelSword;
    public static Item stainlessSteelShovel;
    
    //Steel Tools
    public static Item steelAxe;
    public static Item steelPickaxe;
    public static Item steelHoe;
    public static Item steelSword;
    public static Item steelShovel;
    
    //Tin Tools
    public static Item tinAxe;
    public static Item tinPickaxe;
    public static Item tinHoe;
    public static Item tinSword;
    public static Item tinShovel;
    
    //Zinc Tools
    public static Item zincAxe;
    public static Item zincPickaxe;
    public static Item zincHoe;
    public static Item zincSword;
    public static Item zincShovel;


    //Tiles
    public static Block aluminiumBlock;
    public static Block bronzeBlock;
    public static Block chromeBlock;
    public static Block copperBlock;
    public static Block leadBlock;
    public static Block magnesiumBlock;
    public static Block tinBlock;
    public static Block zincBlock;
    
    //Ores
    public static Block tinOre;
    public static Block leadOre;
    
    
    //Electrical Items
    public static Item BatteryEmpty;
    public static Item Battery1;
    public static Item Battery2;
    public static Item Battery3;
    
    //Plates
    public static Item chainPlate;
    public static Item bronzePlate;
    public static Item aluminiumPlate;
    
    //Ingots
    public static Item aluminiumIngot;
    public static Item bronzeIngot;
    public static Item chainIngot;
    public static Item chromeIngot;
    public static Item copperIngot;
    public static Item leadIngot;
    public static Item magnesiumIngot;
    public static Item tinIngot;
    public static Item zincIngot;
    
    //Materials
    public static ToolMaterial aluminiumMaterial;
    public static ToolMaterial bronzeMaterial;
    public static ToolMaterial chromeMaterial;
    public static ToolMaterial leadMaterial;
    public static ToolMaterial tinMaterial;
    public static ToolMaterial zincMaterial;
    
    
    @Instance(value = MODID)
    public static RealismCraftMain instance;
    
    @SidedProxy(clientSide = "com.realismcraft.proxy.ProxyClient", serverSide = "com.realismcraft.proxy.proxyCommon")
    public static ProxyCommon proxy;
	
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent){  	
    	registerIngots();
    	registerTiles();
    	registerOres();
    	registerTools();
    	registerPlates();
    	
    	GameRegistry.registerTileEntity(TileEntityAnvil.class, "anvil");
    	
    	//Battery Empty
    	BatteryEmpty = new BatteryEmpty().setTextureName(MODID + ":" + "batteryEmpty");
    	RegistryHelper.registerItem(BatteryEmpty);
    	
    	Battery.generateBatteries();
    	
    	MinecraftForge.EVENT_BUS.register(new RCEventHandler());
    	
    }
    
    public void registerTiles(){
       	//BronzeBlock
    	bronzeBlock = new BronzeBlock(Material.rock);
    	RegistryHelper.registerBlock(bronzeBlock);
    	
       	//AluminiumBlock
    	aluminiumBlock = new AluminiumBlock(Material.rock);
    	RegistryHelper.registerBlock(aluminiumBlock);
    	
       	//Copper Block
    	copperBlock = new CopperBlock(Material.rock);
    	RegistryHelper.registerBlock(copperBlock);
    	
    	//Zinc Block
    	zincBlock = new ZincBlock(Material.rock);
    	RegistryHelper.registerBlock(zincBlock);
    	
    	//Tin Block
    	tinBlock = new TinBlock(Material.rock);
    	RegistryHelper.registerBlock(tinBlock);
    	
    	//Lead Block
    	leadBlock = new LeadBlock(Material.rock);
    	RegistryHelper.registerBlock(leadBlock);
    	
    	//Chrome Block
    	chromeBlock = new ChromeBlock(Material.rock);
    	RegistryHelper.registerBlock(chromeBlock);
    	
    	//Magnesium Block
    	magnesiumBlock = new MagnesiumBlock(Material.rock);
    	RegistryHelper.registerBlock(magnesiumBlock);
    }
    
    public void registerOres(){
    	//Tin Ore
    	tinOre = new TinOre().setBlockName("TinOre");
    	RegistryHelper.registerBlock(tinOre);
    	
    	//Lead Ore
    	leadOre = new LeadOre().setBlockName("LeadOre");
    	RegistryHelper.registerBlock(leadOre);
    }
    
    
    public void registerIngots(){
    	//Tin Ingot
    	tinIngot = new TinIngot().setTextureName(MODID + ":" + "tinIngot");
    	RegistryHelper.registerItem(tinIngot);

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
    	
    	//Chrome Ingot
    	chromeIngot = new ChromeIngot().setTextureName(MODID + ":" + "chromeIngot");
    	RegistryHelper.registerItem(chromeIngot);
    	
    	//Copper Ingot
    	copperIngot = new CopperIngot().setTextureName(MODID + ":" + "copperIngot");
    	RegistryHelper.registerItem(copperIngot);
    	
    	//Chain Ingot
    	chainIngot = new ChainIngot().setTextureName(MODID + ":" + "chainIngot");
    	RegistryHelper.registerItem(chainIngot);
    }
    
    
    public void registerTools(){
    	aluminiumMaterial = EnumHelper.addToolMaterial("aluminiumMaterial", 2, 10, 1.0F, 10.0F, 1);
    	bronzeMaterial = EnumHelper.addToolMaterial("bronzeMaterial", 2, 10, 4.0F, 10.0F, 1);
    	zincMaterial = EnumHelper.addToolMaterial("zincMaterial", 2, 10, 10.0F, 10.0F, 1);
    	tinMaterial = EnumHelper.addToolMaterial("tinMaterial", 2, 10, 25.0F, 10.0F, 1);
    	tinMaterial = EnumHelper.addToolMaterial("tinMaterial", 2, 10, 25.0F, 10.0F, 1);
    	
    	//Aluminium Tools
    	aluminiumAxe = new AluminiumAxe(aluminiumMaterial);
    	GameRegistry.registerItem(aluminiumAxe, "aluminiumAxe");
    	
    	aluminiumPickaxe = new AluminiumPickaxe(aluminiumMaterial);
    	GameRegistry.registerItem(aluminiumPickaxe, "aluminiumPickaxe");
    	
    	aluminiumHoe = new AluminiumHoe(aluminiumMaterial);
    	GameRegistry.registerItem(aluminiumHoe, "aluminiumHoe");
    	
    	aluminiumSword = new AluminiumSword(aluminiumMaterial);
    	GameRegistry.registerItem(aluminiumSword, "aluminiumSword");
    	    	
    	aluminiumShovel= new AluminiumShovel(aluminiumMaterial);
    	GameRegistry.registerItem(aluminiumShovel, "aluminiumShovel");
    	
    	//Bronze Tools
    	bronzeAxe = new BronzeAxe(bronzeMaterial);
    	GameRegistry.registerItem(bronzeAxe, "bronzeAxe");
    	
    	bronzePickaxe = new BronzePickaxe(bronzeMaterial);
    	GameRegistry.registerItem(bronzePickaxe, "bronzePickaxe");
    	
    	bronzeHoe = new BronzeHoe(bronzeMaterial);
    	GameRegistry.registerItem(bronzeHoe, "bronzeHoe");
    	
    	bronzeSword = new BronzeSword(bronzeMaterial);
    	GameRegistry.registerItem(bronzeSword, "bronzeSword");
    	    	
    	bronzeShovel= new BronzeShovel(bronzeMaterial);
    	GameRegistry.registerItem(bronzeShovel, "bronzeShovel");
    	
    	//Tin Tools
    	tinAxe = new TinAxe(tinMaterial);
    	GameRegistry.registerItem(tinAxe, "tinAxe");
    	
    	tinPickaxe = new TinPickaxe(tinMaterial);
    	GameRegistry.registerItem(tinPickaxe, "tinPickaxe");
    	
    	tinHoe = new TinHoe(tinMaterial);
    	GameRegistry.registerItem(tinHoe, "tinHoe");
    	
    	tinSword = new TinSword(tinMaterial);
    	GameRegistry.registerItem(tinSword, "tinSword");
    	    	
    	tinShovel= new TinShovel(tinMaterial);
    	GameRegistry.registerItem(tinShovel, "tinShovel");
    	
    	//Zinc Tools
    	zincAxe = new ZincAxe(zincMaterial);
    	GameRegistry.registerItem(zincAxe, "zincAxe");
    	
    	zincPickaxe = new ZincPickaxe(zincMaterial);
    	GameRegistry.registerItem(zincPickaxe, "zincPickaxe");
    	
    	zincHoe = new ZincHoe(zincMaterial);
    	GameRegistry.registerItem(zincHoe, "zincHoe");
    	
    	zincSword = new ZincSword(zincMaterial);
    	GameRegistry.registerItem(zincSword, "zincSword");
    	    	
    	zincShovel= new ZincShovel(zincMaterial);
    	GameRegistry.registerItem(zincShovel, "zincShovel");
    	
    }
    
    public void registerMaterials(){
    	
    }
    
    public void registerPlates(){
    	//Chain Plate
    	chainPlate = new ChainPlate().setTextureName(MODID + ":" + "chainPlate");
    	RegistryHelper.registerItem(chainPlate); 
    }
    
    
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Recipies.loadRecipies();
    	Blocks.log.setHarvestLevel("axe", 1);
    	Blocks.log2.setHarvestLevel("axe", 1);
    }
}