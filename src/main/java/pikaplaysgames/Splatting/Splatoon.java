package pikaplaysgames.Splatting;

import net.fabricmc.api.ModInitializer;
import pikaplaysgames.Splatting.block.ModBlocks;
import pikaplaysgames.Splatting.item.ModItemGroup;
import pikaplaysgames.Splatting.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Splatoon implements ModInitializer {
	public static final String MOD_ID = "splatoon";
	public static final Logger LOGGER = LoggerFactory.getLogger("splatoon");

	@Override
	public void onInitialize() {
	
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}