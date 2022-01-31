package dev.djlanav.game.world;

import dev.djlanav.game.tools.Vector2f;

public abstract class Tile {
	
	private Vector2f position;
	private int tileHP;
	
	public Tile(Vector2f position, int tileHP) {
		this.setPosition(position);
		this.tileHP = tileHP;
	}

	public int getTileHP() {
		return tileHP;
	}

	public void setTileHP(int tileHP) {
		this.tileHP = tileHP;
	}

	public Vector2f getPosition() {
		return position;
	}

	public void setPosition(Vector2f position) {
		this.position = position;
	}
}
