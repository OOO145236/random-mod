
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomxd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.randomxd.world.features.ores.TitaniumOreFeature;
import net.mcreator.randomxd.RandomXdMod;

@Mod.EventBusSubscriber
public class RandomXdModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, RandomXdMod.MODID);
	public static final RegistryObject<Feature<?>> TITANIUM_ORE = REGISTRY.register("titanium_ore", TitaniumOreFeature::new);
}
