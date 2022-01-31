package dev.djlanav.game.playerutils;

import java.util.LinkedList;
import java.util.Scanner;

import dev.djlanav.game.items.Item;
import dev.djlanav.game.items.StoneSword;

public class Inventory {
	
	private LinkedList<Item> items = new LinkedList<>();
	private String currentlySelectedItem;
	
	public void selectItem() {
		displayInv();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter item: ");
		setCurrentlySelectedItem(scanner.nextLine());
	}
	
	public void addItem(Item addedItem) {
		items.add(addedItem);
	}
	
	public void displayInv() {
		for (Item item : items) {
			System.out.println(item + ",");
		}
	}

	public String getCurrentlySelectedItem() {
		return currentlySelectedItem;
	}

	public void setCurrentlySelectedItem(String currentlySelectedItem) {
		this.currentlySelectedItem = currentlySelectedItem;
	}
}
