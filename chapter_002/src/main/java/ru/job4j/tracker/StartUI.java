package ru.job4j.tracker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
* класс StartUI реализует интерфейс программы.
* @author abobrovitskiy.
*/
public class StartUI {
	public static void main(String[] args) throws IOException {
		boolean isExit = false;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Tracker tracker = new Tracker();
		ConsoleInput input = new ConsoleInput();
		while (!isExit) {
			System.out.println("0. Add new Item");
			System.out.println("1. Show all items");
			System.out.println("2. Edit item");
			System.out.println("3. Delete item");
			System.out.println("4. Find item by Id");
			System.out.println("5. Find items by name");
			System.out.println("6. Exit Program");
			String line = input.ask("Select: ");
			int choice = Integer.parseInt(line);
			if (choice == 0) {
				String name = input.ask("Enter name: ");
				String desc = input.ask("Enter description: ");
				String creat = input.ask("Enter create: ");
				long create = Long.parseLong(creat);
				Item item = new Item(name, desc, create);
				tracker.add(item);
			}
			if (choice == 1) {
				for (Item item : tracker.findAll()) {
					System.out.println(item);
				}
			}
			if (choice == 2) {
				String name = input.ask("Enter name: ");
				String desc = input.ask("Enter description: ");
				String creat = input.ask("Enter create: ");
				long create = Long.parseLong(creat);
				Item item = new Item(name, desc, create);
				tracker.update(item);
				System.out.println("Updated");
			}
			if (choice == 3) {
				String name = input.ask("Enter name: ");
				tracker.delete(tracker.findById((tracker.findByName(name).getId())));
				System.out.println("Deleted");
			}
			if (choice == 4) {
				String id = input.ask("Enter id: ");
				System.out.println(tracker.findById(id));
			}
			if (choice == 5) {
				String name = input.ask("Enter name: ");
				System.out.println(tracker.findByName(name));
			}
			if (choice == 6) {
				System.out.println("Exiting...");
				break;
			}

		}


	}
}
