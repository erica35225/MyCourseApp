package com.courses.Controller;

import com.courses.Dtos.NewResponse;
import com.courses.Dtos.UsersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class UserController {
    @Autowired
    private com.courses.Services.UserService userService;
    @Autowired
    private NewResponse newResponse;

    @GetMapping()
    public String getHomepage() {
        return "this is your public homepage";
    }

    @GetMapping("/users")
    public NewResponse getUser() {
        ResponseEntity<UsersDto> response = new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
        newResponse = new NewResponse(response.getBody().getRecords(), true);
        return newResponse;
    }
}
