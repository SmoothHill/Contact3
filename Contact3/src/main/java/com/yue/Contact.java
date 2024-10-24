package com.yue;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "man")
public class Contact {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Address")
    private String address;

    @Column(name = "Phone")
    private String phone;

    // Getters and Setters
}
