package ru.job4j.tracker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
* класс StartUI реализует интерфейс программы.
* @author abobrovitskiy.
*/
public class StartUI {
	private Input input;
	public Tracker tracker;
	private static final int ADD = 0;
	private static final int ALL = 1;
	private static final int UPD = 2;
	private static final int DEL = 3;
	private static final int FID = 4;
	private static final int FNM = 5;
	private static final int EXIT = 6;
	private boolean isExit = false;
	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	public void showMenu() {
		System.out.println("0. Add new Item");
		System.out.println("1. Show all items");
		System.out.println("2. Update item");
		System.out.println("3. Delete item");
		System.out.println("4. Find item by Id");
		System.out.println("5. Find items by name");
		System.out.println("6. Exit Program");
	}
	public void addItem() {
		String name = input.ask("Enter name: ");
		String desc = input.ask("Enter description: ");
		String creat = input.ask("Enter create: ");
		long create = Long.parseLong(creat);
		Item item = new Item(name, desc, create);
		tracker.add(item);
	}
	public void updItem() {
		String id = input.ask("Enter item id: ");
		String name = input.ask("Enter new name: ");
		String desc = input.ask("Enter new description: ");
		String creat = input.ask("Enter new create: ");
		long create = Long.parseLong(creat);
		Item item = new Item(name, desc, create);
		item.setId(id);
		tracker.update(item);
		System.out.println("Updated");
	}
	public void delItem() {
		String name = input.ask("Enter name: ");
		tracker.delete(tracker.findById((tracker.findByName(name).getId())));
		System.out.println("Deleted");
	}
	public void findById() {
		String id = input.ask("Enter id: ");
		System.out.println(tracker.findById(id));
	}
	public void showAll() {
		for (Item item : tracker.findAll()) {
			System.out.println(item);
		}
	}
	public void findByName() {
		String name = input.ask("Enter name: ");
		System.out.println(tracker.findByName(name));
	}
	public void init() {
		while (!isExit) {
			this.showMenu();
			String line = input.ask("Select: ");
			int choice = Integer.parseInt(line);
			if (ADD == choice) {
				this.addItem();
			}
			if (ALL == choice) {
				this.showAll();
			}
			if (UPD == choice) {
				this.updItem();
			}
			if (DEL == choice) {
				this.delItem();
			}
			if (FID == choice) {
				this.findById();
			}
			if (FNM == choice) {
				this.findByName();
			}
			if (EXIT == choice) {
				System.out.print("Exiting...");
				isExit = true;
				break;
			}
		}
}
	public static void main(String[] args) throws IOException {
		Tracker tracker = new Tracker();
		new StartUI(new ConsoleInput(), tracker).init();
	}
}
