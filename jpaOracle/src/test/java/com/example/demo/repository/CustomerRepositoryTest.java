package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.example.Customer.demo.Repository.CustomerRepository;
import com.example.Customer.demo.entity.Customer;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
public class CustomerRepositoryTest {
		
	
	@Autowired
	CustomerRepository repo;
	
	@Test
	@jakarta.transaction.Transactional
	@Rollback
	public void 검색() {
		repo.save(Customer.builder().name("구구구").userid("nineninenine").build());
		repo.save(Customer.builder().name("구라").userid("ninennine").build());
		repo.save(Customer.builder().name("누누누").userid("ninnine").build());
		List<Customer> list = repo.findByNameLike("%구%");
		list.forEach(item-> log.info("결과       :" + item.getName()));
		assertEquals(list.size(), 4);
	}
	
	@Test
	@jakarta.transaction.Transactional
	@Rollback
	public void 검색1() {
		repo.save(Customer.builder().name("구구구").userid("nineninenine").build());
		repo.save(Customer.builder().name("구라").userid("ninennine").build());
		repo.save(Customer.builder().name("누누누").userid("ninnine").build());
		Customer list = repo.findByName("구라");
		log.info("결과       :"+ list);
		assertEquals(list.getName(),"구라");
	}
	
	@Test
	@jakarta.transaction.Transactional
	@Rollback
	public void 검색2() {
		repo.save(Customer.builder().name("구구구").userid("nineninenine").phone("010").build());
		repo.save(Customer.builder().name("구라").userid("ninennine").phone("011").build());
		repo.save(Customer.builder().name("누누누").userid("ninnine").phone("019").build());
		List<Customer> list = repo.findByNameOrPhone("구라","010");
		List<Customer> list1 = repo.findByNameOrderByPhoneDesc("구라");
		
		list.forEach(item-> log.info("결과       :" + item.getName()));
		list1.forEach(item-> log.info("결과       :" + item.getName()));
		assertEquals(list.size(), 2);
	}
	
}
