package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
/**
* Класс TriangleTest - для тестирования методов класса Triangle.
* @author abobrovitskiy.
*/
public class TriangleTest {
	/**
	* метод whenSetTwoPointThenGetDistance проверяет расчет расстояния от точки left до точки right.
	*/
    @Test
public void whenSetTwoPointsThenGetDistance() {
	// задаем две точки.
	Point left = new Point(0, 0);
	Point right = new Point(0, 2);
	// Создаем объект треугольник и передаем в него объекты точек.
	Triangle triangle = new Triangle(left, right);
	// Вычисляем расстояние.
	double result = triangle.distance(left, right);
	// Задаем ожидаемый результат.
	double expected = 2D;
	//Проверяем результат и ожидаемое значение.
	assertThat(result, closeTo(expected, 0.236));
}
	/**
	* метод whenSetThreeDistanceThenGetPeriod получает расстояние между точками и считает периметр.
	*/
public void whenSetThreeDistanceThenGetPeriod() {
	// создаем три объекта класса Point.
	double ab = 1D;
	double ac = 2D;
	double bc = 2D;
	// Создаем объект треугольник и передаем в него объекты точек.
	Triangle triangle = new Triangle();
	// Вычисляем периметр.
	double result = triangle.period(ab, ac, bc);
	// Задаем ожидаемый результат.
	double expected = 2.5D;
	//Проверяем результат и ожидаемое значение.
	assertThat(result, closeTo(expected, 0.1));
	}
	/**
	* метод whenAreaSetThreePointsThenTriangleArea получает три точки и считает площадь треугольника.
	*/
public void whenAreaSetThreePointsThenTriangleArea() {
	// создаем три объекта класса Point.
	Point a = new Point(0, 0);
	Point b = new Point(0, 2);
	Point c = new Point(2, 0);
	// Создаем объект треугольник и передаем в него объекты точек.
	Triangle triangle = new Triangle(a, b, c);
	// Вычисляем площадь.
	double result = triangle.area();
	// Задаем ожидаемый результат.
	double expected = 2D;
	//Проверяем результат и ожидаемое значение.
	assertThat(result, closeTo(expected, 0.1));
	}
	/**
	* метод whenSetDistanceThenGetTrueOrFalse проверяет возможность построить треугольник по точкам.
	*/
public void whenSetDistanceThenGetTrue() {
	// создаем три объекта класса Point.
	Point a = new Point(0, 0);
	Point b = new Point(0, 2);
	Point c = new Point(2, 0);
	// Создаем объект треугольник и передаем в него объекты точек.
	Triangle triangle = new Triangle(a, b, c);
	double ab = triangle.distance(triangle.a, triangle.b);
	double ac = triangle.distance(triangle.a, triangle.c);
	double bc = triangle.distance(triangle.b, triangle.c);
	boolean result = triangle.exist(ab, ac, bc);
	assertThat(result, is(true));
}
}