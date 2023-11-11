
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomxd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.randomxd.RandomXdMod;

public class RandomXdModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RandomXdMod.MODID);
	public static final RegistryObject<CreativeModeTab> SPLAVTAB = REGISTRY.register("splavtab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.random_xd.splavtab")).icon(() -> new ItemStack(RandomXdModItems.TUNGSTENINGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RandomXdModBlocks.TITANIUM_BLOCK.get().asItem());
				tabData.accept(RandomXdModBlocks.TITANIUM_ORE.get().asItem());
				tabData.accept(RandomXdModItems.TITANIUM_AXE.get());
				tabData.accept(RandomXdModItems.TITANIUM_PICKAXE.get());
				tabData.accept(RandomXdModItems.TITANIUM_SWORD.get());
				tabData.accept(RandomXdModItems.TITANIUM_SHOVEL.get());
				tabData.accept(RandomXdModItems.TITANIUM_HOE.get());
				tabData.accept(RandomXdModItems.TITANIUM_INGOT.get());
				tabData.accept(RandomXdModItems.TITANIUM_ARMOR_HELMET.get());
				tabData.accept(RandomXdModItems.TITANIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(RandomXdModItems.TITANIUM_ARMOR_LEGGINGS.get());
				tabData.accept(RandomXdModItems.TITANIUM_ARMOR_BOOTS.get());
				tabData.accept(RandomXdModItems.RAW_TITANIUM_ORE.get());
				tabData.accept(RandomXdModBlocks.DEEPSLATE_TITANIUM_ORE.get().asItem());
				tabData.accept(RandomXdModItems.TITANIUM_SAW.get());
				tabData.accept(RandomXdModBlocks.URANIUM_ORE.get().asItem());
				tabData.accept(RandomXdModItems.RAW_URANIUM_ORE.get());
				tabData.accept(RandomXdModItems.URANIUMINGOT.get());
				tabData.accept(RandomXdModBlocks.CHEMICALLABORATORY.get().asItem());
				tabData.accept(RandomXdModItems.CHEMISTRYBUCKET.get());
				tabData.accept(RandomXdModItems.CHEMISTRY_BUCKET_GLOWSTONE_ACID.get());
				tabData.accept(RandomXdModBlocks.TUNGSTENORE.get().asItem());
				tabData.accept(RandomXdModBlocks.DEEPLATE_TUNGSTEN_ORE.get().asItem());
				tabData.accept(RandomXdModBlocks.TUNGSTENDOOR.get().asItem());
				tabData.accept(RandomXdModBlocks.TUNSTEN_TRAPDOOR.get().asItem());
				tabData.accept(RandomXdModItems.TUNGSTENINGOT.get());
				tabData.accept(RandomXdModItems.TUNGSTEN_RAW_ORE.get());
				tabData.accept(RandomXdModBlocks.TUNGSTENBLOCK.get().asItem());
				tabData.accept(RandomXdModBlocks.CUT_TUNGSTEN.get().asItem());
				tabData.accept(RandomXdModItems.URANIUMDUST.get());
				tabData.accept(RandomXdModBlocks.EXOATLE.get().asItem());
				tabData.accept(RandomXdModBlocks.RAW_URANIUM_BLOCK.get().asItem());
				tabData.accept(RandomXdModBlocks.RAW_TITANIUM_BLOCK.get().asItem());
			})

					.build());
}
