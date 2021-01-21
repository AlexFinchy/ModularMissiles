package com.alexalien.modularmissiles.client;

import com.alexalien.modularmissiles.common.Modularmissiles;
import com.alexalien.modularmissiles.common.blocks.ModularMissilesBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
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

        simpleBlock(ModularMissilesBlocks.UNEXPLODED_ORDANCE.get(), models().getBuilder("unexploded_ordnance").customLoader(OBJLoaderBuilder::begin).modelLocation(new ResourceLocation(Modularmissiles.MODID, "models/unexploded_ordnance.obj")).ambientToFullbright(true).flipV(true).end());
        //simpleBlock(Blocks.UNEXPLODED_ORDANCE.get(), modelFile -> new ResourceLocation(Modularmissiles.MODID, "models/model"));

        //simpleBlock(Blocks.TEST_BLOCK.get(), models().getBuilder("test_block").customLoader(OBJLoaderBuilder::begin).modelLocation(new ResourceLocation(Modularmissiles.MODID, "models/small.obj")).end());

        //ORES
        simpleBlock(ModularMissilesBlocks.TITANIUM_ORE.get());
        simpleBlock(ModularMissilesBlocks.BAUXITE_ORE.get());
        simpleBlock(ModularMissilesBlocks.TUNGSTEN_ORE.get());


        //MATERIAL WORLD BLOCKS
        simpleBlock(ModularMissilesBlocks.COMPRESSED_STONE.get());


        //sampleBlock(Blocks.TEST_BLOCK.get()), models().getBuilder("test_block").customLoader();
    }
}
