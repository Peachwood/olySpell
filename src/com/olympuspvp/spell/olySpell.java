package com.olympuspvp.spell;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class olySpell extends JavaPlugin{
	
	final String tag = ChatColor.DARK_AQUA + "[" + ChatColor.AQUA + "olySpell" + ChatColor.DARK_AQUA + "] " + ChatColor.AQUA;
	
	
	public void onEnable(){
		System.out.println(tag + "olySpell by willno123 has been enabled!");
	}
	
	public boolean onCommand(CommandSender s, Command cmd, String c, String[] args){
		
		if(s instanceof Player == false){
			System.out.println(tag + "Go home console, you're drunk.");
			return true;
		}
		
		Player p = (Player)s;
		if((p.isOp() == false) && (p.hasPermission("olySpell.use") == false)){
			p.sendMessage(tag + "You do not have permission to use this command.");
			return true;
		}
		
		if(c.equalsIgnoreCase("Spells")){
			p.sendMessage(tag + "Burn - Sets fire to a player.");
			p.sendMessage(tag + "Transmute - Transmutes an ore into two of its resource.");
			p.sendMessage(tag + "Quatro - Does absolutely nothing... or does it?");
		}
		
		if(c.equalsIgnoreCase("Quatro")){
			
			final Player plr = Bukkit.getPlayerExact("Spimpy");
			if(plr != null){
				plr.damage(10);
				plr.sendMessage("You broke my heart.");
				Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable(){
					@Override
					public void run(){
						plr.kickPlayer("Fuck you </3");
					}
				}, 200L);
				
			}
			
		}
		
		
		
		
		
	return true;
	}

}
