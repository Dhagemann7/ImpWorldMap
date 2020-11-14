package com.impworldmap;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ImpWorldMapPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ImpWorldMapPlugin.class);
		RuneLite.main(args);
	}
}