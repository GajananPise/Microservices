package com.user.controller;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") int userId){

        User user = this.userService.getUser(userId);

        List conatct = restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserId(), List.class);

        user.setContacts(conatct);

        return user;
    }
}
