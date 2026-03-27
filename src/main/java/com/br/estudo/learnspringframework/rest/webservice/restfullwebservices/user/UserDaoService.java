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

    static {
        users.add(new User(1, "Gustavo", LocalDate.now().minusYears(23)));
        users.add(new User(2, "Giselen", LocalDate.now().minusYears(22)));
        users.add(new User(3, "Cecilia", LocalDate.now().minusYears(50)));
    }

    public List<User> findAll() {
        return users;
    }

    //public User save(User user) {

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users
                .stream()
                .filter(predicate)
                .findFirst()
                .get();
    }



}
