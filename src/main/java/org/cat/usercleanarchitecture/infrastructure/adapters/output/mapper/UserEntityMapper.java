package org.cat.usercleanarchitecture.infrastructure.adapters.output.mapper;

import org.cat.usercleanarchitecture.domain.model.User;
import org.cat.usercleanarchitecture.infrastructure.adapters.output.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserEntityMapper {

    //fuente y un destino: clase a la que mappeo

    //Cuando tengo atríbutos con nombres distintos usar @Mapping

    //patron singleton
    UserEntityMapper INSTANCE = Mappers.getMapper(UserEntityMapper.class);

    UserEntity toUserEntity(User user);
    User toUser(UserEntity userEntity);
}
