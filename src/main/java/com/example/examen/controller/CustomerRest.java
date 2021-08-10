package com.example.examen.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entities.Customer;
import com.example.examen.repositories.CustomerRepository;


@RestController
public class CustomerRest {
	
	@Resource
	private CustomerRepository cr;
	
	@GetMapping("/findOneCustomer/{id}")
	public Optional<Customer> findById(@PathVariable Long id)
	{
		return cr.findById(id);
	}
	
	@GetMapping("/findAllCustomer")
	public List<Customer> findAll() {
		
		return cr.findAll();
		
	}
	@PostMapping("/saveCustomer")
	public Customer save(@RequestBody Customer Customer) {
		
		return cr.save(Customer);
	}
	
	@PostMapping("/updateCustomer")
	public Customer update(@RequestBody Customer Customer) {
		
		return cr.save(Customer);
	}
	
	@PostMapping("/deleteCustomer")
	public void delete(@RequestBody Customer Customer) {
		
		cr.delete(Customer);
	}

}
