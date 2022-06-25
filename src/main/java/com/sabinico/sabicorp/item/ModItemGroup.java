package com.sabinico.sabicorp.item;

import com.sabinico.sabicorp.SabicorpMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SABICORP = FabricItemGroupBuilder.build(new Identifier(SabicorpMod.MOD_ID, "sabicorp"),
            () -> new ItemStack(ModItems.SABINITA_INGOT));
}
