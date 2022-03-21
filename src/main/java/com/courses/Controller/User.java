package com.courses.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class User {

    @GetMapping()
    public String getHomepage() {
        return "this is your public homepage";
    }

    @GetMapping("/users")
    public String getUser() {
        return "first user,second user,third user";
    }
}
