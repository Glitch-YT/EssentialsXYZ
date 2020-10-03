package dev.glitch.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Item implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		String item = args[0];
		String amount = args[1];
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if(args[1].length() < 2) {
				p.chat("/give " + p.getName() + " " + item + " " + amount);
				p.sendMessage(ChatColor.DARK_PURPLE + "[essentialsxyz] " + ChatColor.GREEN + "You got " + ChatColor.WHITE + amount + " " + item + "!");
			} else {
				p.sendMessage(ChatColor.RED + "Please enter a valid number up to " + ChatColor.WHITE + "64");
			}
		} else {
			System.out.println(ChatColor.RED + "You can't execute this command from the server console!");
		}
		return true;
	}

}
