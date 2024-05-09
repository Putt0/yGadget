package github.com.putt0;

import org.bukkit.plugin.java.JavaPlugin;

public class BukkitMain extends JavaPlugin {

    protected void onLoadService() {

        BukkitLoader.plugin = this;

        try {
            System.out.print("[yGadget] -> Inicializando...");
        } catch (Exception exception) {
            System.out.print("[yGadget] -> Ocorreu um erro ao tentar inicializar: (" + exception + ")");
        }
    }

    protected void onEnableService() {

        try {
            System.out.print("[yGadget] -> Iniciado!");
        } catch (Exception exception) {
            System.out.print("[yGadget] -> Ocorreu um erro ao inicializar: (" + exception + ")");
        }
    }

    protected void onDisableService() {

        BukkitLoader.plugin = null;

        try {
            System.out.print("[yGadget] -> Desligando...");
        } catch (Exception exception) {
            System.out.print("[yGadget] -> Ocorreu um erro ao desligar: (" + exception + ")");
        }
    }
}