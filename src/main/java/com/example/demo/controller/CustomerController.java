package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerServiceImpl;

@RestController
public class CustomerController {
@Autowired
private CustomerServiceImpl customerServiceImpl;
@PostMapping("/save")
public Customer saveCustomer(@RequestBody Customer customer)
{
	Customer saveCuatomer = customerServiceImpl.saveCuatomer(customer);
	return saveCuatomer;
}
@GetMapping("/save/{id}")
public Customer getCustomer(@PathVariable int id)
{
	return customerServiceImpl.getCuatomer(id);
	
}
@GetMapping("/findall")
public List<Customer> findAll()
{
	  List<Customer> findmethod = customerServiceImpl.findmethod();
	return findmethod;
	
}
@GetMapping("/getall")
public ResponseEntity<?> StatusandDateList()
{
	System.out.println("=======1====");
	ResponseEntity<?> statusandDateList = customerServiceImpl.StatusandDateList();
	
	return statusandDateList;
}
}