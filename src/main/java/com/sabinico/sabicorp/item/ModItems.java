package com.sabinico.sabicorp.item;

import com.sabinico.sabicorp.SabicorpMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import com.sabinico.sabicorp.item.ModItemGroup;

public class ModItems {

    public static final Item SABINITA_INGOT = registerItem("sabinita_ingot", new Item(new FabricItemSettings().group(ModItemGroup.SABICORP)));
    public static final Item SABINITA_NUGGET = registerItem("sabinita_nugget", new Item(new FabricItemSettings().group(ModItemGroup.SABICORP)));
    public static final Item RAW_SABINITA = registerItem("raw_sabinita", new Item(new FabricItemSettings().group(ModItemGroup.SABICORP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SabicorpMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        SabicorpMod.LOGGER.info("Registering Mod Items for " + SabicorpMod.MOD_ID);
    }
}
