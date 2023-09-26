package com.blumbit.web.api.jpa.controller;

import com.blumbit.web.api.jpa.entity.Customer;
import com.blumbit.web.api.jpa.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class CustomerController {

    private final ICustomerService customerService;

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        var customerz = customerService.findAll();
        return new ResponseEntity<>(customerz, HttpStatus.OK);
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> findCustomerByID(@PathVariable Long id) {
        var singleCustomer = customerService.findByID(id);
        return new ResponseEntity<>(singleCustomer.get(), HttpStatus.OK);
    }

    @PostMapping("/customers")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer newCustomer) {
        var newCustom = customerService.save(newCustomer);
        return new ResponseEntity<>(newCustom, HttpStatus.CREATED);
    }
}
