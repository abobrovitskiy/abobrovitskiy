package ru.job4j.tracker;
import java.util.Random;
/**
* класс Tracker трекер система.
* @author abobrovitskiy.
*/
public class Tracker {
	/** Item массив заявок. */
	private Item[] items = new Item[100];
	/** счетчик массива. */
	private int position = 0;
	/** генератор id. */
	private static final Random RN = new Random();
	/**
	* метод add добавляет Item в массив.
	* @param item item.
	* @return item элемент массива.
	*/
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		System.out.println("Item id: " + item.getId() + " Item name: " + item.getName());
		return item;
	}
	/**
	* метод update обновляет Item в массив.
	* @param item item.
	*/
	public void update(Item item) {
		for (int index = 0; index != this.position; index++) {
			if (items[index].getId().equals(item.getId())) {
				this.items[index] = item;
				System.out.println("Done!");
				break;
			}
		}
	}
	/**
	* метод delete удаляет Item в массиве.
	* @param item item.
	*/
	public void delete(Item item) {
		int k;
		int index;
		for (index = 0; index != this.position; index++) {
			if (this.items[index].getId().equals(item.getId())) {
				this.items[index] = null;
				break;
			}
		}
		/**
		for (k = index; k != this.position; k++) {
			this.items[k] = this.items[k + 1];
		}
		Item[] deleteArr = new Item[k - 1];
		System.arraycopy(items, 0, deleteArr, 0, k - 1);
		*/
	}
	/**
	* метод findAll выводит все элементы массива.
	* @return result элементы массива.
	*/
	public Item[] findAll() {
		Item[] result = new Item[this.position];
		for (int index = 0; index != this.position; index++) {
			result[index] = this.items[index];
		}
		return result;
	}
	/**
	* метод findByName выводит искомый элемент массива.
	* @param key key.
	* @return result элементы массива.
	*/
	public Item findByName(String key) {
		Item[] result = new Item[this.position];
		int index;
		for (index = 0; index != this.position; index++) {
			if (this.items[index] != null && this.items[index].getName().equals(key)) {
				result[index] = this.items[index];
				break;
			}
		}
		return result[index];
	}
	/**
	* метод findById выводит искомый элемент массива.
	* @param id id.
	* @return result элементы массива.
	*/
	public Item findById(String id) {
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				System.out.println("Find by Id: Done!");
				break;
			}
		}
		return result;
	}
	/**
	* метод generateId генерирует id для элемента.
	* @return id элемента массива.
	*/
	String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}
}