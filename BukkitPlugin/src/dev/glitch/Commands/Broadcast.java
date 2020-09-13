package dev.glitch.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Broadcast implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		Player p = (Player) sender;
		if(p.hasPermission("EssentialsXYZ.broadcast")) {
			Bukkit.broadcastMessage(ChatColor.DARK_RED+"[ALERT] "+ChatColor.WHITE+args);
		}
		return true;
	}

}
