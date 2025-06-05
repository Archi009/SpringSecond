package com.example.demo.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.service.HelloResponseDto;

//Sprig boot 의 mvc test 하는 법
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
	
	@Autowired MockMvc mvc; //프록시
	
	@Test
	public void 안녕() throws Exception {
		String hello = "hello";
		
		mvc.perform(get( "/hello"))
		.andExpect(status().isOk())
		.andDo(print());
	}
	
	@Test
	public void 롬복테스트() {
		//given
		String name = "test";
		int amount = 1000;
		
		//when
		HelloResponseDto dto = new HelloResponseDto(name, amount);
		
		//then
		assertThat(dto.getName()).isEqualTo(name);
		assertThat(dto.getAmount()).isEqualTo(amount);
	}
	
	@Test
	public void helloDto리턴() throws Exception {
		
		String name = "hello";
		int amount = 10000;
		
		mvc.perform(get("/hello/dto").param("name", name)
									.param("amount", String.valueOf(amount)))
													.andExpect(status().isOk())
													.andExpect(jsonPath("$.name",is(name)))
													.andExpect(jsonPath("$.amount",is(amount)));
		
	}
	
	
	
}
