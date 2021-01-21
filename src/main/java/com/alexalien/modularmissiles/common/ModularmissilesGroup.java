package com.alexalien.modularmissiles.common;

import com.alexalien.modularmissiles.common.blocks.ModularMissilesBlocks;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModularmissilesGroup extends ItemGroup {

	public ModularmissilesGroup(String name) {
		super(name);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ModularMissilesBlocks.UNEXPLODED_ORDANCE.get());
	}
	
	

	
	
}
