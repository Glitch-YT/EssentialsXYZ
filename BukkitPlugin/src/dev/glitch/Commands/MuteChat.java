package dev.glitch.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class MuteChat implements CommandExecutor {
	public boolean chatMuted = false;

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		Player p = (Player) sender;
		if (p.hasPermission("EssentialsXYZ.mutechat")) {
			if (!chatMuted) {
				Bukkit.broadcastMessage(ChatColor.RED + "Chat muted by " + ChatColor.WHITE + p.getName());
				chatMuted = true;
			} else if (chatMuted) {
				Bukkit.broadcastMessage(ChatColor.GREEN + "Chat unmuted by " + ChatColor.WHITE + p.getName());
				chatMuted = false;
			}
		}
		return true;
	}
		@EventHandler
		public void onChat(AsyncPlayerChatEvent e) {
			e.setCancelled(chatMuted);
		}
}
