package com.alexalien.modularmissiles.client;

import com.alexalien.modularmissiles.common.ModTags;
import com.alexalien.modularmissiles.common.Modularmissiles;
import com.alexalien.modularmissiles.common.blocks.ModularMissilesBlocks;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModBlockTagsProvieder extends BlockTagsProvider {
    public ModBlockTagsProvieder(DataGenerator generatorIn, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, Modularmissiles.MODID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ModTags.Blocks.ORES_TITANIUM).add(ModularMissilesBlocks.TITANIUM_ORE.get());


    }


}
