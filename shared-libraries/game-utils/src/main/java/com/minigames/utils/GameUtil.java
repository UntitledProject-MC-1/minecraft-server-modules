package com.minigames.utils;

import org.bukkit.entity.Player;
import org.bukkit.Location;

public class GameUtil {

    public static void teleportPlayer(Player player, Location location) {
        player.teleport(location);
    }

    public static void sendActionBar(Player player, String message) {
        player.sendActionBar(message);
    }

    public static boolean isInBounds(Location location, Location min, Location max) {
        return location.getX() >= min.getX() && location.getX() <= max.getX() &&
                location.getY() >= min.getY() && location.getY() <= max.getY() &&
                location.getZ() >= min.getZ() && location.getZ() <= max.getZ();
    }
}