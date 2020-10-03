package dev.glitch;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import dev.glitch.Commands.Broadcast;
import dev.glitch.Commands.Fly;
import dev.glitch.Commands.FlySpeed;
import dev.glitch.Commands.Item;
import dev.glitch.Commands.ModHelp;
import dev.glitch.Commands.MuteChat;
import dev.glitch.Commands.Nick;
import dev.glitch.Commands.Report;
import dev.glitch.Commands.Speed;
import dev.glitch.Commands.Sudo;
import dev.glitch.Commands.Tphere;
import dev.glitch.Commands.WalkSpeed;

public class Main extends JavaPlugin {

	public void onEnable() {
		MuteChat mc = new MuteChat();
		System.out.println("----------------------------------------------------");
		System.out.println("[essentialsxyz] essentialsxyz is loading commands...");

		getCommand("fly").setExecutor(new Fly());
		getCommand("flyspeed").setExecutor(new FlySpeed());
		getCommand("walkspeed").setExecutor(new WalkSpeed());
		getCommand("speed").setExecutor(new Speed());
		getCommand("nick").setExecutor(new Nick());
		getCommand("tphere").setExecutor(new Tphere());
		getCommand("sudo").setExecutor(new Sudo());
		getCommand("broadcast").setExecutor(new Broadcast());
		getCommand("report").setExecutor(new Report());
		getCommand("modhelp").setExecutor(new ModHelp());
		getCommand("mutechat").setExecutor(mc);
		getCommand("i").setExecutor(new Item());

		System.out.println("----------------------------------");
		System.out.println("[essentialsxyz] registering events");

		Bukkit.getServer().getPluginManager().registerEvents(mc, this);

		System.out.println("-----------------------------------------------");
		System.out.println("[essentialsxyz] essentialsxyz has been enabled!");
		System.out.println("-----------------------------------------------");
	}

	public void onDisabled() {
		System.out.println("--------------------------------------------------");
		System.out.println("[essentialsxyz] essentialsxyz has been disabled :(");
		System.out.println("--------------------------------------------------");
	}
}
