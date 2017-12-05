package ru.job4j.tracker;
/**
* интерфейс Input.
* @author abobrovitskiy.
*/
public interface Input {
	String ask(String question);
	int ask(String question, int[] range);
}