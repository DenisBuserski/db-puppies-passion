package com.puppiespassion.model.dto;

import com.puppiespassion.model.validation.PasswordsMatches;
import com.puppiespassion.model.enums.Gender;
import com.puppiespassion.model.validation.IsValidGender;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@PasswordsMatches
public class UserRegistrationDTO {

    @NotNull(message = "Username cannot be NULL!")
    @Size(min = 5, max = 50, message = "Username must be between 5 and 50 symbols!")
    private String username;

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

    @IsValidGender
    private Gender gender;

    @Min(value = 18, message = "Age must be at least 18 years!")
    private Integer age;

    public UserRegistrationDTO(String username, String email, String password, String confirmPassword, String firstName, String lastName, Gender gender, int age) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Username: %s | Email: %s | First name: %s | Last name: %s | Gender: %s | Age: %d", username, email, firstName, lastName, gender.name(), age);
    }
}
