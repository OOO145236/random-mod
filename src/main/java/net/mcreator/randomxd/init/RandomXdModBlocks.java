
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomxd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.randomxd.block.UraniumOreBlock;
import net.mcreator.randomxd.block.TunstenTrapdoorBlock;
import net.mcreator.randomxd.block.TungstenoreBlock;
import net.mcreator.randomxd.block.TungstendoorBlock;
import net.mcreator.randomxd.block.TungstenblockBlock;
import net.mcreator.randomxd.block.TitaniumOreBlock;
import net.mcreator.randomxd.block.TitaniumBlockBlock;
import net.mcreator.randomxd.block.DeepslateTitaniumOreBlock;
import net.mcreator.randomxd.block.DeeplateTungstenOreBlock;
import net.mcreator.randomxd.block.CutTungstenBlock;
import net.mcreator.randomxd.block.ChemicallaboratoryBlock;
import net.mcreator.randomxd.RandomXdMod;

public class RandomXdModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomXdMod.MODID);
	public static final RegistryObject<Block> TITANIUM_BLOCK = REGISTRY.register("titanium_block", () -> new TitaniumBlockBlock());
	public static final RegistryObject<Block> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = REGISTRY.register("deepslate_titanium_ore", () -> new DeepslateTitaniumOreBlock());
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
	public static final RegistryObject<Block> CHEMICALLABORATORY = REGISTRY.register("chemicallaboratory", () -> new ChemicallaboratoryBlock());
	public static final RegistryObject<Block> TUNGSTENORE = REGISTRY.register("tungstenore", () -> new TungstenoreBlock());
	public static final RegistryObject<Block> DEEPLATE_TUNGSTEN_ORE = REGISTRY.register("deeplate_tungsten_ore", () -> new DeeplateTungstenOreBlock());
	public static final RegistryObject<Block> TUNGSTENDOOR = REGISTRY.register("tungstendoor", () -> new TungstendoorBlock());
	public static final RegistryObject<Block> TUNSTEN_TRAPDOOR = REGISTRY.register("tunsten_trapdoor", () -> new TunstenTrapdoorBlock());
	public static final RegistryObject<Block> TUNGSTENBLOCK = REGISTRY.register("tungstenblock", () -> new TungstenblockBlock());
	public static final RegistryObject<Block> CUT_TUNGSTEN = REGISTRY.register("cut_tungsten", () -> new CutTungstenBlock());
}
