package ru.job4j.array;
/**
* класс Turn для выведения на экран обратного массива.
* @author abobrovitskiy.
*/
public class BubbleSort {
	/**
	* метод back переворачивает массив.
	* @param array array.
	* @return array массив.
	*/
	public int[] sort(int[] array) {
		for (int i = (array.length - 1); i > 0; i--) {
		    for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
		}
		return array;
	}
}