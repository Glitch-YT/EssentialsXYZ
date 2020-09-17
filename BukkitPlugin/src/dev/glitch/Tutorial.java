package dev.glitch;

import org.bukkit.plugin.java.JavaPlugin;

import dev.glitch.Commands.Broadcast;
import dev.glitch.Commands.Fly;
import dev.glitch.Commands.FlySpeed;
import dev.glitch.Commands.MuteChat;
import dev.glitch.Commands.Nick;
import dev.glitch.Commands.Report;
import dev.glitch.Commands.Speed;
import dev.glitch.Commands.Sudo;
import dev.glitch.Commands.Tphere;
import dev.glitch.Commands.WalkSpeed;

public class Tutorial extends JavaPlugin {

	public void onEnable() {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("[essentialsxyz] essentialsxyz is loading commands...");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("[essentialsxyz] essentialsxyz has been enabled!");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

		getCommand("fly").setExecutor(new Fly());
		getCommand("flyspeed").setExecutor(new FlySpeed());
		getCommand("walkspeed").setExecutor(new WalkSpeed());
		getCommand("speed").setExecutor(new Speed());
		getCommand("nick").setExecutor(new Nick());
		getCommand("tphere").setExecutor(new Tphere());
		getCommand("sudo").setExecutor(new Sudo());
		getCommand("bc").setExecutor(new Broadcast());
		getCommand("report").setExecutor(new Report());
		getCommand("mutechat").setExecutor(new MuteChat());
	}

	public void onDisabled() {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("[essentialsxyz] essentialsxyz is being disabled :O");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("[essentialsxyz] essentialsxyz has been disabled :(");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	}
}
