package net.cjservers.variablesxpansion;

import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;

public class VariablesExpansion extends PlaceholderExpansion {
  
  @Override
  public @NotNull String getIdentifier() {
    return "variables";
  }
  
  @Override
  public @NotNull String getAuthor() {
    return "cj89898";
  }
  
  @Override
  public @NotNull String getVersion() {
    return "1.1.0";
  }
  
  @Override
  public String onRequest(OfflinePlayer player, String params) {
    if (PlaceholderAPI.containsBracketPlaceholders(params))
      params = PlaceholderAPI.setBracketPlaceholders(player, params);
    if (!PlaceholderAPI.setPlaceholders(player, "%" + params + "%").equals("%" + params + "%"))
      params = PlaceholderAPI.setPlaceholders(player, "%" + params + "%");
    return PlaceholderAPI.setPlaceholders(player, getString(params, ""));
  }
  
}
