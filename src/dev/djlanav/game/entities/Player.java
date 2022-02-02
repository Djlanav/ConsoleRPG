package dev.djlanav.game.entities;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import dev.djlanav.game.items.StoneSword;
import dev.djlanav.game.playerutils.Inventory;
import dev.djlanav.game.tools.Vector2f;
import dev.djlanav.game.world.Tile;

public class Player {

	private Vector2f position;
	private String name;
	private String currentAxeType;
	
	private static final int TILE_DAMAGE_MODIFER = 5; // The least it can be is five for "Wood" type axes
	
	private int health;
	private int stamina;
	private int mana;
	private int level;
	
	private int damageTaken;
	
	// Allocations
	private HashMap<String ,Integer> attacks = new HashMap<String ,Integer>();
	private String[] axeTypes = { "Wood", "Stone", "Copper", "Iron", "Diamond" };
	private Random rand = new Random();
	
	private Inventory inv = new Inventory();
	
	// public variables
	public int enemyDamageTaken;
	
	// Constructor
	public Player(Vector2f startPos, String name, int health, int stamina, int mana, int level) {
		this.position = startPos;
		this.name = name;
		this.health = health;
		this.stamina = stamina;
		this.mana = mana;
		this.level = level;
	
		attacks.put("Punch", 1);
		attacks.put("Kick", 2);
	}
	
	public void displayStats() {
		System.out.println("=== PLAYER INFORMATION ===");
		
		System.out.println("Name: " + name);
		System.out.println("Level: " + level);
		System.out.println("HP: " + health);
		System.out.println("Mana: " + mana);
		System.out.println("Stamina: " + stamina);
		
		displayInventory();
		System.out.println("==========================");
		System.out.println("\n");
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
	
	public void breakTile(Tile tile) { // I'll probably change this "else-if chain" a lot. Wish I could use a switch statement but I don't think I can.
		if (currentAxeType.equals(axeTypes[0])) {
			tile.setTileHP(tile.getTileHP() - TILE_DAMAGE_MODIFER);
			
		} else if (currentAxeType.equals(axeTypes[1])) {
			tile.setTileHP(tile.getTileHP() - (TILE_DAMAGE_MODIFER * 2));
			
		} else if (currentAxeType.equals(axeTypes[2])) {
			tile.setTileHP(tile.getTileHP() - (TILE_DAMAGE_MODIFER * 4));
			
		} else if (currentAxeType.equals(axeTypes[3])) {
			tile.setTileHP(tile.getTileHP() - (TILE_DAMAGE_MODIFER * 8));
			
		} else if (currentAxeType.equals(axeTypes[4])) {
			tile.setTileHP(tile.getTileHP() - (TILE_DAMAGE_MODIFER * 16));
		}
	}
	
	private void displayInventory() {
		if (inv.getItems().size() <= 0) {
			System.out.print("You have " + inv.getItems().size() + " items in your inventory. \n");
		} else if (inv.getItems().size() >= 1) {
			System.out.print("You have " + inv.getItems().size() + " item(s) in your inventory: ");
			inv.displayInv();
		}
	}
	
	/*
	public void selectTool() {
		String selectedTool;
		Scanner toolChoice = new Scanner(System.in);
		
		System.out.println("Select a tool: ");
	} */

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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
