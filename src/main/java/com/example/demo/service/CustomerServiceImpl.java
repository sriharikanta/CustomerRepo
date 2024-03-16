package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.reopsitory.Entityrepository;



@Service
public class CustomerServiceImpl {
    @Autowired
	Entityrepository entityrepository;
	public Customer saveCuatomer(Customer customer) {

		return null;

	}

	public Customer getCuatomer(int id) {
       
		
		return null;

	}
	
	 public List<Customer> findmethod()
	   {
		 List<Customer> findAll = entityrepository.findAll();
		return findAll;
		 
	   }
	 public ResponseEntity<?> StatusandDateList()
	 {
		 System.out.println("=======2====");
		 ResponseEntity<?> statusandDateList = entityrepository.getStatusandDateList();
		 return statusandDateList;
		 
	 }
}