package dev.djlanav.game.main;

import java.util.Scanner;

import dev.djlanav.game.entities.Player;
import dev.djlanav.game.tools.Vector2f;

public class Main {
	
	// Declare objects
	public static Player player;
	
	private static String selectedName;
	
	private static void init() {
		player = new Player(new Vector2f(0, 0), selectedName, 100, 100, 100);
		System.out.println(player.getName());
	}
	
	private static void setPlayerName() {
		Scanner nameScanner = new Scanner(System.in);
		System.out.print("\nWhat would you like the player's name to be? ");
		selectedName = nameScanner.nextLine();
		
		System.out.println();
		System.out.println("Your name is " + selectedName + "!\n");
	}
	
	private static void menu() {
		String choice;
		
		System.out.println("=== TEST GAME ===");
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
	
	public static void main(String[] args) {
		menu();
	}
}
