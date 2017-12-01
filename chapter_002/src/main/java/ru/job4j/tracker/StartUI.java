package ru.job4j.tracker;
import java.io.IOException;

/**
* класс StartUI реализует интерфейс программы.
* @author abobrovitskiy.
*/
public class StartUI {
	private Input input;
	public Tracker tracker;
	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	public void init() {
		MenuTracker menu = new MenuTracker(this.input, tracker);
		menu.fillActions();
		do {
			menu.show();
			int key = Integer.valueOf(input.ask("Select: "));
			menu.select(key);
		} while(! "y".equals(this.input.ask("Exit? y")));
}
	public static void main(String[] args) throws IOException {
		Tracker tracker = new Tracker();
		Input input = new ConsoleInput();
		new StartUI(input, tracker).init();
	}
}
