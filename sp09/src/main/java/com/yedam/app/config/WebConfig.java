package com.yedam.app.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import jakarta.servlet.MultipartConfigElement;
import jakarta.servlet.ServletRegistration.Dynamic;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override // root-context
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { RootConfig.class, DataSourceConfig.class, MybatisConfig.class };
	}

	@Override // servlet-context
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { ServletContextConfig.class };
	}

	@Override // servlet mapping
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	}
	// override 하기위해 우클릭 source -> override... 필요한 것 검색 선택. 아래서 부터 위로 상속받는 관계;;
	@Override
	protected void customizeRegistration(Dynamic registration) {
		// TODO Auto-generated method stub
		super.customizeRegistration(registration);
		registration.setInitParameter("throwExceptionIfNoHandlerFound", "true");
																				//total파일 크기 /단일 파일 크기
		MultipartConfigElement multipartConfig = new MultipartConfigElement("c:/Temp", 200000, 400000, 200000);
		registration.setMultipartConfig(multipartConfig);
	}

}
