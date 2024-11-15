package com.puppiespassion.web;

import com.puppiespassion.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Slf4j
public class AdminController {
    private final UserService userService;

    @Autowired
    public AdminController(UserService userService) {
        this.userService = userService;
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
