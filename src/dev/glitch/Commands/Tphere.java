package dev.glitch.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Tphere implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		Player targetPlayer = Bukkit.getPlayer(args[0]);

			if (args[0].length() > 0) {
				targetPlayer.teleport(p);
			} else {
				sender.sendMessage("Correct usage: /tphere <name>");
			}
		return true;
	}

}
