package com.puppiespassion.web;

import com.puppiespassion.model.dto.UserRegistrationDTO;
import com.puppiespassion.model.enums.Gender;
import com.puppiespassion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    private String register() {
        UserRegistrationDTO userRegistrationDto = new UserRegistrationDTO("Test_email", "PASS", "Pass", "First_name_test", "Last_name_test", Gender.MALE, 20);
        this.userService.registerUser(userRegistrationDto);
        return "DONE";
    }
}
