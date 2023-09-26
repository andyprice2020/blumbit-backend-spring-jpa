package com.blumbit.web.api.jpa.service;

import com.blumbit.web.api.jpa.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {

    List<Customer> findAll();
    Optional<Customer> findByID(Long id);
    Customer save(Customer newCustomer);
}
