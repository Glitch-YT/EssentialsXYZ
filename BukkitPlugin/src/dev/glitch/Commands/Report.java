package dev.glitch.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Report implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		Player p = (Player) sender;
		Player reported = Bukkit.getPlayer(args[0]);
		for(Player allplayers : Bukkit.getServer().getOnlinePlayers()) {
			if(allplayers.hasPermission("EssentialsXYZ.report.getreportmessage")) {
				allplayers.sendMessage(ChatColor.DARK_PURPLE+"[essentialsxyz] "+ChatColor.WHITE+p.getName()+ChatColor.GREEN+" Has reported "+ChatColor.WHITE+reported.getName());
			}
		}
		return true;
	}

}
