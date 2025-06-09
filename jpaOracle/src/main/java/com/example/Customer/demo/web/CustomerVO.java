package com.example.Customer.demo.web;

import com.example.Customer.demo.entity.Customer;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerVO {
	
	
	
	private Long id;
	private String userid;
	private String userpw;
	private String name;
	private String phone;
	private String addr;
	
	public CustomerVO(Customer customer) {
		this.id = customer.getId();
		this.userid = customer.getUserid();
		this.userpw = customer.getUserpw();
		this.name = customer.getName();
		this.phone = customer.getPhone();
		this.addr = customer.getAddr();
	}
	
	public Customer toEntity() {
		return Customer.builder()
						.addr(this.getAddr())
						.id(this.getId())
						.name(this.getName())
						.phone(this.getPhone())
						.userid(this.getUserid())
						.userpw(this.getUserpw())
						.build();
	}
	
}
