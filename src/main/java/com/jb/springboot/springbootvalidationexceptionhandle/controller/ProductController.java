package com.jb.springboot.springbootvalidationexceptionhandle.controller;

import com.jb.springboot.springbootvalidationexceptionhandle.entity.Product;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@Valid @RequestBody Product product){
        return ResponseEntity.ok("Product added");
    }
}
