package com.yedam.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@EnableWebMvc
@ComponentScan(basePackages = { "com.yedam.app" })

public class ServletContextConfig implements WebMvcConfigurer {
	 
	 @Override	// jsp file mapping
	 public void configureViewResolvers(ViewResolverRegistry registry) {
	 InternalResourceViewResolver bean = new InternalResourceViewResolver();
	 bean.setViewClass(JstlView.class);
	 bean.setPrefix("/WEB-INF/views/");
	 bean.setSuffix(".jsp");
	 registry.viewResolver(bean);
	 }
	 @Override // url source mapping
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
		 //resources 위치
	 registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	 	//images 위치
	 registry.addResourceHandler("/images/**").addResourceLocations("/images/");
	 }
	 
	 @Bean //multiparte  resolver 설정
	  public MultipartResolver multipartResolver() {
	    StandardServletMultipartResolver resolver 
	              = new StandardServletMultipartResolver();
	    return resolver;
	  }
	 
}
