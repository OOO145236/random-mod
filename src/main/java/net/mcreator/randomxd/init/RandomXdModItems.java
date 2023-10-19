
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomxd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.randomxd.item.TestItem;
import net.mcreator.randomxd.RandomXdMod;

public class RandomXdModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RandomXdMod.MODID);
	public static final RegistryObject<Item> RTEST = block(RandomXdModBlocks.RTEST);
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
