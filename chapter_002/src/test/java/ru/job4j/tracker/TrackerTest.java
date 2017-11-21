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
		tracker.add(item);
		tracker.add(item2);
		tracker.delete(item);
		assertThat(tracker.findById(item2.getId()), is(item2));
	}
	/**
	* метод whenUpdateNameThenReturnNewName обновляет данные в заявке.
	*/
	@Test
	public void whenUpdateNameThenReturnNewName() {
		Tracker tracker = new Tracker();
		Item previous = new Item("test1", "testDescription", 123L);
		tracker.add(previous);
		Item next = new Item("test2", "testDescription2", 1234L);
		next.setId(previous.getId());
		tracker.update(next);
		assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
	}
	/**
	* метод whenFindAllItemsThenGetAllItems ищет все элементы в массиве.
	*/
	@Test
	public void whenFindAllItemsThenGetAllItems() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123L);
		Item item2 = new Item("test2", "testDescription", 124L);
		Item[] result = new Item[2];
		tracker.add(item);
		tracker.add(item2);
		result[0] = item;
		result[1] = item2;
		assertThat(tracker.findAll(), is(result));
	}
	/**
	* метод whenFindByNameThenGetItem ищет элементы в массиве по имени.
	*/
	@Test
	public void whenFindByNameThenGetItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123L);
		Item item2 = new Item("test2", "testDescription", 124L);
		Item[] result = new Item[2];
		tracker.add(item);
		tracker.add(item2);
		result[0] = item;
		result[1] = item2;
		assertThat(tracker.findByName("test1"), is(result[0]));
	}
	/**
	* метод whenFindByIdThenGetItemById ищет элементы в массиве по Id.
	*/
	@Test
	public void whenFindByIdThenGetItemById() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123L);
		Item item2 = new Item("test2", "testDescription", 124L);
		Item[] result = new Item[2];
		tracker.add(item);
		tracker.add(item2);
		result[0] = item;
		result[1] = item2;
		assertThat(tracker.findById(item.getId()), is(item));
	}
}