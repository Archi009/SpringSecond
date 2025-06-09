package com.example.Customer.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Customer.demo.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	// 메소드 이름에 따라 쿼리를 자동생성한다. 
//	name 값을 Like연산자로 찾아온다.
	List<Customer>findByNameLike(String name);
	List<Customer>findByNameOrPhone(String name,String phone);
	List<Customer>findByNameOrderByPhoneDesc(String Name);
	Customer findByName(String name);
	
	
}
