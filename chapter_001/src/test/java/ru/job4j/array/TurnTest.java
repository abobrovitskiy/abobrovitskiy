package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* TurnTest класс для тестирования метода back.
*/
public class TurnTest {
	/**
	* метод whenTurnArrayWithEvenAmountOfElementsThenTurnedArray проверяет метод back.
	* четное число элементов.
	*/
	@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] mass = {1, 2, 3, 4};
		int[] expected = {4, 3, 2, 1};
		int[] result = turn.back(mass);
		assertThat(result, is(expected));
    }
    /**
     * метод whenTurnArrayWithOddAmountOfElementsThenTurnedArray проверяет метод back.
     * нечетное число элементов.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] mass = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] result = turn.back(mass);
        assertThat(result, is(expected));
    }
}