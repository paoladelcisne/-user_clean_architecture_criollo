package org.cat.usercleanarchitecture.application.ports.usecase;



import org.cat.usercleanarchitecture.application.ports.input.IUserUseCase;
import org.cat.usercleanarchitecture.application.ports.output.UserPort;
import org.cat.usercleanarchitecture.domain.model.User;
import org.springframework.stereotype.Component;

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

}
