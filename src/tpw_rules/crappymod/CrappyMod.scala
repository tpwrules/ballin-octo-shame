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

  lazy val crappyBlock: CrappyBlock = new CrappyBlock(666)

  @Mod.EventHandler
  def preinit(e: event.FMLPreInitializationEvent) = {
    // make sure our blocks get initialized
    val lolol = crappyBlock
  }

  @Mod.EventHandler
  def init(e: event.FMLInitializationEvent) = {
    println("Initialized!")
    println(proxy.getSide)
  }
}