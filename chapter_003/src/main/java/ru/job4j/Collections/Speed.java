package ru.job4j.Collections;

import java.util.*;
import static java.lang.System.nanoTime;
/**
 * класс Speed тестирует скорость работы коллекций.
 */
public class Speed {
    /**
     * метод add добавляет элементы в коллекцию.
     * @param collection collection.
     * @param amount amount.
     * @return time.
     */
    public long add(Collection<String> collection, int amount) {
        long start = nanoTime();
        for (int i = 0; i != amount; i++) {
            collection.add(String.valueOf(i));
        } return nanoTime() - start;
    }
    /**
     * метод delete удаляет элементы из коллекции.
     * @param collection collection.
     * @param amount amount.
     * @return time.
     */
    public long delete(Collection<String> collection, int amount) {
        long start = nanoTime();
        for (int i = 0; i != amount; i++) {
            collection.remove(String.valueOf(i));
        } return nanoTime() - start;
    }
    /**
     * main метод.
     * @param args args.
     */
    public static void main(String[] args) {
        Speed speed = new Speed();
        Collection<String> lList = new LinkedList<>();
        long resultlList = speed.add(lList, 100000);
        Collection<String> aList = new ArrayList<>();
        long resultaList = speed.add(aList, 100000);
        Collection<String> tSet = new TreeSet<>();
        long resulttSet = speed.add(tSet, 100000);
        System.out.println(String.format("%s - %s", lList.getClass(), resultlList));
        System.out.println(String.format("%s - %s", aList.getClass(), resultaList));
        System.out.println(String.format("%s - %s", tSet.getClass(), resulttSet));

        resultlList = speed.delete(lList, 1000);
        resultaList = speed.delete(aList, 1000);
        resulttSet = speed.delete(tSet, 1000);
        System.out.println(String.format("%s - %s", lList.getClass(), resultlList));
        System.out.println(String.format("%s - %s", aList.getClass(), resultaList));
        System.out.println(String.format("%s - %s", tSet.getClass(), resulttSet));
    }
}