package ru.job4j.array;
import java.util.Arrays;
/**
 * класс ArrayDuplicate для выведения на экран обратного массива.
 * @author abobrovitskiy.
 */
public class ArrayDuplicate {
    /**
     * метод remove удаляет дубликаты из массива.
     * @param array array.
     * @return array3 массив.
     */
    public String[] remove(String[] array) {
        int index = array.length;
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[index - 1];
                    index--;
                    j--;
                }
            }
            } return Arrays.copyOf(array, index);
        }
    }
