package com.puppiespassion.web;

import com.puppiespassion.model.dto.UserLoginDTO;
import com.puppiespassion.util.ExceptionHandlerUtil;
import com.puppiespassion.model.dto.UserRegistrationDTO;
import com.puppiespassion.service.UserService;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

import static com.puppiespassion.util.ExceptionHandlerUtil.logValidationErrors;

@Controller
@RequestMapping("/users")
@Slf4j
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("userRegistrationDTO")
    public UserRegistrationDTO initForm() {
        return new UserRegistrationDTO();
    }

    @GetMapping("/registration/form")
    public String registrationForm() {
        return "registration";
    }

    @PostMapping("/registration/form")
    private String register(@Valid UserRegistrationDTO userRegistrationDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("userRegistrationDTO", userRegistrationDTO);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userRegistrationDTO", bindingResult);
            logValidationErrors(bindingResult);

            return "redirect:/users/registration/form";
        }

        this.userService.registerUser(userRegistrationDTO);
        log.info("Successfully registered [{}]", userRegistrationDTO.toString());
        return "redirect:/users/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(UserLoginDTO userLoginDTO) {
        return "redirect:/home";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/home";
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




}
