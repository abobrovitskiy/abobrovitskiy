package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* FactorialTest метод для тестирования класса Factorial.
*/
public class FactorialTest {
	/**
	 * метод whenNFiveThanResult выводит факториал числа 5.
	 */
	@Test
	public void whenNFiveThanResult() {
		Factorial fact = new Factorial();
		int result = fact.calc(5);
		assertThat(result, is(120));
	}
	/**
	 * метод whenNZeroThanResult выводит факториал числа 0.
	 */
	@Test
	public void whenNZeroThanResult() {
		Factorial fact = new Factorial();
		int result = fact.calc(0);
		assertThat(result, is(1));
	}
}