package me.cloyd1815.holo.commands;

import me.cloyd1815.holo.util.NameTagSpawner;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Add implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		Player player = (Player) sender;
		if (commandLabel.equalsIgnoreCase("holo")) {
			if (args.length <= 0)
				player.sendMessage("Incorrect syntax! /holo help");
			if (args.length >= 1) {
				if (args[0].equalsIgnoreCase("add")) {
					StringBuilder sb = new StringBuilder();
					for (int i = 1; i < args.length; i++) {
						sb.append(args[i]);
						if (i < args.length) {
							sb.append(" ");
						}
					}
					NameTagSpawner spawner = new NameTagSpawner(1);
					for (Player p : Bukkit.getOnlinePlayers()) {
						spawner.setNameTag(0, p, player.getLocation(), 0,
								sb.toString());
					}
				} else if (args[0].equalsIgnoreCase("remove")) {
					// uh... remove stuff
				} else if (args[0].equalsIgnoreCase("help")) {
					player.sendMessage("Help message for Hologram!");

				}
			}
		}
		return true;
	}
}
