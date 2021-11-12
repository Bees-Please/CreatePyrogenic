package com.beesplease.createpyrogenic.block;

import com.beesplease.createpyrogenic.CreatePyrogenic;
import com.beesplease.createpyrogenic.item.ModItemGroup;
import com.beesplease.createpyrogenic.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CreatePyrogenic.MOD_ID);

    //Harvest level: 0=wood, 4=netherite
    public static final RegistryObject<Block> BORAX_ORE = registerBlock("borax_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)));

    //This is a generic
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.CREATE_PYROGENIC_GROUP)));
    }
    //
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
