package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class JapH2Application {

	public static void main(String[] args) {
		SpringApplication.run(JapH2Application.class, args);
	}

	@Bean // 서버가 시작 될 때 샘플 데이터 입력하기 위한 bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
//		save	a	few	customers
			repository.save(new Customer("Jack", "010"));
			repository.save(new Customer("Chloe", "111"));
			repository.save(new Customer("Kim", "222"));
			repository.save(new Customer("David", "333"));
			repository.save(new Customer("Michelle", "444"));
//		fetch	all	customers
			log.info("Customers	found	with	findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");
		};
	}

}
