package com.puppiespassion.model.dto;

import com.puppiespassion.model.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationDTO {
    private String email;

    private String password;

    private String confirmPassword;

    private String firstName;

    private String lastName;

    private Gender gender;

    private int age;

    public UserRegistrationDTO(String email, String password, String confirmPassword, String firstName, String lastName, Gender gender, int age) {
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }
}
