package com.jb.springboot.springbootvalidationexceptionhandle.controller;

import com.jb.springboot.springbootvalidationexceptionhandle.entity.User;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/error")
    public String defaultErrorPath(){
        return  "No Proper path found !!!";
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@Valid @RequestBody User user){
        return ResponseEntity.ok("User created");
    }

}
