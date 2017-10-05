package ru.job4j.loop;
/**
* класс Factorial для подсчета факториала числа.
* @author abobrovitskiy.
*/
public class Factorial {
	/**
	* метод calc умножает.
	* @param n n.
	* @return num факториал.
	*/
	public int calc(int n) {
		int num = 1;
		for (int i = 1; i <= n; i++) {
			num = num * i;
			}
		return num;
		}

}