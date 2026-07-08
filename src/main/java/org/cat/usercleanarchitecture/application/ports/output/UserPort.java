package org.cat.usercleanarchitecture.application.ports.output;

import org.cat.usercleanarchitecture.domain.model.User;

public interface UserPort {

    User create(User user);

}
