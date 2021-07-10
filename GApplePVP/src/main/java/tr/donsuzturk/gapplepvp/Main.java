package tr.donsuzturk.gapplepvp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    public static Plugin plugin;

    public void onEnable() {
        Main.plugin = this;
        getLogger().info("Plugin enabled!");
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] a) {
        final Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("gapplepvp")) {
            GUI.openGUI(player);
        }
        return false;
    }
}