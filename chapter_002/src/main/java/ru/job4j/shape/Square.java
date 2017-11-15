package ru.job4j.shape;
/**
* класс Square рисует квадрат.
* @author abobrovitskiy.
*/
public class Square implements Shape {
	@Override
	public String pic() {
		StringBuilder square = new StringBuilder();
		square.append("####");
		square.append(System.lineSeparator());
		square.append("#  #");
		square.append(System.lineSeparator());
		square.append("####");
		return square.toString();
	}
}