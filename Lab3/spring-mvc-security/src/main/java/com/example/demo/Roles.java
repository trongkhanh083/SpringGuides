package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "roles")
@Data
public class Roles {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // remaining getters and setters
}
