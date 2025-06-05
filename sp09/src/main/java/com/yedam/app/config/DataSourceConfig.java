package com.yedam.app.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement //transaction 을 위한 설정
public class DataSourceConfig {
	
	@Bean
	 public DataSource dataSource() {
	 HikariConfig hikariConfig = new HikariConfig();
	 hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	 hikariConfig.setJdbcUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
	 hikariConfig.setUsername("hr");
	 hikariConfig.setPassword("hr");
	 HikariDataSource dataSource = new HikariDataSource(hikariConfig);
	 return dataSource;
	 }
	
	@Bean //transaction을 위한 bean
	 public DataSourceTransactionManager txManager() {
	 return new DataSourceTransactionManager(dataSource());
	 }
	
}
