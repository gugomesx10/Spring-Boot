package com.br.estudo.learnspringframework.rest.webservice.restfullwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    // JPA/Hibernate > Database
    // UserDaoService > Static Lists

    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount, "Gustavo", LocalDate.now().minusYears(23)));
        users.add(new User(++usersCount, "Giselen", LocalDate.now().minusYears(22)));
        users.add(new User(++usersCount, "Cecilia", LocalDate.now().minusYears(50)));
    }


    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users
                .stream()
                .filter(predicate)
                .findFirst()
                .orElse(null);
    }



}
