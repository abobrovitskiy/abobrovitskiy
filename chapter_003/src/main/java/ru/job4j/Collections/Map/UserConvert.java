package ru.job4j.Collections.Map;

import java.util.HashMap;
import java.util.List;

/**
 * класс UserConvert добавляет в HashMap объекты из списка пользователей.
 */
public class UserConvert {
    /**
     * метод process 
     * @param list
     * @return
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> hashMap = new HashMap<>();
        for (User user : list) {
            hashMap.put(user.getId(), user);
        }
        return hashMap;
    }
}