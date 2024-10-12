package com.puppiespassion.service;

import com.puppiespassion.model.dto.UserRegistrationDTO;
import jakarta.validation.Valid;

public interface UserService {

    void registerUser(@Valid UserRegistrationDTO userRegistrationDto);

    boolean deleteUserById(long id);
}
