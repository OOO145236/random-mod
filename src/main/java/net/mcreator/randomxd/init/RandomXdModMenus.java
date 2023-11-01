
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomxd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.randomxd.world.inventory.LabguiMenu;
import net.mcreator.randomxd.RandomXdMod;

public class RandomXdModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RandomXdMod.MODID);
	public static final RegistryObject<MenuType<LabguiMenu>> LABGUI = REGISTRY.register("labgui", () -> IForgeMenuType.create(LabguiMenu::new));
}
