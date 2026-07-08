package org.cat.usercleanarchitecture.application.ports.usecase;

import org.cat.usercleanarchitecture.application.ports.output.UserPort;
import org.cat.usercleanarchitecture.domain.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class UserUseCaseImplTest {

    @Test
    void createDelegatesToPort() {
        User user = new User("Ana", "Pérez", "ana@test.com", "123456789");

        UserPort userPort = new UserPort() {
            @Override
            public User create(User input) {
                return input;
            }
        };

        UserUseCaseImpl useCase = new UserUseCaseImpl(userPort);

        assertSame(user, useCase.create(user));
    }
}
