package com.puppiespassion.service.impl;

import com.puppiespassion.model.User;
import com.puppiespassion.model.dto.UserRegistrationDTO;
import com.puppiespassion.model.enums.UserRolesEnum;
import com.puppiespassion.model.mapper.UserRegistrationMapper;
import com.puppiespassion.repository.UserRepository;
import com.puppiespassion.service.UserService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    UserRegistrationMapper userRegistrationMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.userRegistrationMapper = UserRegistrationMapper.INSTANCE;
    }

    @Override
    public void registerUser(UserRegistrationDTO userRegistrationDto) {
        User user = userRegistrationMapper.userRegistrationDtoToUser(userRegistrationDto);
        user.setRegistrationDateTime(LocalDateTime.now());
        this.userRepository.save(user);

    }
}
