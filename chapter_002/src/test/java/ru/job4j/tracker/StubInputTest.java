package ru.job4j.tracker;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
/**
* StubInputTest класс для тестирования метода StubInput.
*/

public class StubInputTest {
	@Test
	public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
		Tracker tracker = new Tracker();
		Input input = new StubInput(new String[]{"0", "test name", "desc", "123", "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.findAll()[0].getName(), is("test name"));
	}
	@Test
	public void whenUpdateThenTrackerHasUpdatedValue() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test1", "testDescription", 123L));
		Input input = new StubInput(new String[]{"2", "test", "desc", "123", "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.findById(item.getId()).getName(), is("test"));
	}
	@Test
	public void whenEnterIdThenFindById() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test1", "testDescription", 123L));
		Input input = new StubInput(new String[]{"4", item.getId(), "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.findById(item.getId()), is(item));
	}
}