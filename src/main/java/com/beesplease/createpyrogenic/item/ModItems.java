package com.beesplease.createpyrogenic.item;


import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.beesplease.createpyrogenic.CreatePyrogenic;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreatePyrogenic.MOD_ID);

    //@param: name <string> following conventions, supplier for type Item using item properties
    public static final RegistryObject<Item> BORAX = ITEMS.register("borax",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CREATE_PYROGENIC_GROUP)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }





}
