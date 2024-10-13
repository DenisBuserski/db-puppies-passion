package com.puppiespassion.web;

import com.puppiespassion.ExceptionHandlerUtil;
import com.puppiespassion.model.dto.UserRegistrationDTO;
import com.puppiespassion.model.enums.Gender;
import com.puppiespassion.service.UserService;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/v1/users")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    private void register(@RequestBody UserRegistrationDTO userRegistrationDTO) {
        try {
            this.userService.registerUser(userRegistrationDTO);
            log.info("User registered successfully!");
        } catch (ConstraintViolationException exception) {
            ExceptionHandlerUtil.handleConstraintViolationException(exception);
        }
    }

    @DeleteMapping("/delete/{user_id}")
    private void delete(@PathVariable("user_id") long id) {
        if (this.userService.deleteUserById(id)) {
            log.info("User with id: {} was deleted!", id);
        } else {
            log.info("User with id: {} does no exist!", id);
        }
    }


}
