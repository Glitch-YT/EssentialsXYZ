package dev.glitch.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ModHelp implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		Player p = (Player) sender;
		p.sendMessage(ChatColor.GREEN + "Help is on the way!");
		for (Player allplayers : Bukkit.getServer().getOnlinePlayers()) {
			if (allplayers.hasPermission("EssentialsXYZ.modhelp.getmsg")) {
				allplayers.sendMessage(ChatColor.DARK_PURPLE + "[essentialsxyz] " + ChatColor.WHITE + p.getName()
						+ ChatColor.RED + " Needs help!");
			}
		}
		return true;
	}

}
