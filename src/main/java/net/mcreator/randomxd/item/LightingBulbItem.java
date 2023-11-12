
package net.mcreator.randomxd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LightingBulbItem extends Item {
	public LightingBulbItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
