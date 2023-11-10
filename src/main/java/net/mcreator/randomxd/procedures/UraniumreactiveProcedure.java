package net.mcreator.randomxd.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.randomxd.init.RandomXdModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UraniumreactiveProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == RandomXdModItems.CHEMISTRY_BUCKET_GLOWSTONE_ACID.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RandomXdModItems.RAW_URANIUM_ORE.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RandomXdModItems.RAW_URANIUM_ORE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RandomXdModItems.CHEMISTRY_BUCKET_GLOWSTONE_ACID.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(RandomXdModItems.URANIUMINGOT.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(RandomXdModItems.CHEMISTRYBUCKET.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
