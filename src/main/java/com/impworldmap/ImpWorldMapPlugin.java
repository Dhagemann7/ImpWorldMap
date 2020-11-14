package com.impworldmap;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Imp World Map",
	description = "Shows imps on the world map"
)
public class ImpWorldMapPlugin extends Plugin
{
	@Inject
	private Client client;

    @Inject
    private ConfigManager configManager;

	@Override
	protected void startUp() throws Exception
	{
		log.info("impworldmap started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("impworldmap stopped!");
	}

	@Subscribe
	/*
	public void onNpcSpawned(NpcSpawned npcSpawned) {
					
	}
	*/
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "impworldmap says asd", null);
		}
	}
}
