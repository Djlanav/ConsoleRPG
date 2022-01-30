package dev.djlanav.game.world;

public abstract class Tile {
	
	private String tileType;
	private int tileHP;
	
	public Tile(String tileType, int tileHP) {
		this.tileHP = tileHP;
		this.tileType = tileType;
	}

	public String getTileType() {
		return tileType;
	}

	public void setTileType(String tileType) {
		this.tileType = tileType;
	}

	public int getTileHP() {
		return tileHP;
	}

	public void setTileHP(int tileHP) {
		this.tileHP = tileHP;
	}
}
