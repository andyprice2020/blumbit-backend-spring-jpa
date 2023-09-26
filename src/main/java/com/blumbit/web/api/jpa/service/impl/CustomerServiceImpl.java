package com.blumbit.web.api.jpa.service.impl;

import com.blumbit.web.api.jpa.entity.Customer;
import com.blumbit.web.api.jpa.repository.CustomerRepository;
import com.blumbit.web.api.jpa.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements ICustomerService {

    private final CustomerRepository customerRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Customer> findByID(Long id) {
        return customerRepository.findByCustomerId(id);
    }

    @Override
    @Transactional
    public Customer save(Customer newCustomer) {
        return customerRepository.save(newCustomer);
    }
}
