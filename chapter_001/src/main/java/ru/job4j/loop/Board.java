package ru.job4j.loop;
/**
* класс Board для выведения на экран шахматной доски.
* @author abobrovitskiy.
*/
public class Board {
	/**
	 * метод paint рисует доску.
	 * @param width  ширина доски.
	 * @param height высота доски.
	 * @return string результат выведенный в строку.
	 */
	public String paint(int width, int height) {
		StringBuilder string = new StringBuilder();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if ((i + j) % 2 == 0) {
					string.append("X");
				}
				if ((i + j) % 2 != 0) {
					string.append(" ");
				}
			}
			string.append("\r\n");
		} return string.toString();
	}
}
