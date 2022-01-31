package dev.djlanav.game.items;

public class StoneSword extends Item {

	private boolean enchanted;
	
	private String enchant;
	
	public StoneSword(int id, int itemLevel, int durability, int attackStat, int defenseStat, int magicStat,
			boolean enchantable, String name) {
		super(id, itemLevel, durability, attackStat, defenseStat, magicStat, enchantable, name);
	}
	
	public boolean isEnchanted() {
		return enchanted;
	}

	public void setEnchanted(boolean enchanted) {
		this.enchanted = enchanted;
	}

	public String getEnchant() {
		return enchant;
	}

	public void setEnchant(String enchant) {
		this.enchant = enchant;
	}
}
