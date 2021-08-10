package com.example.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
