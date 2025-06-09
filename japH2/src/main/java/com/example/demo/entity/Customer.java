package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//JPA 관련 import는 모두 jakarta로 시작
@Data
@Entity
@Builder
@NoArgsConstructor  //builder와 세트
@AllArgsConstructor //builder와 세트
@Table(name="cust") // 생성되는 table의 이름을 cust로 설정 할 수 있다.
public class Customer {
	@Id   // PK설정
	@GeneratedValue(strategy = GenerationType.AUTO)  // 오라클, 마이바티스의 seq를 설정하고 증가값을 받듯이 자동으로 생성되는 값으로 설정한다. 
	private Long id;
	@Column(length = 20, nullable = false)          // 컬럼의 vachar =20 , null 불가
	private String name;
	@Column(length = 20, nullable = false, unique = true) // 컬럼으 ㅣ길이 =20 , null 불가 , unique 설정
	private String phone;
	@Temporal(TemporalType.DATE)
	@Column(name="rdt")
	private Date reqDate;
	@Transient // 테이블 생성시 자동으로 제외 시킨다.
	private String desc;
	public Customer(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
}
