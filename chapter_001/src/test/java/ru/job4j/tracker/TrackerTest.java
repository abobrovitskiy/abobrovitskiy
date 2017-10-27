package ru.job4j.tracker;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
/**
* Класс TrackerTest - тестирование класса Tracker.
* @author abobrovitskiy.
*/
public class TrackerTest {
	/**
	* метод whenAddNewItemThenTrackerHasSameItem добавляем элемент в массив.
	*/
	@Test
	public void whenAddNewItemThenTrackerHasSameItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123L);
		tracker.add(item);
		assertThat(tracker.findAll()[0], is(item));
	}
	/**
	* метод whenDeleteItemThenItemNull удаляем элемент из массива.
	*/
	@Test
	public void whenDeleteItemThenItemNull() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123L);
		Item item2 = new Item("test2", "testDescription", 124L);
		//Item item3 = new Item("test3", "testDescription", 125L);
		tracker.add(item);
		tracker.add(item2);
		tracker.delete(item);
		assertThat(tracker.findAll(), is(item2));
		//assertEquals(item2, tracker.findByName("item2"));
	}
}