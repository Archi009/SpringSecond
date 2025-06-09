package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

import lombok.extern.log4j.Log4j2;


@SpringBootTest
public class CustomerRepositoryTest {
	
	@Autowired CustomerRepository cus;
	
	
	@Test
	public void 등록() {
		
		//given
		Customer cust = Customer.builder()
								.name("홍길동")
								.phone("011").build();
		cus.save(cust);
		
		//when
		Optional<Customer> result =  cus.findById(1L);
		
		//then
		assertEquals("홍길동", result.get().getName()); 
		
	}
}
