package com.alexalien.modularmissiles.common;

import com.alexalien.modularmissiles.client.ModBlockModelProvider;
import com.alexalien.modularmissiles.client.ModItemModelProvieder;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;


	
	@Mod.EventBusSubscriber(modid = Modularmissiles.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public final class DataGenertors {
		
		private DataGenertors() {}
		
		@SubscribeEvent
		public static void gatherData(GatherDataEvent event) {
			DataGenerator gen = event.getGenerator();
			ExistingFileHelper existingFileHelper =event.getExistingFileHelper();
			//gen.addProvider(new CustomModelProvieder(gen ,existingFileHelper));
			gen.addProvider(new ModBlockModelProvider(gen, existingFileHelper));
			gen.addProvider(new ModItemModelProvieder(gen, existingFileHelper));
			gen.addProvider(new ModBlockModelProvider(gen,existingFileHelper));
		}
		
		
		
}
