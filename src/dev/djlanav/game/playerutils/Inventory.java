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
		for (int i = 0; i < items.size(); i++) {
			if (items.size() == 1) {
				System.out.println(items.get(i).getName());
				break;
			} else if (items.size() > 1) {
				System.out.println(items.get(i).getName() + ", ");
			}
		}
	}

	public String getCurrentlySelectedItem() {
		return currentlySelectedItem;
	}

	public void setCurrentlySelectedItem(String currentlySelectedItem) {
		this.currentlySelectedItem = currentlySelectedItem;
	}

	public LinkedList<Item> getItems() {
		return items;
	}
}
