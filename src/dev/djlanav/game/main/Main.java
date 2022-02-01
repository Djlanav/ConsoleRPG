package dev.djlanav.game.main;

import java.util.Scanner;

import dev.djlanav.game.world.World;

public class Main {
	
	// Declare objects
	public static World world;
	
	private static String selectedName;
	
	private static void init() {
		world = new World();
		world.generateWorld();
		
		world.getPlayer().displayStats();
	}
	
	private static void setPlayerName() {
		Scanner nameScanner = new Scanner(System.in);
		System.out.print("\nWhat would you like the player's name to be? ");
		selectedName = nameScanner.nextLine();
		
		System.out.println();
		System.out.println("Your name is " + selectedName + "!\n\n");
	}
	
	private static void menu() {
		String choice;
		
		System.out.println("=== CONSOLERPG v0.0.0 ===");
		System.out.println("1. Start");
		System.out.println("2. Exit");
		
		Scanner menuScanner = new Scanner(System.in);
		System.out.print("\nSelect option: ");
		choice = menuScanner.nextLine();
		
		if (choice.equals("Start")) {
			setPlayerName();
			init();
		} else if (choice.equals("Exit")) {
			System.exit(0);
		} else {
			System.out.println("Invalid option");
		}
	}

	public static String getSelectedName() {
		return selectedName;
	}
	
	public static void main(String[] args) {
		menu();
	}
}
