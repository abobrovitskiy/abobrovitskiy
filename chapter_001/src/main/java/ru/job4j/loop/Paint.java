package ru.job4j.loop;
/**
* класс Paint для выведения на экран шахматной доски.
* @author abobrovitskiy.
*/

public class Paint {
    /**
     * метод pyramid рисует пирамиду.
     * @param h высота пирамиды.
     * @return string результат выведенный в строку.
     */
    public String pyramid(int h) {
        StringBuilder string = new StringBuilder();
        int m = h * 2;
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < m; ++j) {
                if ((j >= h - i) && (j <= h + i)) {
                    string.append("^");
					} else {
                    string.append(" ");
					}
			}
            string.append("\r\n");
        }
        return string.toString();
    }
}
