package com.yedam.web;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/datasource-context.xml")
public class DataSourceTest {
	
	@Setter(onMethod_= {@Autowired}) 
	DataSource dataSource; // Connection Pool
	
	@Test
	public void 데이터소스연결() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			System.out.println(conn);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
