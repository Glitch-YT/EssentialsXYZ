package dev.glitch.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlySpeed implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(p.hasPermission("EssentialsXYZ.flyspeed")) {
		p.setFlySpeed((float) Integer.parseInt(args[0]) / 100);
		p.sendMessage(ChatColor.DARK_PURPLE+"[essentialsxyz] "+ChatColor.RED+"Fly speed set to "+ChatColor.BLUE+args[0]);
		} else {
			p.sendMessage(ChatColor.BOLD + "You don't have the right permissions to do that.");
		}
		return true;
	}
}