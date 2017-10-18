package ru.job4j.array;
/**
* класс Privet для подстроки в строке.
* @author abobrovitskiy.
*/
public class Privet {
	/**
	* метод substring ищет подстроку в строке.
	* @param s String.
	* @param sub String.
	* @return boolean.
	*/
    public boolean substring(String s, String sub) {
        char[] m = s.toCharArray();
        char[] msub = sub.toCharArray();
        int count = 0;
        for (int i = 0; i < m.length - msub.length + 1; i++) {
            for (int j = 0; j < msub.length; j++) {
                if (msub[j] != m[j + i]) {
                    break;
                } else if (j == msub.length - 1) {
					count++;
                    break;
				}
            }
        }
        return (count > 0);
        }
}
