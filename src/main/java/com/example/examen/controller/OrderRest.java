package com.example.examen.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entities.Order;
import com.example.examen.repositories.OrderRepository;


@RestController
public class OrderRest {
	
	@Resource
	private OrderRepository or;
	
	@GetMapping("/findOneOrder/{id}")
	public Optional<Order> findById(@PathVariable Long id)
	{
		return or.findById(id);
	}
	
	@GetMapping("/findAllOrder")
	public List<Order> findAll() {
		
		return or.findAll();
		
	}
	@PostMapping("/saveOrder")
	public Order save(@RequestBody Order Order) {
		
		return or.save(Order);
	}
	
	@PostMapping("/updateOrder")
	public Order update(@RequestBody Order Order) {
		
		return or.save(Order);
	}
	
	@PostMapping("/deleteOrder")
	public void delete(@RequestBody Order Order) {
		
		or.delete(Order);
	}


}
