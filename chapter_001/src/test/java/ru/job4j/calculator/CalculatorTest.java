package ru.job4j.calculator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Класс CalculatorTest - простые арифметические операции автотест.
* @author abobrovitskiy.
*/
public class CalculatorTest {
	/**
	* метод whenAddOnePlusOneThenTwo тест сложения.
	*/
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.add(1D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
	/**
	* метод whenSubOneMinOneThenTwo тест вычитания.
	*/
	public void whenSubOneMinOneThenTwo() {
		Calculator calc = new Calculator();
		calc.subtract(2D, 1D);
		double result = calc.getResult();
		double expected = 1D;
		assertThat(result, is(expected));
	}
	/**
	* метод whenDivOneOnOneThenTwo тест деления.
	*/
	public void whenDivOneOnOneThenTwo() {
		Calculator calc = new Calculator();
		calc.subtract(2D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
	/**
	* метод whenMultOneOnOneThenTwo тест умножения.
	*/
	public void whenMultOneOnOneThenTwo() {
		Calculator calc = new Calculator();
		calc.subtract(2D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
}