package net.buycraft.tasks;

import org.bukkit.entity.Player;
import org.json.JSONObject;

import net.buycraft.Plugin;


public class VerificationTask extends Thread
{
	private Plugin plugin;
	
	private Player player;
	private String code;
	
	public VerificationTask(Player player, String code)
	{
		this.plugin = Plugin.getInstance();

		this.player = player;
		this.code = code;
	}
	
	@Override
	public void run()
	{
		JSONObject apiResponse = plugin.getApi().verificationAction(player.getName(), code, player.getAddress());
	}
}
