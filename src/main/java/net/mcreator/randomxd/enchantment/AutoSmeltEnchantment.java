
package net.mcreator.randomxd.enchantment;

public class AutoSmeltEnchantment extends Enchantment {

	public AutoSmeltEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.DIGGER, slots);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(Enchantments.SILK_TOUCH).contains(ench);
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}

}
