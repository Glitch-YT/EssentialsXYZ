package dev.glitch.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Nick implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;

			if (args[0].length() > 0) {
				p.setDisplayName(args[0]);
				p.setPlayerListName(args[0]);
			} else {
				sender.sendMessage("Correct usage: /nick <name>");
			}
		return true;
	}
}
