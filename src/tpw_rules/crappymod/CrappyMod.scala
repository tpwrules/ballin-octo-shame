package tpw_rules.crappymod

import cpw.mods.fml.common.{Mod, SidedProxy, event}
import cpw.mods.fml.common.Mod.*

@Mod(modLanguage="scala", modid="crappymod", name="Crappy Mod", version="1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

object CrappyMod {
  @Mod.EventHandler
  def init(e: event.FMLInitializationEvent) = {
    println("Initialized!")
  }
}