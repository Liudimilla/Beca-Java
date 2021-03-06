package com.everis.delivery.controller;

import com.everis.delivery.model.User;
import com.everis.delivery.service.serviceImplements.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<?> getAllUsers() {
        List<User> user = userService.findAll();

        if (!user.isEmpty()) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") long id) {
        Optional<User> user = userService.findById(id);

        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<?> getUserByName(@PathVariable("name") String name) {
        Optional<User> user = userService.findByName(name);

        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> insertUser(@RequestBody User user) {
        userService.save(user);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/all")
    public ResponseEntity<?> insertAllUsers(@RequestBody List<User> user) {
        userService.saveAll(user);
        return ResponseEntity.ok(user);
    }
}