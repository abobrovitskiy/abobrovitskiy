package ru.job4j.tracker;

public class MenuTracker {
	private Input input;
	private Tracker tracker;
	public UserAction[] actions = new UserAction[6];
	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	public void fillActions() {
		this.actions[0] = new AddItem();
		this.actions[1] = new ShowAllItems();
		this.actions[2] = new UpdateItem();
		this.actions[3] = new DeleteItem();
		this.actions[4] = new FindItemById();
		this.actions[5] = new FindItemByName();
	}
	public void select(int key) {
		this.actions[key].execute(this.input, this.tracker);
	}
	public void show() {
		for (UserAction action : this.actions) {
			if (action != null) {
				System.out.println(action.info());
			}
		}
	}
	private static class AddItem implements UserAction {
		public int key() {
			return 0;
		}
		public  void execute(Input input, Tracker tracker) {
			String name = input.ask("Please enter the task name: ");
			String desc = input.ask("Please enter description: ");
			long create = Long.parseLong(input.ask("Please enter create: "));
			tracker.add(new Item(name, desc, create));
		}
		public String info() {
			return String.format("%s. %s", this.key(), "Add the new item");
		}
	}
	private static class ShowAllItems implements UserAction {
		public int key() {
			return 1;
		}
		public  void execute(Input input, Tracker tracker) {
			for (Item item : tracker.findAll()) {
				System.out.println(String.format("%s. %s", item.getId(), item.getName())
				);
			}
		}
		public String info() {
			return String.format("%s. %s", this.key(), "Show all items");
		}
	}
	private static class UpdateItem implements UserAction {
		public int key() {
			return 2;
		}
		public  void execute(Input input, Tracker tracker) {
			String id = input.ask("Enter item id: ");
			String name = input.ask("Enter new name: ");
			String desc = input.ask("Enter new description: ");
			String creat = input.ask("Enter new create: ");
			long create = Long.parseLong(creat);
			Item item = new Item(name, desc, create);
			item.setId(id);
			tracker.update(item);
		}
		public String info() {
			return String.format("%s. %s", this.key(), "Update item");
		}
	}
	private static class DeleteItem implements UserAction {
		public int key() {
			return 3;
		}
		public  void execute(Input input, Tracker tracker) {
			String name = input.ask("Enter name: ");
			tracker.delete(tracker.findById((tracker.findByName(name).getId())));
			System.out.println("Done!");
		}
		public String info() {
			return String.format("%s. %s", this.key(), "Delete item");
		}
	}
	private static class FindItemById implements UserAction {
		public int key() {
			return 4;
		}
		public  void execute(Input input, Tracker tracker) {
			String id = input.ask("Enter id: ");
			System.out.println(tracker.findById(id));
		}
		public String info() {
			return String.format("%s. %s", this.key(), "Find item by Id");
		}
	}
	private static class FindItemByName implements UserAction {
		public int key() {
			return 5;
		}
		public  void execute(Input input, Tracker tracker) {
			String name = input.ask("Enter name: ");
			System.out.println(tracker.findByName(name));
		}
		public String info() {
			return String.format("%s. %s", this.key(), "Find item by Name");
		}
	}
}