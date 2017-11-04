package ru.job4j.tracker;
import java.util.*;
/**
* класс ConsoleInput используется для ввода данных.
* @author abobrovitskiy.
*/
public class ConsoleInput implements Input {
	private Scanner scanner = new Scanner(System.in);
	public String ask(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}
}
