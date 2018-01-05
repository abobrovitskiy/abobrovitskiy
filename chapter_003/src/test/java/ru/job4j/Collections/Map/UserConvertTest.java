package ru.job4j.Collections.Map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class UserConvertTest {
    @Test
    public void whenInUserListThenOutMap() {
        User user1 = new User(1, "Sergey","Omsk");
        User user2 = new User(2, "Oleg", "Tomsk");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        HashMap<Integer, User> expected = new HashMap<>();
        UserConvert convert = new UserConvert();
        expected.put(1, user1);
        expected.put(2, user2);
        assertThat(convert.process(list), is(expected));
    }
}