package com.alexalien.modularmissiles.common.world.generation;


import com.alexalien.modularmissiles.common.Modularmissiles;
import com.alexalien.modularmissiles.common.blocks.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class OreGeneration {


    public static final ArrayList<ConfiguredFeature<?,?>> overworldOres = new ArrayList<ConfiguredFeature<?,?>>();

    public static final ArrayList<ConfiguredFeature<?,?>> netherOres = new ArrayList<ConfiguredFeature<?,?>>();

    public static final ArrayList<ConfiguredFeature<?,?>> endOres = new ArrayList<ConfiguredFeature<?,?>>();




    public static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, name, configuredFeature);
    }


    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void gen(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        for(ConfiguredFeature<?,?> ore :overworldOres) {
            if(ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
        }
    }



}
