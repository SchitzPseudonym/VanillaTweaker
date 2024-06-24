package com.bananapuppy.vanillatweaker;

import com.bananapuppy.vanillatweaker.registries.ModBlocks;
import com.bananapuppy.vanillatweaker.registries.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaTweaker implements ModInitializer {
	public static final String MOD_ID = "vanillatweaker";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing " + MOD_ID);

		LOGGER.info("Registering Blocks for " + MOD_ID);
		ModBlocks.registerModBlocks();

		LOGGER.info("Registering Items for " + MOD_ID);
		ModItems.registerModItems();
	}
}