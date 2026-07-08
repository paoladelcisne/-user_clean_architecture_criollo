package org.cat.usercleanarchitecture.application.ports.input;


import org.cat.usercleanarchitecture.domain.model.User;

public interface IUserUseCase {

    User create (User user);

}
