package ru.job4j.loop;
/**
* класс Counter для подсчета суммы четныз чисел.
* @author abobrovitskiy.
*/
public class Counter {
	/**
	* метод add суммирует четные от first, до second.
	* @param start start.
	* @param finish finish.
	* @return num сумма чисел.
	*/
	public int add(int start, int finish) {
		int num = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				num = num + i;
			}
			}
		return num;
		}

}