package com.example.springbootproject.model;

import jakarta.persistence.*;
import lombok.*;
//import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_first_name")
    private String employeeFirstName;
    @Column(name = "employee_last_name")
    private String employeeLastName;
    @Column(name = "employee_id")
    private String employeeID;
    @Column(name = "employee_email")
    private String employeeEmail;
}
