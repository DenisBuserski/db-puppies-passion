package com.puppiespassion.model.mapper;

import com.puppiespassion.model.User;
import com.puppiespassion.model.dto.UserRegistrationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserRegistrationMapper {
    UserRegistrationMapper INSTANCE = Mappers.getMapper(UserRegistrationMapper.class);

    @Mapping(source = "email", target = "email")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "gender", target = "gender")
    @Mapping(source = "age", target = "age")
    User userRegistrationDtoToUser(UserRegistrationDTO userRegistrationDTO);

}
