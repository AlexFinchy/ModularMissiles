package com.alexalien.modularmissiles.common.world.generation;

import com.alexalien.modularmissiles.common.blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModularOreUtils {


    public static void registerOreGen(Block OreBlock, OreDimension OreDimension, int maxVein, int minHeight, int chunkDensity) {

        switch(OreDimension) {
            case END:

                break;

            case NETHER:

                break;
            case OVERWORLD:
                OreGeneration.overworldOres.add(OreGeneration.register(OreBlock.getRegistryName().toString(),
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                                OreBlock.getDefaultState(), 8)).range(minHeight).square().func_242731_b(chunkDensity)));
                break;
        }


    }



}

enum OreDimension {
    OVERWORLD,
    END,
    NETHER,
}