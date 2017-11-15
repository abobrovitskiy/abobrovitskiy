package ru.job4j.shape;
/**
* класс Triangle рисует треугольник.
* @author abobrovitskiy.
*/
public class Triangle implements Shape {
	@Override
	public String pic() {
		StringBuilder triangle = new StringBuilder();
		triangle.append("   ^");
		triangle.append(System.lineSeparator());
		triangle.append("  ^^^");
		triangle.append(System.lineSeparator());
		triangle.append(" ^^^^^");
		triangle.append(System.lineSeparator());
		triangle.append("^^^^^^^");
		return triangle.toString();
	}
}