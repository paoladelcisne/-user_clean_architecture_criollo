package org.cat.usercleanarchitecture.infrastructure.adapters.input.mapper;

import org.cat.usercleanarchitecture.domain.model.User;
import org.cat.usercleanarchitecture.infrastructure.adapters.input.dto.UserResponse;
import org.mapstruct.factory.Mappers;

public interface UserResponseMapper {

    UserResponseMapper INSTANCE = Mappers.getMapper(UserResponseMapper.class);

    UserResponse toUserResponse(User user);
}
