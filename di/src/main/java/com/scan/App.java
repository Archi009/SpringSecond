package com.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yedam.app.di.ContextConfigure;

public class App {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("contextAnnotation.xml");
		// BoardController controller = (BoardController)ctx.getBean("board");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppicationConfigure.class);
		BoardController controller = (BoardController)ctx.getBean(BoardController.class);
		controller.insert();
	}
}
