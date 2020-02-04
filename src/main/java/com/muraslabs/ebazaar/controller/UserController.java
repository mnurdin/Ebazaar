package com.muraslabs.ebazaar.controller;

import com.muraslabs.ebazaar.model.User;
import com.muraslabs.ebazaar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @GetMapping("/")
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User findOne(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    @PostMapping("/")
    public ResponseEntity<User> create(@RequestBody User user) {
        User createUser = userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createUser);
    }
}
