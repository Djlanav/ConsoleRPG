package dev.djlanav.game.world;

import java.util.LinkedList;
import java.util.Random;

import dev.djlanav.game.entities.Player;
import dev.djlanav.game.main.Main;
import dev.djlanav.game.tools.Vector2f;

public class World {
	
	private Player player = new Player(new Vector2f(0, 0), Main.getSelectedName(), 100, 100, 100);
	
	private String[] woodTypes = { "Oak", "Birch" };

	// The world will be 2 ^ 32 tiles up and down, as well as 2 ^ 32 from left to right. So, you can go 2^32 tiles in any given direction before reaching the end
	private static final int WIDTH = (int) Math.pow(2, 32);
	private static final int HEIGHT = (int) Math.pow(2, 32);
	
	private static final int VIEW_DISTANCE = (WIDTH / HEIGHT + 2) * 12; // Optimization purposes :)
	
	private Random rand = new Random();
	private LinkedList<Tile> tiles = new LinkedList<Tile>();
	
	public void generateWorld() {
		System.out.println("Generating world...\n");
		
		System.out.println("Generating tree tiles...\n");
		for (int i = 0; i < Math.round(VIEW_DISTANCE / 2) - 1; i++) {
			tiles.add(new TreeTile(new Vector2f(rand.nextInt(WIDTH), rand.nextInt(HEIGHT)), 100, woodTypes[rand.nextInt(woodTypes.length)]));
		}
		
		System.out.println("Generating grass tiles...\n");
		for (int i = 0; i < Math.round(VIEW_DISTANCE / 2 - 1) * 2; i++) {
			tiles.add(new GrassTile(new Vector2f(rand.nextInt(WIDTH), rand.nextInt(HEIGHT)), 100));
		}
		
		System.out.println("Checking positions for overlapping...\n");
		for (int i = 0; i < tiles.size(); i++) { 
			if (tiles.get(i).getPosition() == tiles.get(i).getPosition()) {
				tiles.get(i).setPosition(new Vector2f(rand.nextInt(WIDTH), rand.nextInt(HEIGHT)));
			}
		}
		
		System.out.println("Done!");
	}

	public Player getPlayer() {
		return player;
	}
}
