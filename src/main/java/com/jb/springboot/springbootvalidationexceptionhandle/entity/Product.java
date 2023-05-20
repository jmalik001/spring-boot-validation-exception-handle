package com.jb.springboot.springbootvalidationexceptionhandle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    @NotBlank(message = "Product name is mandatory")
    private String name;
    @NotBlank(message = "Product Details is mandatory")
    @Size(min = 5, max = 200, message = "Enter details between 5 and 200 characters")
    private String productDetails;

    private String category;

}
