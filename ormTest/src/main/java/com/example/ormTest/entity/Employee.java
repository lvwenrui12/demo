package com.example.ormTest.entity;
 
import lombok.Getter;
import lombok.Setter;
 
import javax.persistence.*;
 
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
 
    @Column(name = "name")
    private String name;
 
    @Column(name = "age")
    private int age;

    @Column(name = "dept_id")
    private int deptId;
 
//    @ManyToOne(targetEntity = Department.class)
//    @JoinColumn(name = "dept_id",referencedColumnName = "id")
//    private Department department;
}