package com.example.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
