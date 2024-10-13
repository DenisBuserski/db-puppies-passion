package com.puppiespassion.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_email_subscription")
public class UserSubscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;

    public UserSubscription() {
    }
    public UserSubscription(String email) {
        this.email = email;
    }
}
