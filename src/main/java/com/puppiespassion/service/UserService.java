package com.puppiespassion.service;

import com.puppiespassion.model.dto.UserLoginDTO;
import com.puppiespassion.model.dto.UserRegistrationDTO;
import jakarta.validation.Valid;

public interface UserService {

    void registerUser(UserRegistrationDTO userRegistrationDto);

    boolean deleteUserById(long id);

    void subscribeUser(String email);

    void unsubscribe(String email);

    void loginUser(UserLoginDTO userLoginDTO);
}
