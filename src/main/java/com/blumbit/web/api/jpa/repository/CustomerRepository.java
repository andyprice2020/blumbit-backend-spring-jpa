package com.blumbit.web.api.jpa.repository;

import com.blumbit.web.api.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // OBTENCION DEL CUSTOMER ID
    Optional<Customer> findByCustomerId(Long id);
}
