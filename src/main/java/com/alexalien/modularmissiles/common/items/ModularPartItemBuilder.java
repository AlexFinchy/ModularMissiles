package com.alexalien.modularmissiles.common.items;

import com.alexalien.modularmissiles.common.Modularmissiles;
import com.alexalien.modularmissiles.common.ModularmissilesGroup;
import net.minecraft.item.Item;

public class ModularPartItemBuilder {

    public static ModularPart createModularItem() {

        Item.Properties properties = new Item.Properties();

        properties.group(Modularmissiles.ModularModularGroup);

        ModularPart modularPart = new ModularPart(new Item.Properties());
        return modularPart;

    }


}
