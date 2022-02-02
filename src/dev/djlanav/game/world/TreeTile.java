package dev.djlanav.game.world;

import dev.djlanav.game.tools.Vector2f;

public class TreeTile extends Tile {

	private String woodType;
	
	// Break time is the amount of times the tile needs to be hit to yield resources
	public TreeTile(Vector2f position, int tileHP, String woodType) {
		super(position, tileHP);

		this.woodType = woodType;
	}

	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}
}
