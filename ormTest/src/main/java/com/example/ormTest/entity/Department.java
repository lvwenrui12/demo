package com.example.ormTest.entity;

import lombok.Getter;
import lombok.Setter;
 
import javax.persistence.*;
 
@Getter
@Setter
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

}