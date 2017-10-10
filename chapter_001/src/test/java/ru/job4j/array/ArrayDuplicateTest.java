package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
/**
 * ArrayDuplicateTest класс для тестирования метода remove.
 */
public class ArrayDuplicateTest {
    /**
     * метод whenRemoveDuplicatesThenArrayWithoutDuplicate проверяет метод remove.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arr = new ArrayDuplicate();
        String[] in =  {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] expected = {"Привет", "Мир", "Супер"};
        String[] result = arr.remove(in);
        assertThat(result, arrayContainingInAnyOrder(expected));
    }
}