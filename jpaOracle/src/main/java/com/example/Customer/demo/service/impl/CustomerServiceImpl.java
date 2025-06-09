package com.example.Customer.demo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.Customer.demo.Repository.CustomerRepository;
import com.example.Customer.demo.entity.Customer;
import com.example.Customer.demo.service.CustomerService;
import com.example.Customer.demo.web.CustomerVO;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
	
	private final CustomerRepository cus;
		
	// 전체 조회
	@Override
	public List<CustomerVO> findAll() {
		List<Customer> list = cus.findAll();
//		List<CustomerVO> listVO = new ArrayList<CustomerVO>();
//		for(Customer cust : list) {
//			listVO.add(new CustomerVO(cust));
//		}
		return list.stream().map(cust -> new CustomerVO(cust))
							.collect(Collectors.toList());
	}
	// 단건조회
	@Override
	public CustomerVO findById(Long id) {
			//optional -> null check됨
		 Optional<Customer> cust = cus.findById(id);
		return new CustomerVO(cust.get());
	}
	
	// 등록
	@Override
	public int insert(CustomerVO vo) {
		Customer customer = cus.save(vo.toEntity());
		return customer != null ? customer.getId().intValue() : 0;
	}
	
	// 수정
	@Override
	public int update(CustomerVO vo) {
		Customer customer = cus.save(vo.toEntity());
		
		return customer != null ? customer.getId().intValue() : 0 ;
	}

	@Override
	public int del(Long id) {
		
	 Optional<Customer> res = cus.findById(id);
	 if(res.isPresent()) {
		 cus.delete(res.get());
		 return 1;
	 }
	 return 0;
	}

}
