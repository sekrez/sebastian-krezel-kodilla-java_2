package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
final class ForumUser {
    String userName;

    public ForumUser() {
        userName = "John Smith";
    }
}
