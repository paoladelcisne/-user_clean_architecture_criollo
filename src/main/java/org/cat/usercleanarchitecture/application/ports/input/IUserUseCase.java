package org.cat.usercleanarchitecture.application.ports.input;


import java.util.List;

import org.cat.usercleanarchitecture.domain.model.User;

public interface IUserUseCase {

    User create (User user);

    //Caso de uso
    List<User> filterByLastName (String lastName);

}
