package com.yedam.board.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yedam.board.service.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Log4j2
@TestInstance(Lifecycle.PER_CLASS)
// Test for Controller
@WebAppConfiguration
@ExtendWith(SpringExtension.class)
@ContextConfiguration({"file:src/main/resources/spring/*-context.xml",
                       "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
public class ReplyControllerTests {

	@Setter(onMethod_ = { @Autowired })
	private WebApplicationContext ctx;

	private MockMvc mockMvc;

	@BeforeAll
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}

	@Test
	public void testpost() throws Exception {

		ReplyVO reply = new ReplyVO();
		reply.setBno(20L);
		reply.setReply("마이콜");
		reply.setReplyer("댓글작성");
		String jsonStr = new ObjectMapper().writeValueAsString(reply);
		mockMvc.perform(MockMvcRequestBuilders.post("/board/20/replies")
							.contentType(MediaType.APPLICATION_JSON_VALUE)
							.content(jsonStr))
		         .andDo(print());
		        
	}
	
	@Test
	public void testget() throws Exception {

//		ReplyVO reply = new ReplyVO();
//		reply.setBno(20L);
//		reply.setReply("마이콜");
//		reply.setReplyer("댓글작성");
//		String jsonStr = new ObjectMapper().writeValueAsString(reply);

	String str = 	mockMvc.perform(MockMvcRequestBuilders
							.get("/board/20/replies")
							.param("page", "1")
							.contentType(MediaType.APPLICATION_JSON_VALUE)
//							.content(jsonStr))
			 //  .andExpect(status().is(200)
							)
		       .andReturn().getResponse().getContentAsString();
		log.info(str);
//		         .andDo(print());
	}
	
	
	
	@Test
	public void testup() throws Exception {
		ReplyVO reply = new ReplyVO();
		reply.setRno(2);
		reply.setBno(20L);
		reply.setReply("바뀌니? 이게 뭐니");
		reply.setReplyer("댓글작성");
		String jsonStr = new ObjectMapper().writeValueAsString(reply);
		mockMvc.perform(MockMvcRequestBuilders.put("/board/20/replies")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(jsonStr))
				.andDo(print());
				
		
	}
	
	@Test
	public void testdel() throws Exception {
//		Long rno = 4L;
		mockMvc.perform(MockMvcRequestBuilders.delete("/board/20/replies/7"));
	}
		
	
	
	
}