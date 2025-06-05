package com.yedam.app.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(basePackages = "com.yedam.**.mapper")
public class MybatisConfig {
	
	@Autowired DataSource dataSource;
	
	@Bean
	 public SqlSessionFactory sqlSessionFactory() throws Exception {
	 SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
	 sqlSessionFactoryBean.setDataSource(dataSource);
	 //Mapper.xml의 위치(setMapperLocation)를 이렇게 지정하지 않는다면 Mapper.interface와 동일한 위치에 작성하여 인식 시킬 수 있다.
	 Resource[] resources = new PathMatchingResourcePatternResolver()
			 .getResources("classpath:/mappers/**/*.xml");
	 sqlSessionFactoryBean.setMapperLocations(resources);
	 
	 return sqlSessionFactoryBean.getObject();
	 }
	
}
