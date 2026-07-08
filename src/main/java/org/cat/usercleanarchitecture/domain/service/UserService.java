package org.cat.usercleanarchitecture.domain.service;

import java.util.List;

import org.cat.usercleanarchitecture.domain.model.User;

public class UserService {

    //logica de negocio
    public static List<User> filterByName(List<User> users, String lastName){
        return users.stream()
                .filter(user -> user.getLastName().equalsIgnoreCase(lastName))
                .toList();
    }
}
