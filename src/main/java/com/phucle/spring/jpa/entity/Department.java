package com.phucle.spring.jpa.entity;
import java.util.List;

import javax.persistence.*;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String departmentName;
    
    @OneToMany(mappedBy = "department")
    private List<User> users;

}