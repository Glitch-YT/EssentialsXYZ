package dev.glitch.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
		Player p = (Player) sender;

		if (p.hasPermission("EssentialsXYZ.fly")) {
			System.out.println(args.toString());
			if (p.getAllowFlight() == true) {
				p.setAllowFlight(false);
				p.setFlying(false);
			} else {
				p.setAllowFlight(true);
			}
		} else {
			p.sendMessage(ChatColor.BOLD + "You don't have the right permissions to do that.");
		}
		return true;
	}
}
