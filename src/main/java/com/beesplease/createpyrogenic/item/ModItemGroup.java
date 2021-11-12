package com.beesplease.createpyrogenic.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup CREATE_PYROGENIC_GROUP = new ItemGroup("createpyrogenic") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BORAX.get());
        }
    };
}
