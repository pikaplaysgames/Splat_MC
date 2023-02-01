package pikaplaysgames.Splatting.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import pikaplaysgames.Splatting.Splatoon;

public class ModItemGroup {

    public static ItemGroup SHOOTER;
    public static ItemGroup SPLATOON_MISC;

    public static void registerItemGroups(){
        SHOOTER = FabricItemGroup.builder(new Identifier(Splatoon.MOD_ID, "shooter"))
                .displayName(Text.literal("Shooters"))
                .icon(() -> new ItemStack(ModItems.SPLATTERSHOT)).build();
    }

}
