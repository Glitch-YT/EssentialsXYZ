package dev.glitch.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Report implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		Player reported = Bukkit.getServer().getPlayer(args[0]);
		Player p = (Player) sender;
		if (reported.getName() != p.getName()) {
			p.sendMessage(ChatColor.AQUA + "You reported " + ChatColor.WHITE + reported.getName());
			for (Player allplayers : Bukkit.getServer().getOnlinePlayers()) {
				if (allplayers.hasPermission("EssentialsXYZ.report.getmsg")) {
					allplayers.sendMessage(ChatColor.DARK_PURPLE + "[essentialsxyz] " + ChatColor.WHITE + p.getName()
							+ ChatColor.GREEN + " Has reported " + ChatColor.WHITE + reported.getName());
				}
			}
		} else {
			p.sendMessage(ChatColor.RED + "You can't report yourself");
		}
		return true;
	}

}
