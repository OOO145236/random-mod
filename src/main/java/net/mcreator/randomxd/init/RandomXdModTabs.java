
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomxd.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.randomxd.RandomXdMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RandomXdModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RandomXdMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(RandomXdModItems.TITANIUM_SWORD.get());
			tabData.accept(RandomXdModItems.TITANIUM_ARMOR_HELMET.get());
			tabData.accept(RandomXdModItems.TITANIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(RandomXdModItems.TITANIUM_ARMOR_LEGGINGS.get());
			tabData.accept(RandomXdModItems.TITANIUM_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(RandomXdModItems.RAW_URANIUM_ORE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(RandomXdModItems.TITANIUM_AXE.get());
			tabData.accept(RandomXdModItems.TITANIUM_PICKAXE.get());
			tabData.accept(RandomXdModItems.TITANIUM_SHOVEL.get());
			tabData.accept(RandomXdModItems.TITANIUM_HOE.get());
			tabData.accept(RandomXdModItems.TITANIUM_SAW.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(RandomXdModBlocks.BLACKSTONEDESATURATED.get().asItem());
			tabData.accept(RandomXdModBlocks.URANIUM_ORE.get().asItem());
		}
	}
}
