package ru.job4j.array;
/**
 * класс Turn для выведения на экран обратного массива.
 * @author abobrovitskiy.
 */
public class RotateArray {
    /**
     * метод rotate переворачивает массив.
     * @param array array.
	 * @param n размер матрицы.
     * @return array массив.
     */
    public int[][] rotate(int[][] array, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int tmp = array[i][j];
                array[i][j] = array[n - j - 1][i];
                array[n - j - 1][i] = array[n - i - 1][n - j - 1];
                array[n - i - 1][n - j - 1] = array[j][n - i - 1];
                array[j][n - i - 1] = tmp;
            }
        } return array;
    }
}
