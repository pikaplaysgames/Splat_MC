package pikaplaysgames.Splatting.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pikaplaysgames.Splatting.Splatoon;
import pikaplaysgames.Splatting.block.custom.SpawnStationBlock;
import pikaplaysgames.Splatting.item.ModItemGroup;

public class ModBlocks {

    public static final Block SPAWNINGBLOCK = registerBlock("spawn_point", new SpawnStationBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()), ModItemGroup.SHOOTER);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Splatoon.MOD_ID, name), block);
    }

    
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {

        Item item = Registry.register(Registries.ITEM, new Identifier(Splatoon.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        // Register your blocks here
    }

}