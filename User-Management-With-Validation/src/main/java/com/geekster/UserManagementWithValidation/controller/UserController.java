package com.geekster.UserManagementWithValidation.controller;

import com.geekster.UserManagementWithValidation.model.User;
import com.geekster.UserManagementWithValidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping("/getUser/{id}")
    public User getUserById(@Valid @PathVariable String id){
        return userService.getUserById(id);
    }

    @PostMapping("/addUser")
    public String addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/updateUser/{id}")
    public String updateUser(@Valid @PathVariable String id, @Valid @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@Valid @PathVariable String id){
        return userService.deleteUser(id);
    }
}
