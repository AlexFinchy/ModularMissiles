package com.alexalien.modularmissiles.common;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;

public class ModTags {




    public static final class Blocks {
        public static final ITag.INamedTag<Block> ORES_TITANIUM = forge("ores/titanium");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation(Modularmissiles.MODID, path).toString());
        }

    }

    public static final class Items {

    }

}
