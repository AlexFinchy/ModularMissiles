package com.alexalien.modularmissiles.common.items;

import com.alexalien.modularmissiles.common.Modularmissiles;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModularMissilesItems {

	public static final DeferredRegister<Item> ITEMSREGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Modularmissiles.MODID);
	
	//Ingot

	
	public static final RegistryObject<Item> TITANIUM_INGOT = ITEMSREGISTRY.register("titanium_ingot", () -> new Item(new Item.Properties().group(Modularmissiles.ModularDefaultGroup)));
	
	public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMSREGISTRY.register("aluminium_ingot", () -> new Item(new Item.Properties().group(Modularmissiles.ModularDefaultGroup)));

	public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMSREGISTRY.register("tungsten_ingot", () -> new Item(new Item.Properties().group(Modularmissiles.ModularDefaultGroup)));

	//Modular Missile Parts

	public static final RegistryObject<Item> MISSILE_FIN = ITEMSREGISTRY.register("missile_fin", () -> ModularPartItemBuilder.createModularItem());

	public static final RegistryObject<Item> MISSILE_HULL = ITEMSREGISTRY.register("missile_hull", () -> ModularPartItemBuilder.createModularItem());

	//Misile

	public static final RegistryObject<Item> MISSILE = ITEMSREGISTRY.register("missile", () -> ModularPartItemBuilder.createModularItem());




	//MATERIALS are all items that are not used in anything but crafting nothing happens with them when used not a tool just a crafting resource 
	
	/*
	   private static final DeferredRegister ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
	   private static final DeferredRegister BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

	   public static final RegistryObject ROCK_BLOCK = BLOCKS.register("rock", () -> new Block(Block.Properties.create(Material.ROCK)));
	   public static final RegistryObject ROCK_ITEM = ITEMS.register("rock", () -> new BlockItem(ROCK_BLOCK.get(), new Item.Properties().group(ItemGroup.MISC)));

	   public ExampleMod() {
	       ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	       BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	   }
	*/
	
	
	
	
	public ModularMissilesItems() {
		
		
		
	}
	
	
	
}
