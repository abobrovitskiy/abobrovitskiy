package ru.job4j.condition;
/**
* Класс Point - для определения принадлежности точки к функции.
* @author abobrovitskiy.
*/
public class Point {
	/**
	* переменная x.
	*/
private int x;
	/**
	* переменная y.
	*/
private int y;
   /**
	* метод Point установим координаты.
	* @param x x.
	* @param y y.
	*/
	public Point(int x, int y) {
    this.x = x;
    this.y = y;
	}
	/**
	* метод getX возвращает x.
	* @return x x.
	*/
	public int getX() {
	return this.x;
	}
	/**
	* метод getY возвращает y.
	* @return y y.
	*/
	public int getY() {
	return this.y;
	}
	/**
	* метод is проверяет если a равно b.
	* @return boolean true или false.
	* @param a a.
	* @param b b.
	*/
	public boolean is(int a, int b) {
	return y - b == a * x ? true : false;
	}
}