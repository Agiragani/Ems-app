package com.EMT.EMS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter                                      //instance variable
@Setter                                     //instance variable
@NoArgsConstructor                                      // constructor
@AllArgsConstructor                               //parenthasized constructor
@Entity                                          //to identity as jpa entity
@Table(name = "employees")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "salary")
    private int salary;


}

