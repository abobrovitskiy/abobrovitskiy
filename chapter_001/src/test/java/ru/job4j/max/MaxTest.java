package ru.job4j.max;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* MaxTest метод для тестирования класса Max.
*/
public class MaxTest {
	/**
	* метод whenFirstLessSecond когда первое число меньше второго.
	*/
	@Test
	public void whenFirstLessSecond() {
		Max maxim = new Max();
		int result = maxim.max(1, 2);
		assertThat(result, is(2));
	}
	/**
	* метод whenFirstBiggerSecond когда первое число больше второго.
	*/
	@Test
	public void whenFirstBiggerSecond() {
		Max maxim = new Max();
		int result = maxim.max(2, 1);
		assertThat(result, is(2));
	}
	/**
	* метод whenOneBeggerThenOther находит большее из трех чисел.
	*/
	@Test
	public void whenOneBeggerThenOther() {
		Max maxim = new Max();
		int result = maxim.max(1, 2, 3);
		assertThat(result, is(3));
	}
}