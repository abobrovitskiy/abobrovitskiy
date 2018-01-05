package ru.job4j.Collections.Converter;

import java.util.ArrayList;
import java.util.List;

/**
 * класс ConverterList преобразует массив в список и наоборот.
 */
public class ConverterList {
    /**
     * метод toList преобразует массив в список.
     * @param array array.
     * @return list.
     */
    public List<Integer> toList (int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] arr : array) {
            for (int i : arr) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * метод toArray преобразует список в массив
     * @param list список.
     * @param rows количество строк на которые нужо разбить список.
     * @return ints.
     */
    public int[][] toArray (List<Integer> list, int rows) {
        int[][] ints = new int[rows][];
        int columns;

        if (list.size() % rows == 0) {
            columns = list.size() / rows;
        } else {
            columns = (list.size() / rows) + 1;
        }

        int column = 0;
        int row = 0;
        ints[row] = new int[columns];

        for (Integer item: list) {
            item = item == null ? 0 : item;
            if (column < columns) {
                ints[row][column++] = item;
            } else {
                column = 0;
                ints[++row] = new int[columns];
                ints[row][column++] = item;
            }
        }

        while (column < columns) {
            ints[row][column++] = 0;
        }

        return ints;

    }

    /**
     * метод convert объединяет элементы из разных списков в один список.
     * @param list входной список массивов.
     * @return generalList.
     */
    public List<Integer> convert(List<int[]> list) {
        List<Integer> generalList = new ArrayList<>();
        for (int[] ints: list) {
            for (int i : ints) {
                generalList.add(i);
            }
        }
        return generalList;
    }
}
