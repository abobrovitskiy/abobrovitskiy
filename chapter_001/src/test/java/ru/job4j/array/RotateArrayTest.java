package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * RotateArrayTest класс для тестирования метода rotate.
 */
public class RotateArrayTest {
    /**
     * метод whenRotateTwoRowTwoColArrayThenRotatedArray проверяет метод rotate.
     * матрица 2х2.
     */
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray rotar = new RotateArray();
        int n = 2;
        int countForIn = 1;
        int[][] in = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                in[i][j] = countForIn;
                countForIn++;
            }
        }
        int[][] result = rotar.rotate(in, n);
        int[][] expected = new int[n][n];
        int countForExpected = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                expected[j][n - i - 1] = countForExpected;
                countForExpected++;
            }
        }
        assertThat(result, is(expected));

    }
    /**
     * метод whenRotateThreeRowThreeColArrayThenRotatedArray проверяет метод rotate.
     * матрица 3х3.
     */
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray rotar = new RotateArray();
        int n = 3;
        int countForIn = 1;
        int[][] in = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                in[i][j] = countForIn;
                countForIn++;
            }
        }
        int[][] result = rotar.rotate(in, n);
        int[][] expected = new int[n][n];
        int countForExpected = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                expected[j][n - i - 1] = countForExpected;
                countForExpected++;
            }
        }
        assertThat(result, is(expected));

    }
}
