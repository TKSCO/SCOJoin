package me.TKTesla.SCOJoin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SCOJoinJoin
  implements Listener
{
  private SCOJoin plugin;

  public SCOJoinJoin(SCOJoin plugin)
  {
    this.plugin = plugin;
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {
    Player PLAYER = event.getPlayer();
    
    String PlayerJoin = this.plugin.getConfig().getString("Config.Messages.JoinMessage");

    event.setJoinMessage("");
    this.plugin.getServer().broadcastMessage(PlayerJoin + PLAYER.getDisplayName());
  }
}