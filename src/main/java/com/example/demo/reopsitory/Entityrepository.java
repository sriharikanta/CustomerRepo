package com.example.demo.reopsitory;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;
import com.example.demo.model.GetStatusandDateDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class Entityrepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Customer> findAll() {
		/*
		 * String jpql = "SELECT c FROM Customer c"; TypedQuery<Customer> query =
		 * entityManager.createQuery(jpql, Customer.class);
		 * 
		 * List<Customer> resultList = query.getResultList();
		 */
		return null;
	}

	public ResponseEntity<?> getStatusandDateList() {
		List<GetStatusandDateDTO> response = new ArrayList<>();
		try {
			System.out.println("=======3====");
			String strSql = "SELECT * FROM Customer c";
			jakarta.persistence.Query query = entityManager.createNativeQuery(strSql);
			List<Object[]> results = query.getResultList();
			System.out.println("=======4====");
			
			for (Object[] result : results) {
                  System.out.println();
				GetStatusandDateDTO dto = new GetStatusandDateDTO();
				   dto.setId((int) (result[0]));
				   dto.setName(( result[1]).toString());
				  
				 dto.setDate(((Timestamp)result[2]).toString());
				 dto.setStatus(result[3]!=null?(Character)result[3]:null);
				    
				
				response.add(dto);
				System.out.println("=======5====");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(response, HttpStatus.OK);

	}
}
