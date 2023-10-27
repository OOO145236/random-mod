
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomxd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.randomxd.block.UraniumOreBlock;
import net.mcreator.randomxd.block.TitaniumOreBlock;
import net.mcreator.randomxd.block.TitaniumBlockBlock;
import net.mcreator.randomxd.block.DeepslateTitaniumOreBlock;
import net.mcreator.randomxd.block.BlackstonedesaturatedBlock;
import net.mcreator.randomxd.RandomXdMod;

public class RandomXdModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomXdMod.MODID);
	public static final RegistryObject<Block> TITANIUM_BLOCK = REGISTRY.register("titanium_block", () -> new TitaniumBlockBlock());
	public static final RegistryObject<Block> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = REGISTRY.register("deepslate_titanium_ore", () -> new DeepslateTitaniumOreBlock());
	public static final RegistryObject<Block> BLACKSTONEDESATURATED = REGISTRY.register("blackstonedesaturated", () -> new BlackstonedesaturatedBlock());
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
}
