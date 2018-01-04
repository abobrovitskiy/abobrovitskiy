package ru.job4j.Collections.Converter;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 *  метод ConverterListTest тестирует класс ConverterList.
 */
public class ConverterListTest {
    @Test
    /**
     * метод whenInArrayThenOutList тестирует преобразование массива в список.
     */
    public void whenInArrayThenOutList() {
        ConverterList clist = new ConverterList();
        int[][] ints = {{1, 2, 3, 4}, {5}};
        List<Integer> result = clist.toList(ints);
        List<Integer> expected = new ArrayList<>(
                Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        assertThat(result, is(expected));
    }
    @Test
    /**
     * метод whenInListThenOutArray тестирует преобразование списка в массив
     * с разбиением на строки
     */
    public void whenInListThenOutArray() {
        ConverterList clist = new ConverterList();
        List<Integer> list = new ArrayList<>(
                Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        int[][] result = clist.toArray(list, 3);
        int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 0, 0}};

        assertThat(result, is(expected));
    }
}