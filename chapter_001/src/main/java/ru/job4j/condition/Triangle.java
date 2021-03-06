package ru.job4j.condition;
/**
* Класс Triangle вычисление площади треугольника.
* @author abobrovitskiy.
*/
public class Triangle {
	/**
	* точка a.
	* class Point из предыдущего задания.
	*/
	private Point a;
	/**
	* точка b.
	* class Point из предыдущего задания.
	*/
	private Point b;
	/**
	* точка c.
	* class Point из предыдущего задания.
	*/
	private Point c;
	/**
	* Метод Triangle задает три точки.
	* @param a Point a.
	* @param b Point b.
	* @param c Point c.
	*/
   public Triangle(Point a, Point b, Point c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }

/**
* Метод должен вычислять расстояние между точками left и right.
*
* Для вычисления расстояния использовать формулу.
* √(xb - xa)^2 + (yb - ya)^2
*
* где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
*
* ^ - степень.
*
* @param left Точка слева
* @param right Точка с права.
* @return расстояние между точками left и right.
*/
public double distance(Point left, Point right) {
    return Math.sqrt((right.getX() - left.getX()) ^ 2 + (right.getY() - left.getY()) ^ 2);
}

/**
* Метод вычисления периметра по длинам сторон.
*
* Формула.
*
* (ab + ac + bc) / 2
*
* @return Периметр.
*/
public double period() {
    double ab = this.distance(this.a, this.b);
    double ac = this.distance(this.a, this.c);
	double bc = this.distance(this.b, this.c);
	return (ab + ac + bc) / 2;
}

/**
* Метод должен вычислить прощадь треугольканива.
*
* Формула.
*
* √ p *(p - ab) * (p - ac) * (p - bc)
*
* где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
*
* @return Вернуть прощадь, если треугольник существует или -1.
*/
public double area() {
    double rsl = -1;
    double ab = this.distance(this.a, this.b);
    double ac = this.distance(this.a, this.c);
    double bc = this.distance(this.b, this.c);
    double p = this.period();
    if (this.exist(ab, ac, bc)) {
		rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
    }
    return rsl;
}

/**
* Метод проверяет можно ли построить треугольник с такими длинами сторон.
* Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
* @param ab Длина от точки a b.
* @param ac Длина от точки a c.
* @param bc Длина от точки b c.
* @return false.
*/
public boolean exist(double ab, double ac, double bc) {
	boolean t = false;
	if ((ab + ac > bc) & (ab + bc > ac) & (ac + bc > ab)) {
		t = true;
	}
	return t;
}
}