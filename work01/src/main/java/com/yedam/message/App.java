package com.yedam.message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext  ctx =                  
				new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		MyController app = ctx.getBean("myApplication", MyController.class);
		app.processMessage("Hi~ douzone 2기!!", "happy@kosa.or.kr");
		
		
    }
}
