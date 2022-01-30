package dev.djlanav.game.entities;

import java.util.HashMap;
import java.util.Random;

import dev.djlanav.game.tools.Vector2f;

public class Zombie {
	
	private Vector2f position;
	private String type;
	
	private int health;
	private int stamina;
	
	private int damageTaken;
	
	private int enemyDamageTaken;
	
	private boolean inEngagement = false;
	
	private HashMap<String, Integer> attacks = new HashMap<String, Integer>();

	private Random rand = new Random();
	
	public Zombie(Vector2f startPosition, String mobType, int health, int stamina) {
		this.position = startPosition;
		this.type = mobType;
		this.health = health;
		this.stamina = stamina;
		
		attacks.put("Punch", 1);
		attacks.put("Kick", 2);
	}
	
	public void attack() {
		int randAttack = rand.nextInt(attacks.size());
		
		while (inEngagement) {
			if (randAttack == 1) {
				punch();
			}
		}
	}

	// This is terrible code. There's gotta be a better way to handle enemy damage dealt without instantiating a bunch of shit #Stackoverflow
	private int punch() {
		Random damageRand = new Random();
		int damage = 0;
		
		enemyDamageTaken += damageRand.nextInt(10);
		damage = enemyDamageTaken;
		
		return damage;
	}

	// Getters and Setters
	
	public boolean isInEngagement() {
		return inEngagement;
	}

	public void setInEngagement(boolean inEngagement) {
		this.inEngagement = inEngagement;
	}

	public Vector2f getPosition() {
		return position;
	}

	public void setPosition(Vector2f position) {
		this.position = position;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public HashMap<String, Integer> getAttacks() {
		return attacks;
	}

	public void setAttacks(HashMap<String, Integer> attacks) {
		this.attacks = attacks;
	}

	public int getDamageTaken() {
		return damageTaken;
	}

	public void setDamageTaken(int damageTaken) {
		this.damageTaken = damageTaken;
	}
}
