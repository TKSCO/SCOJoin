package me.TKTesla.SCOJoin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class SCOJoin extends JavaPlugin
{
  private SCOJoinJoin sco;
  private SCOJoinQuit sco1;

  public void onDisable()
  {
    System.out.println("[SCOJoin] Plugin Desativado!");
  }

  public void onEnable()
  {
    registerEvent();
    registerEvent1();
    System.out.println("[SCOJoin] Plugin Ativado!");

    loadconfig();
  }

  public boolean onCommand(CommandSender sender, Command cmd, String cmdLable, String[] args)
  {
    this.sco.getClass();
    this.sco1.getClass();

    return true;
  }

  private void registerEvent()
  {
    this.sco = new SCOJoinJoin(this);
  }

  private void registerEvent1()
  {
    this.sco1 = new SCOJoinQuit(this);
  }

  private void loadconfig()
  {
    String path1 = "Config.Messages.JoinMessage";
    getConfig().addDefault(path1, ChatColor.GOLD + "[" + ChatColor.GREEN + "+" + ChatColor.GOLD + "] " + ChatColor.GOLD);

    String path2 = "Config.Messages.QuitMessage";
    getConfig().addDefault(path2, ChatColor.GOLD + "[" + ChatColor.DARK_RED + "-" + ChatColor.GOLD + "] " + ChatColor.GOLD);

    getConfig().options().copyDefaults(true);
    saveConfig();
  }
}