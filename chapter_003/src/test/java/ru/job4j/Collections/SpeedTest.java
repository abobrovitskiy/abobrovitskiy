package ru.job4j.Collections;
import org.junit.Test;

import java.util.*;

/**
 * класс SpeedTest тестирует класс Speed.
 * */
public class SpeedTest {
    /**
     * метод whenAddMethodThenGetTime теститрует добавление в коллекцию.
     */
    @Test
    public void whenAddMethodThenGetTime() {
        Speed speed = new Speed();
        Collection<String> lList = new LinkedList<>();
        long resultlList = speed.add(lList, 100);
        Collection<String> aList = new ArrayList<>();
        long resultaList = speed.add(aList, 100);
        Collection<String> tSet = new TreeSet<>();
        long resulttSet = speed.add(tSet, 100);
        assert(resultlList > resultaList);
        assert(resulttSet > resultlList);
    }

    /**
     * метод whenDeleteMethodThenGetTime тестииреут удаление из коллекции.
     */
    @Test
    public void whenDeleteMethodThenGetTime() {
        Speed speed = new Speed();
        Collection<String> lList = new LinkedList<>();
        speed.add(lList, 100);
        long resultlList = speed.delete(lList, 100);
        Collection<String> aList = new ArrayList<>();
        speed.add(aList, 100);
        long resultaList = speed.delete(aList, 100);
        Collection<String> tSet = new TreeSet<>();
        speed.add(tSet, 100);
        long resulttSet = speed.delete(tSet, 100);
        assert(resultlList > resultaList);
        assert(resulttSet > resultaList);
    }
}