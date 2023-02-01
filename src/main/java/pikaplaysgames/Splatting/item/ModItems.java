package pikaplaysgames.Splatting.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pikaplaysgames.Splatting.Splatoon;

public class ModItems {

    public static final Item SPLATTERSHOT = registerItem("splattershot",
    new Item(new FabricItemSettings()));



    
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Splatoon.MOD_ID, name), item);      
    }
        
    public static void addItemstoGroup(){
        
        Splatoon.LOGGER.info("Adding Items to Item Group");
        addtoItemGroup(ModItemGroup.SHOOTER, SPLATTERSHOT);

    }

    public static void addtoItemGroup(ItemGroup group, Item item){

        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        Splatoon.LOGGER.info("Registering Mod Items");

        addItemstoGroup();
    }






}



