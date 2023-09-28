package com.blumbit.web.api.jpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers", schema = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false, unique = true)
    private long customerId;

    @Column(name = "first_name", length = 45)
    private String firstName;

    @Column(name = "last_name", length = 45)
    private String lastName;

    @Column(length = 100)
    private String company;

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
    @ManyToOne()
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    @JsonBackReference(value = "employees")
    private Employee employees;

}
