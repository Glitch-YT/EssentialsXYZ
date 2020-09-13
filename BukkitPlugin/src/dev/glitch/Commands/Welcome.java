package dev.glitch.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Welcome implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		Player p = (Player) sender;
		if(p.hasPermission("EssentialsXYZ.welcome")) {
			p.chat(ChatColor.GRAY+"Welcome "+ChatColor.WHITE+args[0]+ChatColor.GRAY+" to the server!");
		} else {
			p.sendMessage(ChatColor.RED+"you don't have the right permissions to do that!");
		}
		return true;
	}

}
