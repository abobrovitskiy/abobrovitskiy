package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * ArrayTest класс для тестирования метода mergeInt.
 */
public class ArrayTest {
    /**
     * метод whenHaveTwoArraysThenOneSortedArray проверяет метод mergeInt.
     */
    @Test
    public void whenHaveTwoArraysThenOneSortedArray() {
        Array array = new Array();
		int[] a1 = new int[] {1, 2, 3, 4};
		int[] a2 = new int[] {5, 6, 7, 8};
        int[] result = array.mergeInt(a1, a2);
		int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        assertThat(result, is(expected));
    }
}