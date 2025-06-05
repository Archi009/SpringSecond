package com.yedam.app.sample;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.yedam.app.config.DataSourceConfig;
import com.yedam.app.config.MybatisConfig;
import com.yedam.app.config.RootConfig;
import com.yedam.app.mapper.TimeMapper;

import lombok.extern.log4j.Log4j2;


@Log4j2
@SpringJUnitConfig({RootConfig.class,MybatisConfig.class,DataSourceConfig.class})
public class DataSourceTest {
		
	@Autowired
	DataSource dataSource;
	
	@Autowired
	TimeMapper mapper;
	
	@Test 
	public void connectionTest() throws SQLException {
		Connection conn = dataSource.getConnection();
		log.info(conn);
	}
	
	@Test 
		public void getTime() {
		log.info("time : "+	mapper.getTime2());
	}
}
