package dev.djlanav.game.world;

public abstract class Tile {
	
	private String tileType;
	private int breakTime;
	private int tileHP;
	
	public Tile(String tileType, int breakTime, int tileHP) {
		this.breakTime = breakTime;
		this.tileHP = tileHP;
		this.tileType = tileType;
	}

	public String getTileType() {
		return tileType;
	}

	public void setTileType(String tileType) {
		this.tileType = tileType;
	}

	public int getBreakTime() {
		return breakTime;
	}

	public void setBreakTime(int breakTime) {
		this.breakTime = breakTime;
	}

	public int getTileHP() {
		return tileHP;
	}

	public void setTileHP(int tileHP) {
		this.tileHP = tileHP;
	}
}
