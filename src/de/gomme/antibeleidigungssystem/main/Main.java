package de.gomme.antibeleidigungssystem.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;
import net.md_5.bungee.event.EventHandler;

public class Main extends Plugin implements Listener {
	PluginManager pm = BungeeCord.getInstance().getPluginManager();

	// ################################ //
	// Plugin by ScienceCode            //
	// Last Update on 06.04.2018        //
	// Plugin under GNU-License         //
	// Copyright (C) 2018 ScienceCode   //
	// ################################ //
	
	public String Prefix = "§cSystem §8| §7";

	public static Main instance;
	public Configuration cfg;
	
	public void onDisable() {
		System.out.println("######################## #");
		System.out.println("# AntiBeleidigungsSystem #");
		System.out.println("# by ScienceCode         #");
		System.out.println("# Version: " + getDescription().getVersion() + "           #");
		System.out.println("######################## #");
		
	}
	
	public void onEnable() {
		System.out.println("######################## #");
		System.out.println("# AntiBeleidigungsSystem #");
		System.out.println("# by ScienceCode         #");
		System.out.println("# Version: " + getDescription().getVersion() + "           #");
		System.out.println("######################## #");

		BungeeCord.getInstance().getPluginManager().registerListener(this, this);

		try {
			
			if (!getDataFolder().exists()) {
				getDataFolder().mkdir();
			}
			File file = new File(getDataFolder().getPath(), "config.yml");
			if (!file.exists()) {
				file.createNewFile();
			}
			Configuration ccfg = ConfigurationProvider.getProvider(YamlConfiguration.class).load(file);
			
			this.cfg.set("#", "############################");
			this.cfg.set("##", "Plugin by ScienceCode");
			this.cfg.set("###", "Version: " + getDescription().getVersion());
			this.cfg.set("####", "Status: BETA");
			this.cfg.set("#####", "############################");
			this.cfg.set("######", "->");
			this.cfg.set("#######", "->");
			this.cfg.set("########", "# Diese Config ist derzeit noch in Arbeit!!");	
			this.cfg.set("AutoMute.Command", "tempmute %player% 24 h Beleidigung  [In Arbeit]");
			this.cfg.set("Messages.Prefix", "&cSystem &8| &7  [In Arbeit]");

			ConfigurationProvider.getProvider(YamlConfiguration.class).save(this.cfg, file);

		} catch (IOException e) {}
		
	}

