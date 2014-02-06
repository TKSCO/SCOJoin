package me.TKTesla.SCOJoin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class SCOJoinQuit
  implements Listener
{
  private SCOJoin plugin;

  public SCOJoinQuit(SCOJoin plugin)
  {
    this.plugin = plugin;
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPlayerQuit(PlayerQuitEvent event) {
    Player Player = event.getPlayer();

    String PlayerQuit = this.plugin.getConfig().getString("Config.Messages.QuitMessage");

    event.setQuitMessage("");
    this.plugin.getServer().broadcastMessage(PlayerQuit + Player.getDisplayName());
  }
}