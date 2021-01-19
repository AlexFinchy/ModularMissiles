package com.alexalien.modularmissiles.client;

import com.alexalien.modularmissiles.common.Modularmissiles;
import com.alexalien.modularmissiles.common.blocks.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.loaders.OBJLoaderBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockModelProvider extends BlockStateProvider {


    public ModBlockModelProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Modularmissiles.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //getBuilder("test_block").customLoader(OBJLoaderBuilder::begin).modelLocation(new ResourceLocation(Modularmissiles.MODID, "models/holycross.obj")).end();

        //CUSTOM MODEL BLOCKS

        simpleBlock(Blocks.UNEXPLODED_ORDANCE.get(), models().getBuilder("unexploded_ordnance").customLoader(OBJLoaderBuilder::begin).modelLocation(new ResourceLocation(Modularmissiles.MODID, "models/unexploded_ordnance.obj")).end());
        //simpleBlock(Blocks.UNEXPLODED_ORDANCE.get(), modelFile -> new ResourceLocation(Modularmissiles.MODID, "models/model"));

        simpleBlock(Blocks.TEST_BLOCK.get(), models().getBuilder("test_block").customLoader(OBJLoaderBuilder::begin).modelLocation(new ResourceLocation(Modularmissiles.MODID, "models/holycross.obj")).end());

        //ORES

        simpleBlock(Blocks.TITANIUM_ORE.get());
        simpleBlock(Blocks.BAUXITE_ORE.get());
        simpleBlock(Blocks.TUNGSTEN_ORE.get());




        //sampleBlock(Blocks.TEST_BLOCK.get()), models().getBuilder("test_block").customLoader();
    }
}
