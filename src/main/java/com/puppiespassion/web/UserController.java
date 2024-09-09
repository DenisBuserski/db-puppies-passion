package com.puppiespassion.web;

import com.puppiespassion.model.dto.UserRegistrationDTO;
import com.puppiespassion.model.enums.Gender;
import com.puppiespassion.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    private void register(@RequestBody UserRegistrationDTO userRegistrationDTO) {
        this.userService.registerUser(userRegistrationDTO);
    }


}
