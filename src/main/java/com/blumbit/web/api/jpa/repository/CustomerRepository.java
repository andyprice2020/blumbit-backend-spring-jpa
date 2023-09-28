package com.blumbit.web.api.jpa.repository;

import com.blumbit.web.api.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // OBTENCION DEL CUSTOMER ID
    Optional<Customer> findByCustomerId(Long id);

    // UTILIZAREMOS LAS TRES FORMAS DE ARMAR CONSULTAS EN JPA
    // PRIMERA ES UTILIZAR UNA CONSULTA NATIVA SQL
    // SE UTLIZA LA NOTACION @Query CON EL PARAMETRO nativeQuery = true
    //@Query(value = "select * from customer.customers c where customer_id = :customerId", nativeQuery = true)
    //Customer findByCustomerId(@Param("customerId") long customerId);

    // SEGUNDA FORMA UTILIZANDO JPQL
    //@Query(value = "select c from Customer c")
    //List<Customer> findAll();

    //@Query(value = "SELECT c FROM Customer c WHERE c.customerId = :customerId")
    //Customer findByCustomerId(@Param("customerId") long id);
}
