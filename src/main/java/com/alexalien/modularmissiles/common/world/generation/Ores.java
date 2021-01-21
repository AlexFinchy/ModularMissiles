package com.alexalien.modularmissiles.common.world.generation;

import com.alexalien.modularmissiles.common.blocks.ModularMissilesBlocks;

public class Ores {

    public static void registerOres() {

       /* overworldOres.add(register("titanium_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.TITANIUM_ORE.get().getDefaultState(), 8)) //Vein
                .range(64).square() //Range
                .func_242731_b(64))); //Amount per chunk
        */

        ModularOreUtils.registerOreGen(ModularMissilesBlocks.TITANIUM_ORE.get(), OreDimension.OVERWORLD, 6, 30,  8);

        ModularOreUtils.registerOreGen(ModularMissilesBlocks.BAUXITE_ORE.get(), OreDimension.OVERWORLD, 8, 40, 10);

        ModularOreUtils.registerOreGen(ModularMissilesBlocks.TUNGSTEN_ORE.get(), OreDimension.OVERWORLD, 6, 30, 8);

        ModularOreUtils.registerOreGen(ModularMissilesBlocks.UNEXPLODED_ORDANCE.get(), OreDimension.OVERWORLD, 2, 60, 64);
        //TODO needs custom NBT data and its own generation class
    }
}
