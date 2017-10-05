package ru.job4j.max;
/**
* Класс Max - для определения максимального из двух.
* @author abobrovitskiy.
*/
public class Max {
	/**
	* метод max максимальное их двух.
	* @param first first.
	* @param second second.
	* @return max maximum.
	*/
	public int max(int first, int second) {
	return first > second ? first : second;
	}
	/**
	* max максимальное из трех.
	* @param first first.
	* @param second second.
	* @param third third.
	* @return max maximum.
	*/
	public int max(int first, int second, int third) {
		return max(first, max(second, third));
	}

}