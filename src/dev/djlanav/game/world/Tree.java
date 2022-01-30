package dev.djlanav.game.world;

public class Tree extends Tile {
	
	private String woodType;
	
	// Break time is the amount of times the tile needs to be hit to yield resources
	public Tree(String tileType, int tileHP, String woodType) {
		super(tileType, tileHP);
		
		this.woodType = woodType;
	}

	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}
}
