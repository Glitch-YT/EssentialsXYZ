package dev.glitch.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
		Player p = (Player) sender;

		System.out.println(args.toString());
		if (p.getAllowFlight() == true) {
			p.setAllowFlight(false);
			p.setFlying(false);
			p.sendMessage(ChatColor.DARK_PURPLE + "[essentialsxyz] " + ChatColor.RED + "You can't fly anymore :(");
		} else {
			p.setAllowFlight(true);
			p.sendMessage(ChatColor.DARK_PURPLE + "[essentialsxyz] " + ChatColor.GREEN + "You can fly like a bird!");
		}
		return true;
	}
}
