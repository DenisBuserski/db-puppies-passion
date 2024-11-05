package com.puppiespassion.web;

import com.puppiespassion.util.ExceptionHandlerUtil;
import com.puppiespassion.model.dto.UserRegistrationDTO;
import com.puppiespassion.service.UserService;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration/form")
    public String registrationForm() {
        return "registration";
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

    @PostMapping("/subscribe") // http://localhost:8080/users/subscribe
    public String subscribeToEmail(@RequestParam String email) {
        this.userService.subscribeUser(email);
        log.info("User successfully subscribed to newsletter!");
        return "home.html";
    }

    @PostMapping("/unsubscribe") // http://localhost:8080/users/unsubscribe
    public void unsubscribe(@RequestBody String email) {
        this.userService.unsubscribe(email);
    }

    @DeleteMapping("/delete/{user_id}") // http://localhost:8080/users/delete/{user_id}
    private void delete(@PathVariable("user_id") long id) {
        if (this.userService.deleteUserById(id)) {
            log.info("User with id: {} was deleted!", id);
        } else {
            log.info("User with id: {} does no exist!", id);
        }
    }


}
