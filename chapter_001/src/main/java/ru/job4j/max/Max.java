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
	int maximum = first > second ? first : second;
	return maximum;
	}
}