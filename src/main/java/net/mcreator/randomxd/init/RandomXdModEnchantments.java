
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomxd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.randomxd.enchantment.AutoSmeltEnchantment;
import net.mcreator.randomxd.RandomXdMod;

public class RandomXdModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, RandomXdMod.MODID);
	public static final RegistryObject<Enchantment> AUTO_SMELT = REGISTRY.register("auto_smelt", () -> new AutoSmeltEnchantment());
}
