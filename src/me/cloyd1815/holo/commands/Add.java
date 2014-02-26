package me.cloyd1815.holo.commands;

import me.cloyd1815.holo.util.Hologram;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Add implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		Player player = (Player) sender;
		if (commandLabel.equalsIgnoreCase("add")) {
			if (args.length <= 0)
				player.sendMessage("Incorrect syntax! /add message");
			if (args.length >= 2) {
				StringBuilder sb = new StringBuilder();
				for (int i = 1; i < args.length; i++) {
					sb.append(args[i]);
					if (i < args.length) {
						sb.append(" ");
					}
				}
				new Hologram(sb.toString().replaceAll("&", "�")).show(player
						.getLocation());
			}
		}
		return true;
	}
}
