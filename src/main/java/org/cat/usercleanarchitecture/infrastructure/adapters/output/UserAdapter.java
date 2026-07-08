package org.cat.usercleanarchitecture.infrastructure.adapters.output;

import org.cat.usercleanarchitecture.application.ports.output.UserPort;
import org.cat.usercleanarchitecture.domain.model.User;
import org.cat.usercleanarchitecture.infrastructure.adapters.output.mapper.UserEntityMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAdapter implements UserPort {

    private final UserEntityRepository repository;

    public UserAdapter(UserEntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public User create(User user) {
        UserEntity userEntity = repository.save(
                UserEntityMapper.INSTANCE.toUserEntity(user)
        );
        return UserEntityMapper.INSTANCE.toUser(userEntity);
    }

    @Override
    public List<User> findAll() {
        List<UserEntity> userEntities = repository.findAll();//dejar en entities en plural
        return  userEntities.stream()
                .map(UserEntityMapper.INSTANCE::toUser)//:: metodos por referencia
                .toList();
    }
}
