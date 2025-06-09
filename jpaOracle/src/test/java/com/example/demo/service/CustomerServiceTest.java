package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.example.Customer.demo.service.CustomerService;
import com.example.Customer.demo.web.CustomerVO;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class CustomerServiceTest {
	
	@Autowired 
	CustomerService cust;
	
	
	@Test
	public void 등록() {
		CustomerVO vo = new CustomerVO();
		vo.setAddr("대구시 대구구");
		vo.setName("구구구구");
		vo.setPhone("99999");
		vo.setUserid("nine9");
		vo.setUserpw("gugugugu");
		int res = cust.insert(vo);
		
		List<CustomerVO>list = cust.findAll();
		list.forEach(item -> log.info("결과"+item));
		assertEquals("구구구구",list.get(0).getName() );
	}
	
	@Test
	public void 수정() {
		CustomerVO vo = new CustomerVO();
		vo.setId(1L);
		vo.setAddr("머구시 머구구");
		vo.setName("구구");
		vo.setPhone("99999");
		vo.setUserid("nine9");
		vo.setUserpw("gugugugu");
		int res = cust.insert(vo);
		
		CustomerVO result = cust.findById(1L);
		assertEquals("구구",result.getName() );
		log.info("결과   : " + result);
	}
	
	@Test
	@Transactional
	@Rollback
	public void 삭제() {
		int res = cust.del(1L);
		assertEquals(res, 1);
	}
	
	
}
