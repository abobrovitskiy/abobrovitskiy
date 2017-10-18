package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* PrivetTest класс для тестирования метода substring.
*/
public class PrivetTest {
	/**
	* метод whenSubstringIsStringThenReturnTrue проверяет метод substring.
	* входит ли подстрока в строку.
	*/
	@Test
	public void whenSubstringIsStringThenReturnTrue() {
		Privet privet = new Privet();
		String origin = "Привет";
		String substring = "иве";
		boolean result = privet.substring(origin, substring);
		assertThat(result, is(true));
    }
}