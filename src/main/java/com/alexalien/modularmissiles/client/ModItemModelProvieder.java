package com.alexalien.modularmissiles.client;

import com.alexalien.modularmissiles.common.Modularmissiles;

import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.loaders.OBJLoaderBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvieder extends ItemModelProvider {

	public ModItemModelProvieder(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Modularmissiles.MODID, existingFileHelper);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void registerModels() {


		ModelFile itemgenerated = getExistingFile(mcLoc("item/generated"));

		//ModelFile Missile = getExistingFile(new ResourceLocation(Modularmissiles.MODID, "models/missile1.obj"));
		//ModelFile Missile = getExistingFile(modLoc("models/missile1.obj"));

		//ResourceLocation location = new ResourceLocation(Modularmissiles.MODID, "models/missile1.obj");


		//OBJModel m = OBJLoader.INSTANCE.loadModel(new OBJModel.ModelSettings(new ResourceLocation(Modularmissiles.MODID, "models/missile1.obj"), false, false, false, false, ""));

		//ModelFile Missile = getExistingFile(m.modelLocation);

		//getBuilder("test_block").parent(Missile);

		//ModelFile Missile = getExistingFile(modLoc("models/missile1.obj"));


		withExistingParent("titanium_ore", modLoc("block/titanium_ore"));
		withExistingParent("bauxite_ore", modLoc("block/bauxite_ore"));
		withExistingParent("tungsten_ore", modLoc("block/tungsten_ore"));
		withExistingParent("compressed_stone", modLoc("block/compressed_stone"));


		//Unexploded Ordnance
		getBuilder("unexploded_ordnance").customLoader(OBJLoaderBuilder::begin).modelLocation(new ResourceLocation(Modularmissiles.MODID, "models/unexploded_ordnance.obj")).end();

		getBuilder("titanium_ingot").parent(itemgenerated).texture("layer0", "item/titanium_ingot");
		getBuilder("tungsten_ingot").parent(itemgenerated).texture("layer0", "item/titanium_ingot");
		getBuilder("aluminium_ingot").parent(itemgenerated).texture("layer0", "item/aluminium_ingot");


	}



}
