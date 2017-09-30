package ru.job4j.calculator;
/**
* Класс Calculator - простые арифметические операции.
* @author abobrovitskiy.
*/
public class Calculator {
	/**
	* result переменная типа double.
	*/
private double result;
	/**
	* метод add - сложение двух чисел.
	* @param first first.
	* @param second second.
	*/
public void add(double first, double second) {
	this.result = first + second;
}
	/**
	* метод subtract - вычитание одного числа из другого.
	* @param first first.
	* @param second second.
	*/
public void subtract(double first, double second) {
	this.result = first - second;
}
	/**
	* метод div - деление чисел.
	* @param first first.
	* @param second second.
	*/
public void div(double first, double second) {
	this.result = first / second;
}
	/**
	* метод multiple - сложение двух чисел.
	* @param first first.
	* @param second second.
	*/
public void multiple(double first, double second) {
	this.result = first * second;
}
	/**
	* метод getResult возвращает значение переменной result.
	* @return result result.
	*/
public double getResult() {
	return this.result;
}
}