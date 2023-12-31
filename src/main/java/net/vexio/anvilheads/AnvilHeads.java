package net.vexio.anvilheads;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnvilHeads implements ModInitializer {
	public static final String MOD_ID = "anvil-heads";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Anvil Heads initializing");
	}
}