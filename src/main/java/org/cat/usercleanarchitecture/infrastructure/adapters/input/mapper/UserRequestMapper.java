package org.cat.usercleanarchitecture.infrastructure.adapters.input.mapper;

import org.cat.usercleanarchitecture.domain.model.User;
import org.cat.usercleanarchitecture.infrastructure.adapters.input.dto.UserRequest;
import org.mapstruct.factory.Mappers;

public interface UserRequestMapper {

    UserRequestMapper INSTANCE = Mappers.getMapper(UserRequestMapper.class);

    User toUser(UserRequest userRequest);
}
