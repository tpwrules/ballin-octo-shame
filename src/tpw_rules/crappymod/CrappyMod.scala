package tpw_rules.crappymod

import cpw.mods.fml.common.{ Mod, SidedProxy, event }
import cpw.mods.fml.common.Mod._
import cpw.mods.fml.common.network.NetworkMod

class CommonProxy {
  def getSide(): String = "Server"
}

class ClientProxy extends CommonProxy {
  override def getSide(): String = "Client"
}

@Mod(modLanguage="scala", modid="crappymod", name="Crappy Mod", version="1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
object CrappyMod {
  @SidedProxy(
    clientSide="tpw_rules.crappymod.ClientProxy",
    serverSide="tpw_rules.crappymod.CommonProxy")
  var proxy: CommonProxy = null

  var crappyBlock: CrappyBlock = null

  @Mod.EventHandler
  def init(e: event.FMLInitializationEvent) = {
    crappyBlock = new CrappyBlock(666)
    println("Initialized!")
    println(proxy.getSide)
  }
}