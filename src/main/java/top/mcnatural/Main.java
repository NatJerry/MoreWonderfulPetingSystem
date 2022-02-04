package top.mcnatural;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getLogger().info(ChatColor.GREEN + "Welcome");
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.GREEN + "Good Bye!");
    }
}
