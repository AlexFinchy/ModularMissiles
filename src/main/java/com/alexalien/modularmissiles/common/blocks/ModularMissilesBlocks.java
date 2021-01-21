package com.alexalien.modularmissiles.common.blocks;

import com.alexalien.modularmissiles.common.Modularmissiles;
import com.alexalien.modularmissiles.common.items.ModularMissilesItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModularMissilesBlocks {




    public static final DeferredRegister<Block> BLOCKSREGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Modularmissiles.MODID);

    public static final RegistryObject<Block> TEST_BLOCK = register("test_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(5,5).harvestLevel(3)));

    //ORE BLOCKS

    public static final RegistryObject<Block> TITANIUM_ORE = register("titanium_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1,1).harvestLevel(2)));

    public static final RegistryObject<Block> BAUXITE_ORE = register("bauxite_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1,1).harvestLevel(2)));

    public static final RegistryObject<Block> TUNGSTEN_ORE = register("tungsten_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1,1).harvestLevel(2)));

    //MATERIAL BLOCKS

    public static final RegistryObject<Block> COMPRESSED_STONE = register("compressed_stone", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1,1).harvestLevel(1)));



    //OTHER

    public static final RegistryObject<Block> UNEXPLODED_ORDANCE = register("unexploded_ordnance", () -> new Block(AbstractBlock.Properties.create(Material.TNT).hardnessAndResistance(10,10).harvestLevel(2)));
    //TODO Rewrite as custom object

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return BLOCKSREGISTRY.register(name,block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {

        RegistryObject<T> ret = registerNoItem(name,block);
        ModularMissilesItems.ITEMSREGISTRY.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(Modularmissiles.ModularDefaultGroup)));
        return ret;
    }





}
