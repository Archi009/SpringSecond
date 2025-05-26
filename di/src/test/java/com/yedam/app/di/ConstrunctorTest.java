package com.yedam.app.di;

import org.junit.Test;

public class ConstrunctorTest {
	@Test
	public void 기본생성자() {
		Employee emp = new Employee("길동","김", 2000);
		// emp.setLname("kim");
		
		System.out.println(emp);
	}
}
