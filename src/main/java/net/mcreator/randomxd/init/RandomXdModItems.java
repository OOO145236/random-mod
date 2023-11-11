
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomxd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.randomxd.item.UraniumingotItem;
import net.mcreator.randomxd.item.UraniumdustItem;
import net.mcreator.randomxd.item.TungsteningotItem;
import net.mcreator.randomxd.item.TungstenRawOreItem;
import net.mcreator.randomxd.item.TungstenNuggetItem;
import net.mcreator.randomxd.item.TitaniumSwordItem;
import net.mcreator.randomxd.item.TitaniumShovelItem;
import net.mcreator.randomxd.item.TitaniumSawItem;
import net.mcreator.randomxd.item.TitaniumPickaxeItem;
import net.mcreator.randomxd.item.TitaniumNuggetItem;
import net.mcreator.randomxd.item.TitaniumIngotItem;
import net.mcreator.randomxd.item.TitaniumHoeItem;
import net.mcreator.randomxd.item.TitaniumAxeItem;
import net.mcreator.randomxd.item.TitaniumArmorItem;
import net.mcreator.randomxd.item.RawUraniumOreItem;
import net.mcreator.randomxd.item.RawTitaniumOreItem;
import net.mcreator.randomxd.item.ChemistrybucketItem;
import net.mcreator.randomxd.item.ChemistryBucketGlowstoneAcidItem;
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
	public static final RegistryObject<Item> DEEPSLATE_TITANIUM_ORE = block(RandomXdModBlocks.DEEPSLATE_TITANIUM_ORE);
	public static final RegistryObject<Item> TITANIUM_SAW = REGISTRY.register("titanium_saw", () -> new TitaniumSawItem());
	public static final RegistryObject<Item> URANIUM_ORE = block(RandomXdModBlocks.URANIUM_ORE);
	public static final RegistryObject<Item> RAW_URANIUM_ORE = REGISTRY.register("raw_uranium_ore", () -> new RawUraniumOreItem());
	public static final RegistryObject<Item> URANIUMINGOT = REGISTRY.register("uraniumingot", () -> new UraniumingotItem());
	public static final RegistryObject<Item> CHEMICALLABORATORY = block(RandomXdModBlocks.CHEMICALLABORATORY);
	public static final RegistryObject<Item> CHEMISTRYBUCKET = REGISTRY.register("chemistrybucket", () -> new ChemistrybucketItem());
	public static final RegistryObject<Item> CHEMISTRY_BUCKET_GLOWSTONE_ACID = REGISTRY.register("chemistry_bucket_glowstone_acid", () -> new ChemistryBucketGlowstoneAcidItem());
	public static final RegistryObject<Item> TUNGSTENORE = block(RandomXdModBlocks.TUNGSTENORE);
	public static final RegistryObject<Item> DEEPLATE_TUNGSTEN_ORE = block(RandomXdModBlocks.DEEPLATE_TUNGSTEN_ORE);
	public static final RegistryObject<Item> TUNGSTENDOOR = doubleBlock(RandomXdModBlocks.TUNGSTENDOOR);
	public static final RegistryObject<Item> TUNSTEN_TRAPDOOR = block(RandomXdModBlocks.TUNSTEN_TRAPDOOR);
	public static final RegistryObject<Item> TUNGSTENINGOT = REGISTRY.register("tungsteningot", () -> new TungsteningotItem());
	public static final RegistryObject<Item> TUNGSTEN_RAW_ORE = REGISTRY.register("tungsten_raw_ore", () -> new TungstenRawOreItem());
	public static final RegistryObject<Item> TUNGSTENBLOCK = block(RandomXdModBlocks.TUNGSTENBLOCK);
	public static final RegistryObject<Item> CUT_TUNGSTEN = block(RandomXdModBlocks.CUT_TUNGSTEN);
	public static final RegistryObject<Item> URANIUMDUST = REGISTRY.register("uraniumdust", () -> new UraniumdustItem());
	public static final RegistryObject<Item> EXOATLE = block(RandomXdModBlocks.EXOATLE);
	public static final RegistryObject<Item> RAW_URANIUM_BLOCK = block(RandomXdModBlocks.RAW_URANIUM_BLOCK);
	public static final RegistryObject<Item> RAW_TITANIUM_BLOCK = block(RandomXdModBlocks.RAW_TITANIUM_BLOCK);
	public static final RegistryObject<Item> RAW_TUNGSTEN_BLOCK = block(RandomXdModBlocks.RAW_TUNGSTEN_BLOCK);
	public static final RegistryObject<Item> TUNGSTEN_PRESSURE_PLATE = block(RandomXdModBlocks.TUNGSTEN_PRESSURE_PLATE);
	public static final RegistryObject<Item> TUNGSTEN_GLASS_BLOCK = block(RandomXdModBlocks.TUNGSTEN_GLASS_BLOCK);
	public static final RegistryObject<Item> TUNGSTEN_NUGGET = REGISTRY.register("tungsten_nugget", () -> new TungstenNuggetItem());
	public static final RegistryObject<Item> TITANIUM_NUGGET = REGISTRY.register("titanium_nugget", () -> new TitaniumNuggetItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
