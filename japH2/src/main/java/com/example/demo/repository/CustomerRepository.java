package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;
//           테이블이름,테이블의 PK타입
/////JpaRepository<T, ID>
@Repository       //== mapper 인터 페이스           //@Controller, @Service
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}
