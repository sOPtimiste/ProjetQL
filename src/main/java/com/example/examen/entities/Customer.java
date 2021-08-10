package com.example.examen.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "customer_code",length = 10)
	private String  customerCode;
	
	@Column(name = "customer_name", length = 50)
	private String  customerName;
	
	@Column(name = "representant_code",length = 10)
	private String  representantCode;
	
	
	@OneToMany(mappedBy = "customer")
	private Set<Order> orders;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCustomerCode() {
		return customerCode;
	}


	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getRepresentantCode() {
		return representantCode;
	}


	public void setRepresentantCode(String representantCode) {
		this.representantCode = representantCode;
	}


	public Set<Order> getOrders() {
		return orders;
	}


	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	
	
	
	

}
