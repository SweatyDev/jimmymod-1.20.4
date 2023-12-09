package net.jimmy.jimmymod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JimmyMod implements ModInitializer {

    public static final String MODID = "jimmymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}