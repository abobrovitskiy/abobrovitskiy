package ru.job4j.array;
/**
* класс Turn для выведения на экран обратного массива.
* @author abobrovitskiy.
*/
public class Turn {
	/**
	* метод back переворачивает массив.
	* @param array array.
	* @return array массив.
	*/
	public int[] back(int[] array) {
		int tmp = 0;
		for (int i = 0; i <= (array.length - 1) / 2; i++) {
			tmp = array[array.length - i - 1];
			array[array.length - i - 1] = array[i];
			array[i] = tmp;
		}
		return array;
	}
}