package dev.glitch.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WalkSpeed implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;

			p.setWalkSpeed((float) Integer.parseInt(args[0]) / 100);
			p.sendMessage(ChatColor.DARK_PURPLE+"[essentialsxyz] "+ChatColor.RED+"Walk speed set to "+ChatColor.BLUE+args[0]);
		return false;
	}

}
