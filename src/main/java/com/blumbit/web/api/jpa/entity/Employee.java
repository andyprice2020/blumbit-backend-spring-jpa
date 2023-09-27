package com.blumbit.web.api.jpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees", schema = "customer")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false, unique = true)
    private long employeeId;

    @Column(name = "first_name", length = 45)
    private String firstName;

    @Column(name = "last_name", length = 45)
    private String lastName;

    @Column(length = 45)
    private String title;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

    @Column(name = "hire_date")
    private LocalDateTime hireDate;

    @Column(length = 200)
    private String address;

    @Column(length = 50)
    private String city;

    @Column(length = 50)
    private String state;

    @Column(length = 50)
    private String country;

    @Column(name = "postal_code", length = 10)
    private String postalCode;

    @Column(length = 20)
    private String phone;

    @Column(length = 20)
    private String fax;

    @Column(length = 45)
    private String email;

    // MANEJO DE FORMA BIDIRECCIONAL LA PERSISTENCIA ENTRE ESTAS DOS CLASES
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
    @JsonManagedReference(value = "employees")
    private Set<Customer> customers;
}
