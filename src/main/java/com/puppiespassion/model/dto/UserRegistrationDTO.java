package com.puppiespassion.model.dto;

import com.puppiespassion.util.PasswordsMatches;
import com.puppiespassion.model.enums.Gender;
import jakarta.validation.constraints.*;

@PasswordsMatches
public class UserRegistrationDTO {

    @NotNull(message = "Email cannot be NULL!")
    @Email(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Incorrect email address!")
    private String email;

    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@\\W_])[A-Za-z\\d@\\W_]{10,30}$",
            message = "Confirmation password must be between 10 and 30 characters long, and must contain at least 1 lowercase letter, 1 uppercase letter, 1 number, and 1 special character!"
    )
    private String password;

    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@\\W_])[A-Za-z\\d@\\W_]{10,30}$",
            message = "Confirmation password must be between 10 and 30 characters long, and must contain at least 1 lowercase letter, 1 uppercase letter, 1 number, and 1 special character!"
    )
    private String confirmPassword;

    @NotNull(message = "First name cannot be NULL!")
    @Size(min = 3, max = 50, message = "First name must be between 3 and 50 symbols!")
    @Pattern(regexp = "^[A-Z][a-z]{2,49}$", message = "First name must start with a capital letter, followed by lowercase letters only!")
    private String firstName;

    @NotNull(message = "Last name cannot be NULL!")
    @Size(min = 3, max = 50, message = "Last name must be between 3 and 50 symbols!")
    @Pattern(regexp = "^[A-Z][a-z]{2,49}$", message = "Last name must start with a capital letter, followed by lowercase letters only!")
    private String lastName;

    private Gender gender;

    @Min(value = 18, message = "Age must be at least 18 years!")
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
