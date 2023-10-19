
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomxd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.randomxd.block.RtestBlock;
import net.mcreator.randomxd.RandomXdMod;

public class RandomXdModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomXdMod.MODID);
	public static final RegistryObject<Block> RTEST = REGISTRY.register("rtest", () -> new RtestBlock());
}
