package ru.job4j.shape;
/**
* класс Paint рисует фигуру.
* @author abobrovitskiy.
*/
public class Paint {
	Shape shape;
	/**
	* сеттер для Shape.
	* @param shape shape.
	*/
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public String draw() {
		return shape.pic();
	}
}