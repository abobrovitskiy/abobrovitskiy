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
		this.actions[0] = new AddItem("", 0);
		this.actions[1] = new ShowAllItems("", 1);
		this.actions[2] = new UpdateItem("", 2);
		this.actions[3] = new DeleteItem("", 3);
		this.actions[4] = new FindItemById("", 4);
		this.actions[5] = new FindItemByName("", 5);
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
	private static class AddItem extends BaseAction {
		public int key() {
			return 0;
		}
		public AddItem(String name, int key) {
			super("AddItem", 0);
		}
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please enter the task name: ");
			String desc = input.ask("Please enter description: ");
			long create = Long.parseLong(input.ask("Please enter create: "));
			tracker.add(new Item(name, desc, create));
		}
		@Override
		public String info() {
			return super.info();
		}
	}
	private static class ShowAllItems extends BaseAction {
		public int key() {
			return 1;
		}
		public ShowAllItems(String name, int key) {
			super("ShowAllItems", 1);
		}
		public void execute(Input input, Tracker tracker) {
			for (Item item : tracker.findAll()) {
				System.out.println(String.format("%s. %s", item.getId(), item.getName())
				);
			}
		}
		@Override
		public String info() {
			return super.info();
		}
	}
	private static class UpdateItem extends BaseAction {
		public int key() {
			return 2;
		}
		public UpdateItem(String name, int key) {
			super("UpdateItem", 2);
		}
		public void execute(Input input, Tracker tracker) {
			String id = input.ask("Enter item id: ");
			String name = input.ask("Enter new name: ");
			String desc = input.ask("Enter new description: ");
			String creat = input.ask("Enter new create: ");
			long create = Long.parseLong(creat);
			Item item = new Item(name, desc, create);
			item.setId(id);
			tracker.update(item);
		}
		@Override
		public String info() {
			return super.info();
		}
	}
	private static class DeleteItem extends BaseAction {
		public int key() {
			return 3;
		}
		public DeleteItem(String name, int key) {
			super("DeleteItem", 3);
		}
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Enter name: ");
			tracker.delete(tracker.findById((tracker.findByName(name).getId())));
			System.out.println("Done!");
		}
		@Override
		public String info() {
			return super.info();
		}
	}
	private static class FindItemById extends BaseAction {
		public int key() {
			return 4;
		}
		public FindItemById(String name, int key) {
			super("FindItemById", 4);
		}
		public void execute(Input input, Tracker tracker) {
			String id = input.ask("Enter id: ");
			System.out.println(tracker.findById(id));
		}
		public String info() {
			return super.info();
		}
	}
	private static class FindItemByName extends BaseAction {
		public int key() {
			return 5;
		}
		public FindItemByName(String name, int key) {
			super("FindItemByName", 5);
		}
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Enter name: ");
			System.out.println(tracker.findByName(name));
		}
		public String info() {
			return super.info();
		}
	}
}