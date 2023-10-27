
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

import net.mcreator.randomxd.item.TitaniumSwordItem;
import net.mcreator.randomxd.item.TitaniumShovelItem;
import net.mcreator.randomxd.item.TitaniumPickaxeItem;
import net.mcreator.randomxd.item.TitaniumIngotItem;
import net.mcreator.randomxd.item.TitaniumHoeItem;
import net.mcreator.randomxd.item.TitaniumAxeItem;
import net.mcreator.randomxd.item.TitaniumArmorItem;
import net.mcreator.randomxd.item.RawTitaniumOreItem;
import net.mcreator.randomxd.RandomXdMod;

public class RandomXdModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RandomXdMod.MODID);
	public static final RegistryObject<Item> TITANIUM_BLOCK = block(RandomXdModBlocks.TITANIUM_BLOCK);
	public static final RegistryObject<Item> TITANIUM_ORE = block(RandomXdModBlocks.TITANIUM_ORE);
	public static final RegistryObject<Item> TITANIUM_AXE = REGISTRY.register("titanium_axe", () -> new TitaniumAxeItem());
	public static final RegistryObject<Item> TITANIUM_PICKAXE = REGISTRY.register("titanium_pickaxe", () -> new TitaniumPickaxeItem());
	public static final RegistryObject<Item> TITANIUM_SWORD = REGISTRY.register("titanium_sword", () -> new TitaniumSwordItem());
	public static final RegistryObject<Item> TITANIUM_SHOVEL = REGISTRY.register("titanium_shovel", () -> new TitaniumShovelItem());
	public static final RegistryObject<Item> TITANIUM_HOE = REGISTRY.register("titanium_hoe", () -> new TitaniumHoeItem());
	public static final RegistryObject<Item> TITANIUM_INGOT = REGISTRY.register("titanium_ingot", () -> new TitaniumIngotItem());
	public static final RegistryObject<Item> TITANIUM_ARMOR_HELMET = REGISTRY.register("titanium_armor_helmet", () -> new TitaniumArmorItem.Helmet());
	public static final RegistryObject<Item> TITANIUM_ARMOR_CHESTPLATE = REGISTRY.register("titanium_armor_chestplate", () -> new TitaniumArmorItem.Chestplate());
	public static final RegistryObject<Item> TITANIUM_ARMOR_LEGGINGS = REGISTRY.register("titanium_armor_leggings", () -> new TitaniumArmorItem.Leggings());
	public static final RegistryObject<Item> TITANIUM_ARMOR_BOOTS = REGISTRY.register("titanium_armor_boots", () -> new TitaniumArmorItem.Boots());
	public static final RegistryObject<Item> RAW_TITANIUM_ORE = REGISTRY.register("raw_titanium_ore", () -> new RawTitaniumOreItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
