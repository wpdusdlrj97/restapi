package com.example.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Member {
    private long id;
    private String name;
    private int age;
    private String address;
    private Date createdAt;
}