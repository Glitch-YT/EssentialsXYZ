package dev.glitch.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Sudo implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
			if (sender.hasPermission("EssentialsXYZ.nick")) {
				Player targetPlayer = Bukkit.getPlayer(args[0]);
				targetPlayer.chat(args[1]);
			}
		return true;
	}

}
