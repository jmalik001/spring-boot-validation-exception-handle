package com.jb.springboot.springbootvalidationexceptionhandle.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Tbl_User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Name must not be given")
    private String name;
    @Positive(message = "Age must be a positive number")
    @Min(value = 18,message = "min age is 18")
    private int age;
    @NotBlank(message = "Phone Number must be given")
    @Size(min = 10, max = 10, message = "phone number should be length of 10 ")
    private String phonenumber;


}
