package dev.djlanav.game.items;

public abstract class Item {

	private int id;
	private int itemLevel;
	private int durability;

	// Stats
	private int attackStat;
	private int defenseStat;
	private int magicStat;
	
	private boolean enchantable;
	
	private String name;

	public Item(int id, int itemLevel, int durability, int attackStat, int defenseStat, int magicStat,
			boolean enchantable, String name) {
		this.id = id;
		this.itemLevel = itemLevel;
		this.durability = durability;
		this.attackStat = attackStat;
		this.defenseStat = defenseStat;
		this.magicStat = magicStat;
		this.enchantable = enchantable;
		this.name = name;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public int getAttackStat() {
		return attackStat;
	}

	public void setAttackStat(int attackStat) {
		this.attackStat = attackStat;
	}

	public int getDefenseStat() {
		return defenseStat;
	}

	public void setDefenseStat(int defenseStat) {
		this.defenseStat = defenseStat;
	}

	public int getMagicStat() {
		return magicStat;
	}

	public void setMagicStat(int magicStat) {
		this.magicStat = magicStat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public int getItemLevel() {
		return itemLevel;
	}

	public boolean isEnchantable() {
		return enchantable;
	}
}
