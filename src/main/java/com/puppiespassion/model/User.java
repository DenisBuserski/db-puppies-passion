package com.puppiespassion.model;

import com.puppiespassion.model.enums.Gender;
import com.puppiespassion.model.enums.UserRolesEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;

    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private int age;

    @ManyToMany
    @JoinTable(name = "roles_of_users",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<UserRole> userRole;

    private LocalDateTime registrationDateTime;

    public User() {
    }
    public User(String email, String password, String firstName, String lastName, Gender gender, int age, List<UserRole> userRole, LocalDateTime registrationDateTime) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.userRole = userRole;
        this.registrationDateTime = registrationDateTime;
    }

    public long getId() {
        return id;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public User setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public List<UserRole> getUserRole() {
        return userRole;
    }

    public User setUserRole(List<UserRole> userRole) {
        this.userRole = userRole;
        return this;
    }

    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }

    public User setRegistrationDateTime(LocalDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
        return this;
    }
}
