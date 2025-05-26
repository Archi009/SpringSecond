package com.yedam.message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Appjava 
{
    public static void main( String[] args )
    {
    	ApplicationContext  ctx =                  
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		MyController app = ctx.getBean("myApplication", MyController.class);
		app.processMessage("Hi~ douzone 2기!!", "happy@kosa.or.kr");
		
		
    }
}
