package dev.djlanav.game.entities;

import java.util.HashMap;
import java.util.Random;

import dev.djlanav.game.tools.Vector2f;
import dev.djlanav.game.world.Tile;

public class Player {

	private Vector2f position;
	private String name;
	private String currentAxeType;
	
	private int health;
	private int stamina;
	private int mana;
	
	private int damageTaken;
	
	// Allocations
	private HashMap<String ,Integer> attacks = new HashMap<String ,Integer>();
	private String[] axeTypes = { "Wood", "Stone", "Iron", "Copper", "Diamond" };
	private Random rand = new Random();
	
	// public variables
	public int enemyDamageTaken;
		
	
	public Player(Vector2f startPos, String name, int health, int stamina, int mana) {
		this.position = startPos;
		this.name = name;
		this.health = health;
		this.stamina = stamina;
		this.mana = mana;
	
		attacks.put("Punch", 1);
		attacks.put("Kick", 2);
	}
	
	public void attack() {
		int attackID = rand.nextInt(attacks.size());
		
		if (attackID == 1) {
			punch();
		}
	}
	
	private int punch() {
		Random damRand = new Random();
		int damage = 0;
		
		enemyDamageTaken += damRand.nextInt(12);
		damage = enemyDamageTaken;
		
		return damage;
	}
	
	public void breakTile(Tile tile) {
		if (currentAxeType.equals(axeTypes[0]) && tile.getBreakTime() > tile.getBreakTime() - 5) {
			tile.setBreakTime(tile.getBreakTime() - 5); // What
			tile.setTileHP(tile.getTileHP() - tile.getBreakTime());
		}
	}

	public Vector2f getPosition() {
		return position;
	}

	public void setPosition(Vector2f position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public HashMap<String, Integer> getAttacks() {
		return attacks;
	}

	public void setAttacks(HashMap<String, Integer> attacks) {
		this.attacks = attacks;
	}

	public int getDamageTaken() {
		return damageTaken;
	}
}
