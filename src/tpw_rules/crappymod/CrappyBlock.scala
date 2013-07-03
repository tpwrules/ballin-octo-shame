package tpw_rules.crappymod

import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import cpw.mods.fml.relauncher.{Side, SideOnly}

class CrappyBlock(id: Int) extends Block(id, Material.wood) {
  setUnlocalizedName("crappyBlock")
  func_111022_d("crappymod:crappyblock") // set texture path name

  GameRegistry.registerBlock(this, "CrappyBlock")
}