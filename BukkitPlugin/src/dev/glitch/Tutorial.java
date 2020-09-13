package dev.glitch;

import org.bukkit.plugin.java.JavaPlugin;

import dev.glitch.Commands.Broadcast;
import dev.glitch.Commands.Cmds;
import dev.glitch.Commands.Fly;
import dev.glitch.Commands.FlySpeed;
import dev.glitch.Commands.Nick;
import dev.glitch.Commands.Speed;
import dev.glitch.Commands.Sudo;
import dev.glitch.Commands.Tphere;
import dev.glitch.Commands.WalkSpeed;
import dev.glitch.Commands.Welcome;

public class Tutorial extends JavaPlugin {

	public void onEnable() {
		System.out.println("[essentialsxyzs] essentialsxyz has been enabled");

		getCommand("fly").setExecutor(new Fly());
		getCommand("flyspeed").setExecutor(new FlySpeed());
		getCommand("walkspeed").setExecutor(new WalkSpeed());
		getCommand("speed").setExecutor(new Speed());
		getCommand("nick").setExecutor(new Nick());
		getCommand("tphere").setExecutor(new Tphere());
		getCommand("sudo").setExecutor(new Sudo());
		getCommand("bc").setExecutor(new Broadcast());
		getCommand("welcome").setExecutor(new Welcome());
		getCommand("cmds").setExecutor(new Cmds());
	}

	public void onDisabled() {
		System.out.println("[essentialsxyzs] essentialsxyz has been disabled");
	}
}
