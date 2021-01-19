package com.alexalien.modularmissiles.common.world.generation;

import com.alexalien.modularmissiles.common.blocks.Blocks;
import net.minecraft.block.Block;

public class Ores {

    public static void registerOres() {

       /* overworldOres.add(register("titanium_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.TITANIUM_ORE.get().getDefaultState(), 8)) //Vein
                .range(64).square() //Range
                .func_242731_b(64))); //Amount per chunk
        */

        ModularOreUtils.registerOreGen(Blocks.TITANIUM_ORE.get(), OreDimension.OVERWORLD, 6, 30,  8);

        ModularOreUtils.registerOreGen(Blocks.BAUXITE_ORE.get(), OreDimension.OVERWORLD, 8, 40, 10);

        ModularOreUtils.registerOreGen(Blocks.TUNGSTEN_ORE.get(), OreDimension.OVERWORLD, 6, 30, 8);

        ModularOreUtils.registerOreGen(Blocks.UNEXPLODED_ORDANCE.get(), OreDimension.OVERWORLD, 1, 60, 10);
        //TODO needs custom NBT data and its own generation class
    }
}
