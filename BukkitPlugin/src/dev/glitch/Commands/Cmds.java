package dev.glitch.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmds implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		Player p = (Player) sender;
		if(p.hasPermission("EssentialsXYZ.cmds")) {
			p.sendMessage("Commands for EssentialsXYZ: bc, cmds, fly, flyspeed, walkspeed, speed, nick, sudo, tphere and welcome");
		} else {
			p.sendMessage(ChatColor.RED + "You don't have the right permissions to do that!");
		}
		return true;
	}

}
