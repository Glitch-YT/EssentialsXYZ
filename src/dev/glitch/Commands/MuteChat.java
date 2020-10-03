package dev.glitch.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class MuteChat implements CommandExecutor, Listener {
	boolean chatMuted = false;

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		if (!chatMuted) {
			Bukkit.broadcastMessage(ChatColor.WHITE + sender.getName() + ChatColor.RED + " Has muted the chat");
			chatMuted = true;
		} else {
			Bukkit.broadcastMessage(ChatColor.WHITE + sender.getName() + ChatColor.GREEN + " Has unmuted the chat");
			chatMuted = false;
		}
		return true;
	}

	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		if (e.getPlayer().hasPermission("EssentialsXYZ.mutechat.bypass")) {
			return;
		} else {
			e.setCancelled(chatMuted);
		}
		if (chatMuted && !e.getPlayer().hasPermission("EssentialsXYZ.mutechat.bypass")) {
			e.getPlayer().sendMessage(ChatColor.RED + "The chat is muted!");
		}
	}
}
