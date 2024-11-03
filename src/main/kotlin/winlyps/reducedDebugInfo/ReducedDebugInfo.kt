package winlyps.reducedDebugInfo

import org.bukkit.plugin.java.JavaPlugin

class ReducedDebugInfo : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("reducedDebugInfo", "true")
        }
        logger.info("ReducedDebugInfo plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("reducedDebugInfo", "false")
            logger.info("ReducedDebugInfo plugin has been disabled.")
        }
    }
}