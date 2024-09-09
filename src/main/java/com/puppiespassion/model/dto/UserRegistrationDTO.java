package com.puppiespassion.model.dto;

import com.puppiespassion.model.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
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

    public String getEmail() {
        return email;
    }

    public UserRegistrationDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegistrationDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegistrationDTO setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserRegistrationDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserRegistrationDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public UserRegistrationDTO setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public int getAge() {
        return age;
    }

    public UserRegistrationDTO setAge(int age) {
        this.age = age;
        return this;
    }
}