	@EventHandler
	public void onChat(ChatEvent e) {
		ProxiedPlayer p = (ProxiedPlayer) e.getSender();
		if (!p.hasPermission("chat.bypass")) {
			ArrayList<String> domains = new ArrayList();
			ArrayList<String> beleidigungen = new ArrayList();

			beleidigungen.add("hurensohn");
			beleidigungen.add("hure");
			beleidigungen.add("huso");
			beleidigungen.add("huensohn");
			beleidigungen.add("huansohn");
			beleidigungen.add("arsch");
			beleidigungen.add("arschloch");
			beleidigungen.add("mama");
			beleidigungen.add("mutter");
			beleidigungen.add("pisser");
			beleidigungen.add("muda");
			beleidigungen.add("mudda");
			beleidigungen.add("nub");
			beleidigungen.add("nichtskönner");
			beleidigungen.add("ez");
			beleidigungen.add("knecht");
			beleidigungen.add("low");
			beleidigungen.add("bowspammer");
			beleidigungen.add("downloaded");
			beleidigungen.add("download");
			beleidigungen.add("gedownloaded");
			beleidigungen.add("gedownloadet");
			beleidigungen.add("lern");
			beleidigungen.add("idol");
			beleidigungen.add("idiot");
			beleidigungen.add("trottel");
			beleidigungen.add("Asylant");
			beleidigungen.add("türke");
			beleidigungen.add("fett");
			beleidigungen.add("fetter");
			beleidigungen.add("lusche");
			beleidigungen.add("camper");
			beleidigungen.add("komentet");
			beleidigungen.add("kompentetes");
			beleidigungen.add("fett");
			beleidigungen.add("wichser");
			beleidigungen.add("wixxer");
			beleidigungen.add("wixer");
			beleidigungen.add("bastard");
			beleidigungen.add("bstrd");
			beleidigungen.add("bitch");
			beleidigungen.add("b1tch");
			beleidigungen.add("hundesohn");
			beleidigungen.add("krüppel");
			beleidigungen.add("arschkrampe");
			beleidigungen.add("arschloch");
			beleidigungen.add("ficker");
			beleidigungen.add("noob");
			beleidigungen.add("n00b");
			beleidigungen.add("n0ob");
			beleidigungen.add("no0b");
			beleidigungen.add("faggot");
			beleidigungen.add("opfer");
			beleidigungen.add("affenficker");
			beleidigungen.add("ficker");
			beleidigungen.add("hitler");
			beleidigungen.add("heilhitler");
			beleidigungen.add("nigga");
			beleidigungen.add("nigger");
			beleidigungen.add("retard");
			beleidigungen.add("dick");
			beleidigungen.add("asshole");
			beleidigungen.add("penis");
			beleidigungen.add("pimmel");
			beleidigungen.add("retard");
			beleidigungen.add("lutscher");
			beleidigungen.add("misset");
			beleidigungen.add("claymc");
			beleidigungen.add("dustmc");
			beleidigungen.add("rewi");
			beleidigungen.add("kyudo");
			beleidigungen.add("gomme");
			beleidigungen.add("gommehd");
			beleidigungen.add("rewinside");
			beleidigungen.add("durchrasten");
			beleidigungen.add("griefergames");
			beleidigungen.add("mushi");
			beleidigungen.add("muschi");
			beleidigungen.add("titen");
			beleidigungen.add("busen");
			beleidigungen.add("schlong");
			beleidigungen.add("kek");
			beleidigungen.add("pisser");
			
			domains.add(".de");
			domains.add(".net");
			domains.add(".com");
			domains.add(".tk");
			domains.add(".info");
			domains.add(".tv");
			domains.add(".edu");
			domains.add(".ch");
			domains.add(".at");
			domains.add(".xyz");
			domains.add(".org");
			domains.add(".it");
			domains.add(".ink");
			domains.add(".free");
			domains.add(".blog");
			domains.add(".me");
			domains.add(".fuck");

			String msg = e.getMessage();
			msg = msg.toLowerCase();
			msg = msg.replace(" ", "");

			String msg2 = e.getMessage();
			msg2 = msg2.toLowerCase();
			msg2 = msg2.replace(" ", "");
			for (String blocked : beleidigungen) {
				msg = msg.replace("-", "");
				msg = msg.replace("_", "");
				msg = msg.replace("(", "");
				msg = msg.replace(")", "");
				msg = msg.replace("0", "o");
				msg = msg.replace("4", "a");
				msg = msg.replace("3", "e");
				msg = msg.replace("1", "i");
				msg = msg.replace("!", "");
				msg = msg.replace("\"", "");
				msg = msg.replace("³", "");
				msg = msg.replace("2", "");
				msg = msg.replace("*", "");
				msg = msg.replace("$", "");
				msg = msg.replace("%", "");
				msg = msg.replace("&", "");
				msg = msg.replace("/", "");
				msg = msg.replace("{", "");
				msg = msg.replace("}", "");
				msg = msg.replace("[", "");
				msg = msg.replace("]", "");
				msg = msg.replace("=", "");
				msg = msg.replace("?", "");
				msg = msg.replace("\\", "");
				msg = msg.replace("��", "");
				msg = msg.replace("`", "");
				msg = msg.replace("*", "");
				msg = msg.replace("_", "");
				msg = msg.replace("+", "");
				msg = msg.replace("~", "");
				msg = msg.replace("'", "");
				msg = msg.replace("#", "");
				msg = msg.replace(":", "");
				msg = msg.replace(".", "");
				msg = msg.replace(",", "");
				msg = msg.replace(";", "");
				msg = msg.replace("|", "");
				msg = msg.replace("<", "");
				msg = msg.replace(">", "");
				msg = msg.replace("^", "");
				msg = msg.replace("|", "");
				msg = msg.replace("@", "");
				msg = msg.replace(",", "");
				msg = msg.replace("°", "");
				if (msg.contains(blocked)) {
					e.setCancelled(true);		
					ProxyServer.getInstance().getPluginManager().dispatchCommand(ProxyServer.getInstance().getConsole(), "tempmute " + p.getName() + " 24 h Beleidigung");
					p.sendMessage(Prefix + "§cDiese Nachricht wurde als §4Beleidigung §cidentifiziert");
					for (ProxiedPlayer all : ProxyServer.getInstance().getPlayers()) {
						if (all.hasPermission("chat.notify")) {
							all.sendMessage(Prefix + "§6" + p.getName() + " §7hat versucht zu schreiben: §c"
									+ e.getMessage() + " §7auf: §b" + p.getServer().getInfo().getName());
						}
					}
					break;
				}
			}
			for (String blocked : domains) {
				msg2 = msg2.replace(":", ".");
				msg2 = msg2.replace(",", ".");
				msg2 = msg2.replace("(", "");
				msg2 = msg2.replace(")", "");
				msg2 = msg2.replace("[", "");
				msg2 = msg2.replace("]", "");
				msg2 = msg2.replace("-", "");
				msg2 = msg2.replace("{", "");
				msg2 = msg2.replace("}", "");
				msg2 = msg2.replace("punkt", ".");
				msg2 = msg2.replace("pnkt", "");
				msg2 = msg2.replace("pukt", "");
				msg2 = msg2.replace("deutschesdomainende", "de");
				msg2 = msg2.replace("netzwerkdomainende", "net");
				if (msg2.contains(blocked)) {
					e.setCancelled(true);
					ProxyServer.getInstance().getPluginManager().dispatchCommand(ProxyServer.getInstance().getConsole(), "tempmute " + p.getName() + " 24 h Werbung");
					p.sendMessage(Prefix + "§cDiese Nachricht wurde als §5Werbung §cidentifiziert!");
					for (ProxiedPlayer all : ProxyServer.getInstance().getPlayers()) {
						if (all.hasPermission("chat.notify")) {
							all.sendMessage(Prefix + "§6" + p.getName() + " §7hat versucht zu schreiben: §c"
									+ e.getMessage() + " §7auf: §b" + p.getServer().getInfo().getName());
						}
					}
					break;
				}
			}
		}
	}
}




































































































//Plugin by ScienceCode
	// Last Update on 06.04.2018
	// Plugin under GNU-License
	// Copyright (C) 2018 ScienceCode
