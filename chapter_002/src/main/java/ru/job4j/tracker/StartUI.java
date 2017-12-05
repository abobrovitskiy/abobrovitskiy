package ru.job4j.tracker;
import java.io.IOException;

/**
* класс StartUI реализует интерфейс программы.
* @author abobrovitskiy.
*/
public class StartUI {
	private int[] ranges = new int [] {0, 1, 2, 3, 4, 5};
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
			menu.select(input.ask("select:", ranges));
			menu.select(input.ask("select:", );
		} while(! "y".equals(this.input.ask("Exit? y")));
}
	public static void main(String[] args) throws IOException {
		Tracker tracker = new Tracker();
		Input input = new ValidateInput();
		new StartUI(input, tracker).init();
	}
}
