package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* CounterTest метод для тестирования класса Counter.
*/
public class CounterTest {
	/**
	 * метод whenFromOneThanToTen суммирует четные от 1 до 10.
	 */
	@Test
	public void whenFromOneThanToTen() {
		Counter count = new Counter();
		int result = count.add(1, 10);
		assertThat(result, is(30));
	}
}