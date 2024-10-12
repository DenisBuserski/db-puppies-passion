package com.puppiespassion.service.impl;

import com.puppiespassion.ExceptionHandlerUtil;
import com.puppiespassion.model.User;
import com.puppiespassion.model.UserRole;
import com.puppiespassion.model.dto.UserRegistrationDTO;
import com.puppiespassion.model.enums.UserRolesEnum;
import com.puppiespassion.model.mapper.UserRegistrationMapper;
import com.puppiespassion.repository.UserRepository;
import com.puppiespassion.repository.UserRoleRepository;
import com.puppiespassion.service.UserService;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Validated
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;

    UserRegistrationMapper userRegistrationMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.userRegistrationMapper = UserRegistrationMapper.INSTANCE;
    }

    @Override
    public void registerUser(@Valid UserRegistrationDTO userRegistrationDto) throws ConstraintViolationException {
            User user = userRegistrationMapper.userRegistrationDtoToUser(userRegistrationDto);
            UserRole newUserRole = this.userRoleRepository.findByUserRole(UserRolesEnum.CLIENT);
            user.setUserRole(List.of(newUserRole));
            user.setRegistrationDateTime(LocalDateTime.now());
            this.userRepository.save(user);
    }

    @Override
    public boolean deleteUserById(long id) {
        Optional<User> userById = this.userRepository.findById(id);
        if (userById.isEmpty()) {
            return false;
        } else {
            this.userRepository.delete(userById.get());
            return true;
        }
    }
}
