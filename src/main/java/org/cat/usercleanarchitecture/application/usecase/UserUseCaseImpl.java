package org.cat.usercleanarchitecture.application.usecase;



import org.cat.usercleanarchitecture.application.ports.input.IUserUseCase;
import org.cat.usercleanarchitecture.application.ports.output.UserPort;
import org.cat.usercleanarchitecture.domain.model.User;
import org.cat.usercleanarchitecture.domain.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserUseCaseImpl implements IUserUseCase {

    private final UserPort userPort;

    public UserUseCaseImpl(UserPort userPort) {

        this.userPort = userPort;
    }

    @Override
    public User create(User user){
        return userPort.create(user);
    }

    @Override
    public List<User> filterByLastName(String lastName){
        List<User> users =userPort.findAll();
        List<User> usersFilter = UserService.filterByName(users, lastName);
        return usersFilter;
    }

}
