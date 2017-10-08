package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* TurnTest класс для тестирования метода back.
*/
public class BubbleSortTest {
	/**
	* метод whenTurnArrayWithEvenAmountOfElementsThenTurnedArray проверяет метод back.
	* четное число элементов.
	*/
	@Test
	public void whenSortArrayWithTenElementsThenSortedArray() {
		BubbleSort bubble = new BubbleSort();
		int[] mass = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		int[] result = bubble.sort(mass);
		assertThat(result, is(expected));
    }
}